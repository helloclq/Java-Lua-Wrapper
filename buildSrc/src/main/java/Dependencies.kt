object Versions {
  const val kotlin = "1.7.21"

  const val AGP = "7.1.2"
  const val AGP_API = "7.1.2"
  const val ASM = "7.3.1"
  const val common_io = "2.7"

  const val cmake = "3.18.1"

  const val guava = "29.0-jre"
  const val zeroturnaround = "1.14"
  const val gson = "2.8.9"
  const val sqlite_jdbc = "3.34.0"
  const val r8 = "2.1.66"
}

object Group {
  const val commonGroup = "com.bytememo.lw"
}

object Artifacts {
  const val bm_global = "bm-global"

  const val bm_core = "bm-core"
  const val bm_runtime = "bm-runtime"

  const val bm_loader = "bm-loader"
  const val bm_script_manager = "bm-scriptmanager"
  const val bm_lua = "klsf"

  const val bm_gradle_plugin = "bm-gradle-plugin"
  const val bm_injection_plugin = "bm-patch-plugin"

  const val bm_extra_runtime = "bm-ext-runtime"
  const val bm_extra = "bm-ext"
}

object PublishVersions {
  val bm_core = "${System.getProperty(Artifacts.bm_global, "1.0.0")}"
  val bm_runtime = "${System.getProperty(Artifacts.bm_global, "1.0.0")}"
  val bm_loader = "${System.getProperty(Artifacts.bm_global, "1.0.0")}"
  val bm_script_manager = "${System.getProperty(Artifacts.bm_global, "1.0.0")}"
  val bm_lua = "${System.getProperty(Artifacts.bm_global, "1.0.0")}"

  val bm_gradle_plugin =
      "${System.getProperty(Artifacts.bm_global, "1.0.0")}"//bm_common_publish_version
val bm_injection_plugin =
      "${System.getProperty(Artifacts.bm_global, "1.0.0")}"//bm_common_publish_version


  val bm_extra_runtime = "${System.getProperty(Artifacts.bm_global, "1.0.0")}"
  val bm_extra = "${System.getProperty(Artifacts.bm_global, "1.0.0")}"
}


object Libs {
  val bm_core = "${Group.commonGroup}:${Artifacts.bm_core}:${PublishVersions.bm_core}"
  val bm_runtime = "${Group.commonGroup}:${Artifacts.bm_runtime}:${PublishVersions.bm_runtime}"
  val bm_loader = "${Group.commonGroup}:${Artifacts.bm_loader}:${PublishVersions.bm_loader}"
  val bm_script_manager =
      "${Group.commonGroup}:${Artifacts.bm_script_manager}:${PublishVersions.bm_script_manager}"
  val bm_lua = "${Group.commonGroup}:${Artifacts.bm_lua}:${PublishVersions.bm_lua}@aar"

  const val AGP = "com.android.tools.build:gradle:${Versions.AGP}"
  const val AGP_API = "com.android.tools.build:gradle-api:${Versions.AGP_API}"
  const val asm = "org.ow2.asm:asm:${Versions.ASM}"
  const val asm_util = "org.ow2.asm:asm-util:${Versions.ASM}"
  const val asm_commons = "org.ow2.asm:asm-commons:${Versions.ASM}"
  const val common_io = "commons-io:commons-io:${Versions.common_io}"

  const val guava = "com.google.guava:guava:${Versions.guava}"
  const val codec = "commons-codec:commons-codec:1.15"
  const val zeroturnaround = "org.zeroturnaround:zt-zip:${Versions.zeroturnaround}"
  const val sqlite_jdbc = "org.xerial:sqlite-jdbc:${Versions.sqlite_jdbc}"
  const val r8 = "com.android.tools:r8:${Versions.r8}"
  const val gson = "com.google.code.gson:gson:${Versions.gson}"

  val bm_extra_runtime =
      "${Group.commonGroup}:${Artifacts.bm_extra_runtime}:${PublishVersions.bm_extra_runtime}"
  val bm_extra = "${Group.commonGroup}:${Artifacts.bm_extra}:${PublishVersions.bm_extra}"

}


object Plugins {
  val bm_gradle_plugin =
      "${Group.commonGroup}:${Artifacts.bm_gradle_plugin}:${PublishVersions.bm_gradle_plugin}"
val bm_injection_plugin =
      "${Group.commonGroup}:${Artifacts.bm_injection_plugin}:${PublishVersions.bm_injection_plugin}"

  const val kotlin_android = "kotlin-android"
  const val kotlin_android_ext = "kotlin-android-extensions"
  const val kotlin_kapt = "kotlin-kapt"
}


object Android {
  const val compileSdkVersion = 33
  const val buildToolsVersion = "33.0.0"
  const val minSdkVersion = 21
  const val targetSdkVersion = 31
  const val ndkVersion = "23.1.7779620"


  const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
  const val kotlin_extension = "org.jetbrains.kotlin:kotlin-android-extensions-runtime:${Versions.kotlin}"
  const val kotlin_coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.0"
  const val kotlin_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.0"

  const val lifecycle = "androidx.lifecycle:lifecycle-extensions:2.1.0"
  const val lifecycleJava8 = "androidx.lifecycle:lifecycle-common-java8:2.1.0"
  const val supportAppcompatV7 = "androidx.appcompat:appcompat:1.0.0"

}