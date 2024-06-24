buildscript {
    repositories {
        mavenLocal()

        maven {
            setUrl("https://maven.aliyun.com/repository/public")
        }
        maven {
            credentials {
                setUsername("664dd6d1f5ac7fac9a9e7fe0")
                setPassword("************")
            }
            setUrl("https://packages.aliyun.com/664dd6f751a00cba2db2171f/maven/luareinforce-pub")
        }

        maven {
            isAllowInsecureProtocol = true
            //google jcenter mavencentral jitpack kotlinx
            setUrl("https://plugins.gradle.org/m2/")
        }
        google()
        maven { setUrl("https://jitpack.io") }
        mavenCentral()

        jcenter()
        maven {
            isAllowInsecureProtocol = true
            setUrl("https://mvnrepository.com/artifact/com.android.tools.lint/lint-gradle-api")
        }
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.21")
    }

    configurations.classpath {
        resolutionStrategy {
            force("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.21")
            force("org.jetbrains.kotlin:kotlin-stdlib:1.7.21")

        }
    }
}

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    mavenLocal()

    maven {
        isAllowInsecureProtocol = true
        //google jcenter mavencentral jitpack kotlinx
        setUrl("https://plugins.gradle.org/m2/")
    }
    google()
    maven { setUrl("https://jitpack.io") }
    mavenCentral()

    jcenter()
    maven {
        isAllowInsecureProtocol = true
        setUrl("https://mvnrepository.com/artifact/com.android.tools.lint/lint-gradle-api")
    }
}


val database by configurations.creating

dependencies {

    implementation("org.xerial:sqlite-jdbc:3.34.0")
    database("org.xerial:sqlite-jdbc:3.34.0")
    implementation(gradleApi())
    implementation(localGroovy())
    implementation("com.android.tools:r8:3.1.51")
    implementation("com.android.tools.build:gradle:7.1.2")
    api("com.android.tools:sdk-common:30.1.2")

    implementation("com.squareup.okhttp3:okhttp:4.9.0")
    implementation("org.jdom:jdom2:2.0.6")
    implementation("com.google.code.gson:gson:2.9.0")
    implementation("com.android.tools:sdk-common:30.1.2")
    implementation("com.android.tools.layoutlib:layoutlib-api:30.1.2")
    implementation("com.android.tools:annotations:30.1.2")

    api("org.ow2.asm:asm:7.3.1")
    api("org.javassist:javassist:3.26.0-GA")
    api("org.zeroturnaround:zt-zip:1.14")
    api("com.google.guava:guava:29.0-jre")
    api("commons-io:commons-io:2.7")
    implementation("com.alibaba:fastjson:1.2.58")
    implementation("net.sourceforge.jexcelapi:jxl:2.6.12")

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.7.21")

    implementation("org.ow2.asm:asm:9.0")
    implementation("org.ow2.asm:asm-analysis:9.0")
    implementation("org.ow2.asm:asm-commons:9.0")
    implementation("org.ow2.asm:asm-tree:9.0")
    implementation("org.ow2.asm:asm-util:9.0")
    implementation("com.google.guava:guava:30.1-jre")

    // https://mvnrepository.com/artifact/com.android.tools.build/aapt2-proto
    implementation("com.android.tools.build:aapt2-proto:7.3.1-8691043")
    // https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java
    implementation("com.google.protobuf:protobuf-java:3.21.9")

    implementation("org.apache.commons:commons-lang3:3.9")
    implementation("commons-io:commons-io:2.8.0")
    implementation("androidx.annotation:annotation:1.7.1")
}

