package com.journaler.activity

import com.journaler.Journaler
import com.journaler.R

/**
 * Created by rcopaga on 1/9/18.
 */

class ItemActivity : BaseActivity() {
    override val tag = Journaler.tag
    override fun getLayout() = R.layout.activity_main
    override fun getActivityTitle() = "TODO"
}