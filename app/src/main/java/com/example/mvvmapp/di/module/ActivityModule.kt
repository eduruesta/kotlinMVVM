package com.example.mvvmapp.di.module

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmapp.data.repository.TopHeadlineRepository
import com.example.mvvmapp.di.ActivityContext
import dagger.Module
import dagger.Provides
import com.example.mvvmapp.ui.base.ViewModelProviderFactory
import com.example.mvvmapp.ui.topheadline.TopHeadlineAdapter
import com.example.mvvmapp.ui.topheadline.TopHeadlineViewModel

@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return activity
    }

    @Provides
    fun provideTopHeadlineViewModel(topHeadlineRepository: TopHeadlineRepository): TopHeadlineViewModel {
        return ViewModelProvider(activity,
            ViewModelProviderFactory(TopHeadlineViewModel::class) {
                TopHeadlineViewModel(topHeadlineRepository)
            })[TopHeadlineViewModel::class.java]
    }

    @Provides
    fun provideTopHeadlineAdapter() = TopHeadlineAdapter(ArrayList())

}
