package com.sayzen.campfiresdk.models.cards.chat

import android.view.View
import android.view.ViewGroup
import com.dzen.campfire.api.models.units.chat.UnitChatMessage
import com.sayzen.campfiresdk.R
import com.sayzen.campfiresdk.controllers.ControllerApi
import com.sayzen.campfiresdk.controllers.ControllerCampfireSDK
import com.sayzen.campfiresdk.controllers.ControllerChats
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsResources
import com.sup.dev.android.views.views.ViewTextLinkable

class CardChatMessageSystem(
        unit: UnitChatMessage,
        onClick: ((UnitChatMessage) -> Boolean)? = null,
        onChange: ((UnitChatMessage) -> Unit)? = null,
        onQuote: ((UnitChatMessage) -> Unit)? = null,
        onGoTo: ((Long) -> Unit)?,
        onBlocked: ((UnitChatMessage) -> Unit)? = null
) : CardChatMessage(R.layout.card_chat_message_moderation, unit, onClick, onChange, onQuote, onGoTo, onBlocked) {

    init {
        quoteEnabled = false
    }

    override fun bindView(view: View) {
        super.bindView(view)
        val unit = xUnit.unit as UnitChatMessage

        val vSystemMessage: ViewTextLinkable = view.findViewById(R.id.vSystemMessage)
        val vTouchModeration: ViewGroup = view.findViewById(R.id.vTouchModeration)

        vTouchModeration.setOnClickListener { ControllerCampfireSDK.onToModerationClicked(unit.blockModerationEventId, 0, Navigator.TO) }
        vTouchModeration.isClickable = unit.blockModerationEventId != 0L

        vSystemMessage.visibility = View.VISIBLE
        vSystemMessage.setTextColor(ToolsResources.getColorAttr(R.attr.toolbar_content_color_secondary))

        if (unit.systemType == UnitChatMessage.SYSTEM_TYPE_BLOCK) vSystemMessage.setTextColor(ToolsResources.getColor(R.color.red_600))


        vSystemMessage.text = ControllerChats.getSystemText(unit)

        ControllerApi.makeLinkable(vSystemMessage)
    }

}
