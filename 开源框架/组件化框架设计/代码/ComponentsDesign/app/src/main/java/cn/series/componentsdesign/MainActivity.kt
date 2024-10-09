package cn.series.componentsdesign

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import cn.series.base.BaseTest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val baseTest =  BaseTest()
//        BuildConfig
        Log.d("lmx", BuildConfig.isRelease.toString())

    }
}
