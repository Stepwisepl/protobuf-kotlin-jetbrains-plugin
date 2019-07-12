group = "pl.stepwise"
version = "0.1-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}

buildscript {
    repositories { mavenCentral() }
    dependencies { classpath(kotlin("gradle-plugin", "1.2.30")) }
}

plugins {
    id("org.jetbrains.intellij") version "0.4.9"
    kotlin("jvm") version "1.2.30"
}

//TODO RGr: move versions to constants
intellij {
    updateSinceUntilBuild = false
    instrumentCode = true
    version = "2019.1"
    setPlugins("org.jetbrains.kotlin:1.3.11-release-IJ2018.3-1")
}