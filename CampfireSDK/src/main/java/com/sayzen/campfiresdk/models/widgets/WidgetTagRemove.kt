package com.dzen.campfire.screens.fandoms.tags

import android.widget.Button

import com.dzen.campfire.api.requests.tags.RTagsRemove
import com.sup.dev.android.libs.api_simple.ApiRequestsSupporter
import com.dzen.campfire.api.models.units.tags.UnitTag
import com.sayzen.campfiresdk.R
import com.sayzen.campfiresdk.controllers.ControllerCampfireSDK
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsToast
import com.sup.dev.android.views.settings.SettingsField
import com.sup.dev.android.views.support.watchers.TextWatcherChanged
import com.sup.dev.android.views.widgets.Widget

class WidgetTagRemove(
        private val tag: UnitTag
) : Widget(R.layout.widget_remove) {

    private val vComment: SettingsField = findViewById(R.id.vComment)
    private val vEnter: Button = findViewById(R.id.vEnter)
    private val vCancel: Button = findViewById(R.id.vCancel)

    init {

        vCancel.setOnClickListener { v -> hide() }
        vEnter.setOnClickListener { v -> sendRemove() }
        vComment.vField.addTextChangedListener(TextWatcherChanged { t -> updateFinishEnabled() })

        asSheetShow()
        updateFinishEnabled()
    }

    private fun updateFinishEnabled() {
        vEnter.isEnabled = vComment.getText().isNotEmpty()
    }

    override fun setEnabled(enabled: Boolean): WidgetTagRemove {
        super.setEnabled(enabled)
        vEnter.isEnabled = enabled
        vComment.isEnabled = enabled
        vCancel.isEnabled = enabled
        return this
    }

    private fun sendRemove() {

        ApiRequestsSupporter.executeEnabledConfirm(R.string.fandom_tags_remove_conf, R.string.app_remove, RTagsRemove(vComment.getText(), tag.id)) { r ->
            ToolsToast.show(R.string.app_done)
            ControllerCampfireSDK.onToTagsClicked(tag.fandomId, tag.languageId, Navigator.REPLACE)
            hide()
        }
    }


}
