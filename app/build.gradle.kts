
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.baoiaminnovations.baoiamapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.baoiaminnovations.baoiamapp"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.4")
    implementation("androidx.activity:activity-compose:1.9.1")
    implementation(platform("androidx.compose:compose-bom:2024.08.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.core:core-ktx:1.13.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2024.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    //NAVIGATION
    implementation("androidx.navigation:navigation-compose:2.7.7")

    //MATERIAL 3
    implementation("androidx.compose.material3:material3:1.2.1")

    // EXTENDED ICONS
    implementation("androidx.compose.material:material-icons-extended:1.6.8")

 
    // CONSTRAINT LAYOUT
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
 
    //COIL
    implementation("io.coil-kt:coil-compose:2.6.0")

    //FIREBASE
    implementation(platform("com.google.firebase:firebase-bom:33.2.0"))
    implementation("com.google.firebase:firebase-analytics")

    //FIREBASE AUTHENTICATION
    implementation("com.google.firebase:firebase-auth")

    //FIREBASE FIRESTORE
    implementation("com.google.firebase:firebase-firestore")

    //FIREBASE STORAGE
    implementation("com.google.firebase:firebase-storage")

    // GOOGLE PLAY SERVICES
    implementation("com.google.android.gms:play-services-auth:21.2.0")

    // HILT
    implementation("com.google.dagger:hilt-android:2.44")
   kapt ("com.google.dagger:hilt-compiler:2.44")

    //LIVE DATA
    implementation ("androidx.compose.runtime:runtime-livedata:1.6.8")



}