package com.sayzen.campfiresdk.models.objects

import androidx.annotation.StringRes
import com.dzen.campfire.api.models.lvl.LvlInfo
import com.sayzen.campfiresdk.R

import com.sup.dev.android.tools.ToolsResources

class AppLevel constructor(
        val lvl: LvlInfo,
        @param:StringRes private val textRes: Int,
        val colorRes: Int = R.color.green_500
) {

    constructor(lvl: LvlInfo, textRes: Int) : this(lvl, textRes, R.color.green_500)

    constructor(textRes: Int, lvl: LvlInfo, colorRes: Int) : this(lvl, textRes, colorRes)

    val text: String
        get() = ToolsResources.s(textRes)

}