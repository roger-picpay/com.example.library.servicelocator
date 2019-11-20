package com.example.librarysample

import android.app.Application
import com.example.servicelocator.ServiceLocator.serviceLocatorPutNewInstance

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        serviceLocatorPutNewInstance(User("User"))
    }

}