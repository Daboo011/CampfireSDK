package com.sayzen.campfiresdk.screens.rates

import android.view.View
import android.widget.TextView
import com.dzen.campfire.api.models.Rate
import com.sayzen.campfiresdk.R
import com.sayzen.campfiresdk.adapters.XAccount
import com.sup.dev.android.tools.ToolsImagesLoader
import com.sup.dev.android.tools.ToolsResources
import com.sup.dev.android.views.cards.CardAvatar
import com.sup.dev.android.views.support.adapters.NotifyItem
import com.sup.dev.android.views.views.ViewAvatarTitle

class CardRate(
        val rate: Rate
) : CardAvatar(), NotifyItem {

    private val xAccount = XAccount(rate.accountId, rate.accountName, rate.accountImageId, rate.accountLvl, rate.accountLastOnlineTime){
        update()
    }

    override fun getLayout() = R.layout.card_rate

    override fun bindView(view: View) {
        super.bindView(view)

        val vRate: TextView = view.findViewById(R.id.vRate)

        vRate.text = (rate.karmaCount / 100).toString()
        vRate.setTextColor(ToolsResources.getColor(if (rate.karmaCount > 0L) R.color.green_700 else R.color.red_700))
    }

    override fun onBind(vAvatar: ViewAvatarTitle) {
        xAccount.setView(vAvatar)
    }

    override fun notifyItem() {
        ToolsImagesLoader.load(rate.fandomImageId).intoCash()
    }
}
