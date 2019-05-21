package com.sayzen.campfiresdk.adapters

import android.widget.ImageView
import android.widget.TextView
import com.dzen.campfire.api.models.Fandom
import com.sayzen.campfiresdk.controllers.ControllerApi
import com.sayzen.campfiresdk.controllers.ControllerCampfireSDK
import com.sayzen.campfiresdk.models.events.fandom.EventFandomChanged
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsImagesLoader
import com.sup.dev.android.tools.ToolsResources
import com.sup.dev.android.views.views.ViewAvatar
import com.sup.dev.android.views.views.ViewAvatarTitle
import com.sup.dev.java.libs.eventBus.EventBus
import com.sup.dev.java.tools.ToolsDate

class XFandom(
        var fandomId: Long,
        var languageId: Long,
        var name: String,
        var imageId: Long,
        var imageTitleId: Long,
        var imageTitleGifId: Long,
        var date: Long,
        var onChanged: () -> kotlin.Unit
) {

    var showLanguage = true

    private val eventBus = EventBus
            .subscribe(EventFandomChanged::class) { onEventFandomChanged(it) }

    constructor(fandom: Fandom, date: Long = 0, onChanged: () -> Unit)
            : this(fandom.id, fandom.languageId, fandom.name, fandom.imageId, fandom.imageTitleId, fandom.imageTitleGifId, date, onChanged)

    constructor(unit: com.dzen.campfire.api.models.units.Unit, date: Long = 0, onChanged: () -> Unit)
            : this(unit.fandomId, unit.languageId, unit.fandomName, unit.fandomImageId, 0, 0, date, onChanged)

    constructor(fandomId: Long, languageId: Long, name: String = "", imageId: Long = 0L, onChanged: () -> Unit)
            : this(fandomId, languageId, name, imageId, 0, 0, 0, onChanged)

    init {
        ToolsImagesLoader.load(imageId).intoCash()
    }

    fun setView(viewAvatar: ViewAvatar) {
        ToolsImagesLoader.load(imageId).into(viewAvatar.vImageView)
        viewAvatar.setChipText(if (showLanguage && languageId > 0) ControllerApi.getLanguage(languageId).code else "")
        viewAvatar.vChip.setBackgroundColor(ToolsResources.getAccentColor(viewAvatar.context))
        viewAvatar.setOnClickListener { v -> ControllerCampfireSDK.onToFandomClicked(fandomId, languageId, Navigator.TO) }
    }

    fun setView(viewAvatar: ViewAvatarTitle) {
        setView(viewAvatar.vAvatar)

        if (name.isNotEmpty()) viewAvatar.setTitle(name)
        if (date != 0L) viewAvatar.setSubtitle(ToolsDate.dateToStringCustom(date))
    }

    fun setView(vText: TextView, vImage: ImageView?, vImageBig: ImageView? = null) {
        setView(vText)
        if (vImage != null) setView(vImage)
        if (vImageBig != null) setViewBig(vImageBig)
    }

    fun setViewBig(vImage: ImageView) {
        if (imageTitleId != 0L) ToolsImagesLoader.loadGif(imageTitleId, imageTitleGifId, 0, 0, vImage, null)
        else vImage.setImageBitmap(null)
    }

    fun setView(vImage: ImageView) {
        ToolsImagesLoader.load(imageId).into(vImage)
    }

    fun setView(vText: TextView) {
        vText.text = name
    }

    //
    //  EventBus
    //

    private fun onEventFandomChanged(e: EventFandomChanged) {
        if (e.fandomId == fandomId) {
            if (e.name.isNotEmpty()) name = e.name
            if (e.imageId != -1L) imageId = e.imageId
            if (e.imageTitleId != -1L) imageTitleId = e.imageTitleId
            if (e.imageTitleGifId != -1L) imageTitleGifId = e.imageTitleGifId
            onChanged.invoke()
        }
    }

    //
    //  Getters
    //

    fun linkTo() = ControllerApi.linkToFandom(fandomId)

    fun linkToWithLanguage() = ControllerApi.linkToFandom(fandomId, languageId)


}
