plugins {
    id(BuildPlugins.androidLibrary)
    id(BuildPlugins.kotlinAndroid)
}

android {
    namespace = "com.allaber.navigation"
    compileSdk = ConfigData.compileSdk

    defaultConfig {
        minSdk = ConfigData.minSdk
        consumerProguardFiles(ConfigData.proguardRules)
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(ConfigData.proguardAndroid),
                ConfigData.proguardRules
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
    api(Deps.navigationFragment)
    api(Deps.navigationUi)
    api(Deps.fragment)
}
