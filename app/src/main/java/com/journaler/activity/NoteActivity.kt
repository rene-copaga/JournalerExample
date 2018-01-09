package com.journaler.activity

import com.journaler.Journaler
import com.journaler.R

/**
 * Created by rcopaga on 1/9/18.
 */
class NoteActivity : BaseActivity() {
    override val tag = "Note activity"
    override fun getLayout() = R.layout.activity_note
    override fun getActivityTitle() = "TODO"
}