plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(AppConfig.compileSdk)
    buildToolsVersion(AppConfig.buildToolsVersion)

    defaultConfig {
        applicationId = "tech.imsk17.template"
        minSdkVersion(AppConfig.minSdk)
        targetSdkVersion(AppConfig.compileSdk)
        versionCode(AppConfig.versionCode)
        versionName(AppConfig.versionName)

        testInstrumentationRunner = AppConfig.androidTestInstrumentation
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    viewBinding {
        android.buildFeatures.viewBinding = true
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Android UI Libraries
    implementation(AppDependencies.appcompat)
    implementation(AppDependencies.constraintLayout)
    implementation(AppDependencies.coreKtx)
    implementation(AppDependencies.material)

    // Test Libraries
    testImplementation(AppDependencies.junit)
    testImplementation(AppDependencies.extJUnit)
    testImplementation(AppDependencies.espressoCore)

}