plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.allaber.test"
    compileSdk = ConfigData.compileSdk

    defaultConfig {
        applicationId = "com.allaber.test"
        minSdk = ConfigData.minSdk
        targetSdk = ConfigData.targetSdk
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = ConfigData.sourceCompatibility
        targetCompatibility = ConfigData.targetCompatibility
    }
    kotlinOptions {
        jvmTarget = ConfigData.jvmTarget
    }
}

dependencies {
    implementation(projects.domain)
    implementation(projects.data)
    implementation(projects.ui.assets)
    implementation(projects.ui.localization)
    implementation(projects.ui.system)

    implementation(Deps.coreKtx)
    implementation(Deps.appcompat)
    implementation(Deps.material)
    implementation(Deps.constraintLayout)
}