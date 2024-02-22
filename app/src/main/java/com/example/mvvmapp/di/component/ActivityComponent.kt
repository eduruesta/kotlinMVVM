package com.example.mvvmapp.di.component

import com.example.mvvmapp.di.ActivityScope
import com.example.mvvmapp.di.module.ActivityModule
import com.example.mvvmapp.ui.topheadline.TopHeadlineActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}