plugins {
    kotlin("js") version "1.6.10"
}

group = "me.dmitry"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



kotlin {
    js(IR) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}

rootProject.plugins.withType<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin> {
    rootProject.the<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension>().nodeVersion = "16.0.0"
}