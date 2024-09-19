// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.5.1" apply false
    id("org.jetbrains.kotlin.android") version "2.0.20" apply false
}

buildscript {
    dependencies {
        // Add this line
        classpath("com.google.gms:google-services:4.4.2")
    }
}