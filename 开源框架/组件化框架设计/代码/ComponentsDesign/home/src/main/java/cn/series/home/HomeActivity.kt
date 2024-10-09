package cn.series.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import cn.series.common.RecordPathManager

class HomeActivity : ComponentActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_layout)

        findViewById<Button>(R.id.ktvButton).setOnClickListener(this)
        findViewById<Button>(R.id.mallButton).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.ktvButton ->
//                goto("cn.series.ktv.KtvNewsActivity")
                gotoByRecord("ktv", "KtvNewsActivity")
            R.id.mallButton ->
//                goto("cn.series.mall.MallActivity")
                gotoByRecord("mall", "MallActivity")
        }
    }

    // 通过反射的方式跳转到制定到子模块
    private fun goto(path : String){
        val clazz = Class.forName(path)
        val intent = Intent(this, clazz)
        startActivity(intent)
        finish()
    }

    private fun gotoByRecord(groupName: String, pathName: String){
        val clazz = RecordPathManager.getClass(groupName, pathName)
        val intent = Intent(this, clazz)
        startActivity(intent)
        finish()
    }
}
