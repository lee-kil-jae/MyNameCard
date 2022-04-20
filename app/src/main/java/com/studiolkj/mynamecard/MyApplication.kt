package com.studiolkj.mynamecard

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco
import com.mazenrashed.printooth.Printooth
import com.studiolkj.mynamecard.common.MyNameCardValue
import com.studiolkj.mynamecard.common.myDiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication: Application() {

    companion object {
        val TAG = "MyApplication"
        lateinit var prefs: MyNameCardValue
    }

    override fun onCreate() {
        super.onCreate()

        // init Preference
        prefs = MyNameCardValue(applicationContext)

        // init printooth
        Printooth.init(applicationContext)

        // init Fresco
        Fresco.initialize(applicationContext)

        // init Koin
        startKoin {
            androidContext(applicationContext)
            modules(myDiModule)
        }
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}