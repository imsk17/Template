object AppDependencies {
    // Android UI
    const val appcompat = "androidx.appcompat:appcompat:${Versions.Libs.appCompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.Libs.coreKtx}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.Libs.constraintLayout}"
    const val material =
        "com.google.android.material:material:${Versions.Libs.material}"
    // Test Libs
    const val junit = "junit:junit:${Versions.Test.junit}"
    const val extJUnit = "androidx.test.ext:junit:${Versions.Test.extJunit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.Test.espresso}"
}