// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        mavenCentral()
        google()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:8.13.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.21")
        classpath(libs.hiltPlugin)
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
    }
}

extra["compileSdkVersion"] = 35
extra["targetSdkVersion"] = 35
extra["minSdkVersion"] = 21
extra["versionCode"] = 23
extra["versionName"] = "3.1.1"
