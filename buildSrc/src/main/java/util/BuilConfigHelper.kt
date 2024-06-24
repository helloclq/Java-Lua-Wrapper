package util

import org.gradle.api.invocation.Gradle

object BuilConfigHelper {

  private lateinit var mGradle: Gradle

  init {
    // deps包名非法，setting.gradle无法引用  这里从confighelper间接初始化一下deps
  }

  fun init(gradle: Gradle) {
    mGradle = gradle
  }

  /**
   * 是否使用远程的库
   */
  @JvmStatic
  fun useRemoteLib(): Boolean {
    return System.getProperty("useRemote", "false") == "true"
  }

  /**
   * 是否使用远程的库
   */
  @JvmStatic
  fun useOneSo(): Boolean {
    return System.getProperty("BUILD_ONE_SO", "false") == "true"
  }

  @JvmStatic
  fun rootPath(): String {
    return System.getProperty("rootPath","")
  }


}