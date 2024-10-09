package cn.series.componentsdesign

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import cn.series.home.HomeActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("lmx", BuildConfig.isRelease.toString())
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}
