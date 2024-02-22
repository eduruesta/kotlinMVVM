package com.example.mvvmapp

import android.app.Application
import com.example.mvvmapp.di.component.ApplicationComponent
import com.example.mvvmapp.di.component.DaggerApplicationComponent
import com.example.mvvmapp.di.module.ApplicationModule
import dagger.android.DaggerApplication


class MVVMApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent


    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}