package com.example.cloudfunctiondemo

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions

class MApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
        FirebaseApp.initializeApp(
            this,
            FirebaseOptions.Builder()
                .setProjectId("cloud-function-demo-2nd")
                .setApplicationId("1:808113357633:android:9139e087887a75e83ad7c0")
                .setApiKey("AIzaSyC96FJAZdjXT7Xec1OJktJij0gKIs-WvyU")
                .build(),
            "2nd_app"
        )
    }
}
