group = "pl.stepwise"
version = "0.1-SNAPSHOT"

buildscript {
    repositories { mavenCentral() }
    dependencies { classpath(kotlin("gradle-plugin", "1.2.30")) }
}

plugins {
    id("org.jetbrains.intellij") version "0.4.9"
    kotlin("jvm") version "1.2.30"
}

intellij {
    updateSinceUntilBuild = false
    instrumentCode = true
    version = "2017.3"
}