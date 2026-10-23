plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "fr.c4.launcher"
    compileSdk = 34

    defaultConfig {
        applicationId = "fr.c4.launcher"
        minSdk = 26
        targetSdk = 30 // Android 11 (TS18 head unit)
        versionCode = 1
        versionName = "1.0"
        // Web interface address. Replace with your published URL.
        buildConfigField("String", "LAUNCHER_URL", "\"https://roadbeat-stereo-dash.lovable.app/\"")
    }

    buildFeatures { buildConfig = true }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}
