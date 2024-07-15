// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.google.gms.google.services) apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = uri {"https://jitpack.io"}}
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:7.0.0")

    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri {"https://jitpack.io"}}
        maven { url = uri {"https://maven.google.com/"}}
    }
}

//task clean(type: Delete) {
//    delete rootProject.buildDir
//}