// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        mavenCentral()
        google()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:9.1.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.1.10")
        classpath(libs.hiltPlugin)
    }
}
plugins {
    id("com.android.application") version "9.1.0" apply false
    id("com.android.library") version "9.1.0" apply false
    kotlin("android") version "2.1.10" apply false
    id("com.google.dagger.hilt.android") version "2.59.2" apply false
    id("com.google.devtools.ksp") version "2.1.10-1.0.29" apply false
}

extra["compileSdkVersion"] = 35
extra["targetSdkVersion"] = 35
extra["minSdkVersion"] = 21
extra["versionCode"] = 23
extra["versionName"] = "3.1.1"
