buildscript {
    repositories {
        mavenCentral()
    }

    val afuVersion = project.properties["atomicFuVersion"] ?: "0.23.1"

    dependencies {
        classpath("org.jetbrains.kotlinx:atomicfu-gradle-plugin:$afuVersion")
    }
}

plugins {
    application
    kotlin("jvm") version "1.9.22"
}

apply(plugin = "kotlinx-atomicfu")

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("org.example.MainKt")
}
