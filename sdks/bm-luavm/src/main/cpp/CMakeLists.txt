project(${TARGET} LANGUAGES C)
cmake_minimum_required(VERSION 3.10.1)
set(TARGET bm_lw)
set(CMAKE_C_FLAGS "-std=c99")

if(${LUA_LOCK_THREAD})
	add_definitions(-DLUA_LOCK_THREAD)
endif()

#if(${OPT_SO_SIZE})
	add_compile_options(-Oz)
	set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Oz ")
#endif()

if(${USE_SOCKET})
	add_definitions(-DKLFS_INTERNAL)
endif()

include(cmake_common/CMakeLists.txt)

if (DEFINED LVM_INTERNAL)
	#包含头文件: include_directories()添加头文件路径到编译器的头文件搜索路径下，多个路径以空格分隔
	include_directories(lua  tolua  luasocket)
	aux_source_directory(lua SRC_LUA)
	aux_source_directory(tolua SRC_TOLUA)
	aux_source_directory(luasocket SRC_LUA_SOCKET)
	set(SRC_FOLDER  ${SRC_LUA}  ${SRC_TOLUA} ${SRC_LUA_SOCKET} )

	add_compile_definitions(LVM_INTERNAL)
else()
	include_directories(lua  tolua   )

	aux_source_directory(lua SRC_LUA)
	aux_source_directory(tolua SRC_TOLUA)
	set(SRC_FOLDER   ${SRC_LUA}  ${SRC_TOLUA} )
endif()


message(LUA_VM_MODULE_PATH = ${LUA_VM_MODULE_PATH})
add_library(${TARGET}
		SHARED
		${SRC_FOLDER}
		)

if (${USE_LOG})
	set_target_properties(${TARGET} PROPERTIES COMPILE_FLAGS "-g" LINK_FLAGS "-g")
endif ()

message( "Build Type: ${CMAKE_BUILD_TYPE}")

#set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${LUA_VM_MODULE_PATH}/lua-vm-so/jniLibs/${BUILD_TYPE}/${ANDROID_ABI})
#1. so输出路径 CMAKE_LIBRARY_OUTPUT_DIRECTORY
#2. .a 静态库输出路径 CMAKE_ARCHIVE_OUTPUT_DIRECTORY
#设置${native_lib_name}库编译输出路径
set_target_properties(${TARGET}
		PROPERTIES
		LIBRARY_OUTPUT_DIRECTORY
		"${LUA_VM_MODULE_PATH}/lua-vm-so/jniLibs/${BUILD_TYPE}/${ANDROID_ABI}")


#拷贝库文件.
add_custom_command(TARGET ${TARGET} POST_BUILD
		COMMAND "${CMAKE_COMMAND}" -E
		copy "${LUA_VM_MODULE_PATH}/lua-vm-so/jniLibs/${BUILD_TYPE}/${ANDROID_ABI}/lib${TARGET}.so"
		"${SDKS_PATH}sdks/lua-vm-export/vibs/${BUILD_TYPE}/${ANDROID_ABI}/lib${TARGET}.bb"
		COMMENT "Copying ${TARGET} to output directory")
