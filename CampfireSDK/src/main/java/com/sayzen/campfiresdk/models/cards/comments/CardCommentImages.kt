package com.sayzen.campfiresdk.models.cards.comments

import android.view.View
import com.dzen.campfire.api.models.UnitComment
import com.sayzen.campfiresdk.R
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsView
import com.sup.dev.android.views.screens.SImageView
import com.sup.dev.android.views.views.ViewImagesSwipe

class CardCommentImages(
        unit: UnitComment,
        dividers: Boolean,
        onClick: ((UnitComment) -> Boolean)? = null,
        onQuote: ((UnitComment) -> Unit)? = null,
        onGoTo: ((Long) -> Unit)?
) : CardComment(unit, dividers, onClick, onQuote, onGoTo) {

    override fun getLayout() = R.layout.card_comment_images

    override fun bind(view: View) {

        val vImages: ViewImagesSwipe = view.findViewById(R.id.vImages)

        ToolsView.setOnLongClickCoordinates(vImages) { view1, x, y -> popup?.asSheetShow() }
        vImages.setOnClickListener { Navigator.to(SImageView(unit.imageId)) }
        vImages.clear()

        for (i in 0 until unit.imageIdArray.size) {
            vImages.add(unit.imageIdArray[i], unit.imageIdArray[i], unit.imageWArray[i], unit.imageHArray[i],
                    null,
                    { id -> popup?.asSheetShow() }
            )
        }
    }
}