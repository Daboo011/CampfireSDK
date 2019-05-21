package com.sayzen.campfiresdk.models.cards.post_pages

import android.view.View

import com.dzen.campfire.api.models.units.post.PageText
import com.sayzen.campfiresdk.R
import com.sayzen.campfiresdk.controllers.ControllerApi
import com.sup.dev.android.views.views.ViewTextLinkable

class CardPageText(page: PageText) : CardPage(page) {

    override fun getLayout() = R.layout.card_page_text

    override fun bindView(view: View) {
        super.bindView(view)
        val vText: ViewTextLinkable = view.findViewById(R.id.vText)
        vText.setTextIsSelectable(clickable)

        vText.text = (page as PageText).text
        vText.textSize = (if ((page as PageText).size == PageText.SIZE_0) 14 else 21).toFloat()
        ControllerApi.makeLinkable(vText)
    }

    override fun notifyItem() {}
}
