package cn.series.ktv

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import cn.series.common.RecordPathManager

class KtvNewsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ktv_layout)

        findViewById<Button>(R.id.back).setOnClickListener {
            // 会去 home 界面
            /*
                val clazz = Class.forName("cn.series.home.HomeActivity")
                val intent = Intent(this, clazz)
                startActivity(intent)
                finish()
            */

            val clazz = RecordPathManager.getClass("home", "HomeActivity")
            val intent = Intent(this, clazz)
            startActivity(intent)
            finish()

        }
    }
}
