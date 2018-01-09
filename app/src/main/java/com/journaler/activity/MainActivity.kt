package com.journaler.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.journaler.Journaler
import com.journaler.R

/**
 * Created by rcopaga on 1/9/18.
 */
class MainActivity : BaseActivity() {
    override val tag = Journaler.tag
    override fun getLayout() = R.layout.activity_main
    override fun getActivityTitle() = R.string.app_name.toString()
}