cmake_minimum_required(VERSION 3.1.0)


# liblua
include_directories(lua)
include_directories(tolua)

file(GLOB LIB_SRCS 	"./lua/*.c" "./tolua/*.c")
list(REMOVE_ITEM LIB_SRCS "./lua/luac.c")

file(GLOB_RECURSE LIB_INCLUDES "./*.h")


if (NOT DEFINED EDITOR_USER)
	set(EDITOR_USER "epiboly")
endif()
if (EDITOR_USER STREQUAL "develop")
	set(EDITOR_PATH ${CMAKE_SOURCE_DIR}/../editor)
endif()
set(LIBRARY_OUTPUT_PATH ${EDITOR_PATH}/3rdlib)
add_library(liblua STATIC ${LIB_SRCS} ${LIB_INCLUDES})
