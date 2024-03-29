package com.sayzen.campfiresdk.models.cards.chat

import android.view.Gravity
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.dzen.campfire.api.models.units.chat.UnitChatMessage
import com.sayzen.campfiresdk.R
import com.sayzen.campfiresdk.controllers.ControllerApi
import com.sayzen.campfiresdk.screens.account.stickers.SStickersView
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsImagesLoader
import com.sup.dev.android.tools.ToolsView
import com.sup.dev.java.tools.ToolsDate
import com.sup.dev.java.tools.ToolsHTML
import com.sup.dev.java.tools.ToolsText

class CardChatMessageSticker(
        unit: UnitChatMessage,
        onClick: ((UnitChatMessage) -> Boolean)? = null,
        onChange: ((UnitChatMessage) -> Unit)? = null,
        onQuote: ((UnitChatMessage) -> Unit)? = null,
        onGoTo: ((Long) -> Unit)?,
        onBlocked: ((UnitChatMessage) -> Unit)? = null
) : CardChatMessage(R.layout.card_chat_message_sticker, unit, onClick, onChange, onQuote, onGoTo, onBlocked) {

    init {
        useMessageContainerBackground = false
        changeEnabled = false
        copyEnabled = false
    }

    override fun bindView(view: View) {
        super.bindView(view)
        val unit = xUnit.unit as UnitChatMessage

        val vImage: ImageView = view.findViewById(R.id.vImage)
        val vGifProgressBar: View = view.findViewById(R.id.vGifProgressBar)
        val vLabelImageAnswer: TextView = view.findViewById(R.id.vLabelImageAnswer)

        val myName = ControllerApi.account.name
        if (unit.text.startsWith(myName)) vLabelImageAnswer.text =ToolsHTML.font_color(myName, "#ff6d00")
        else vLabelImageAnswer.text = unit.text
        ToolsView.makeTextHtml(vLabelImageAnswer)

        vLabelImageAnswer.visibility = if (unit.text.isEmpty()) GONE else VISIBLE
        vLabelImageAnswer.setOnClickListener {
            if (onGoTo != null) {
                if (unit.quoteId > 0) onGoTo!!.invoke(unit.quoteId)
                else if (unit.parentUnitId > 0) onGoTo!!.invoke(unit.parentUnitId)
            }
        }


        ToolsView.setOnLongClickCoordinates(vImage) { _, _, _ -> showMenu() }

        vImage.setOnClickListener(null)

        ToolsImagesLoader.loadGif(unit.stickerImageId, unit.stickerGifId, unit.imageW, unit.imageH, vImage, vGifProgressBar, 1.7f)
        vImage.setOnClickListener { SStickersView.instanceBySticker(unit.stickerId, Navigator.TO) }

        if (ControllerApi.isCurrentAccount(unit.creatorId)) {
            (vLabelImageAnswer.layoutParams as FrameLayout.LayoutParams).gravity = Gravity.LEFT or Gravity.TOP
        } else {
            (vLabelImageAnswer.layoutParams as FrameLayout.LayoutParams).gravity = Gravity.RIGHT or Gravity.TOP
        }

    }


}