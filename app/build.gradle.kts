plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    kotlin("kapt")
}
android {
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}