package com.journaler.activity

import com.journaler.Journaler
import com.journaler.R

/**
 * Created by rcopaga on 1/9/18.
 */
class TodoActivity : BaseActivity() {
    override val tag = "Todo activity"
    override fun getLayout() = R.layout.activity_todo
    override fun getActivityTitle() = "TODO"
}