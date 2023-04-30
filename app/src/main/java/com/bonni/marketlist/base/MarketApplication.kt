package com.bonni.marketlist.base

import android.app.Application
import org.koin.core.context.startKoin

class MarketApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin(appModules)
    }
}