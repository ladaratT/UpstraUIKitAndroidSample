package com.ekoapp.chatkitmessagelistactivity

import android.app.Application
import com.ekoapp.ekosdk.EkoClient

class ChatkitMsgListActivityApp: Application() {

    /**
     * Replace with actual api key [String]
     */
    val TEST_KEY = "b3bab95b3edbf9661a368518045b4481d35cdfeaec35677d"

    override fun onCreate() {
        super.onCreate()
        /**
         * Setup call to initialize the SDK
         */
        EkoClient.setup(TEST_KEY)
    }
}