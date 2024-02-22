package com.example.mvvmapp.di.component

import android.content.Context
import com.example.mvvmapp.MVVMApplication
import com.example.mvvmapp.data.api.NetworkService
import com.example.mvvmapp.data.repository.TopHeadlineRepository
import com.example.mvvmapp.di.ApplicationContext
import com.example.mvvmapp.di.module.ApplicationModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MVVMApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineRepository

}