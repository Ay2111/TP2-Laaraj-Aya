// build.gradle.kts (Project: TP2AndroidApp)
plugins {
    alias(libs.plugins.android.application) apply false
    // Correction ici : on retire "jetbrains" car dans le TOML on l'a appelé "kotlin-android"
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}