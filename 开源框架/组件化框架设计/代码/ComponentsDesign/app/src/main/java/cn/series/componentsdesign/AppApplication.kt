package cn.series.componentsdesign

import cn.series.base.BaseApplication
import cn.series.common.RecordPathManager
import cn.series.home.HomeActivity
import cn.series.ktv.KtvNewsActivity
import cn.series.mall.MallActivity

class AppApplication: BaseApplication() {

    override fun onCreate() {
        super.onCreate()
        // 组册进来
        RecordPathManager.registerRecord("home","HomeActivity", HomeActivity::class.java)
        RecordPathManager.registerRecord("ktv","KtvNewsActivity", KtvNewsActivity::class.java)
        RecordPathManager.registerRecord("mall","MallActivity", MallActivity::class.java)
    }
}