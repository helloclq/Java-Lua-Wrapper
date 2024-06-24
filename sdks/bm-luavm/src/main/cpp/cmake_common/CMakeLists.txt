Function(findDirPath inputDir   result)
    # remove last end of "/"
    string(REGEX REPLACE "/$" "" CURRENT_FOLDER_ABSOLUTE ${CMAKE_CURRENT_SOURCE_DIR})
    string(REGEX REPLACE "(.*)/(.*)" "\\1" CURRENT_FOLDER ${CURRENT_FOLDER_ABSOLUTE})

    string(FIND ${CURRENT_FOLDER_ABSOLUTE} "${inputDir}" FEATURE_LOCATION   )
    string(LENGTH  ${inputDir} FEATURE_LEN   )
    string(SUBSTRING  ${CURRENT_FOLDER_ABSOLUTE} 0  ${FEATURE_LOCATION}   APP_PATH   )
    math(EXPR value "${FEATURE_LOCATION} +  ${FEATURE_LEN}")
    string(SUBSTRING  ${CURRENT_FOLDER_ABSOLUTE} 0    ${value}  FEATURE_PATH  )
    set( "${result}"  ${APP_PATH}   PARENT_SCOPE)
endfunction(findDirPath)

findDirPath("bm-luavm/src" RESULT_PATH)
findDirPath("sdks/bm-luavm" SDKS_PATH)

set (LUA_VM_MODULE_PATH ${RESULT_PATH}bm-luavm)
set (FOLDER_MODULES ${RESULT_PATH}sdks)



