package com.sayzen.campfiresdk.models.cards.stickers

import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.view.View
import android.widget.ImageView
import com.dzen.campfire.api.models.units.stickers.UnitSticker
import com.sayzen.campfiresdk.R
import com.sayzen.campfiresdk.adapters.XKarma
import com.sayzen.campfiresdk.controllers.ControllerUnits
import com.sayzen.campfiresdk.models.cards.CardUnit
import com.sup.dev.android.tools.ToolsImagesLoader
import com.sup.dev.android.tools.ToolsResources
import com.sup.dev.android.tools.ToolsView
import com.sup.dev.java.classes.Subscription
import com.sup.dev.java.classes.animation.AnimationPendulum
import com.sup.dev.java.classes.animation.AnimationPendulumColor
import com.sup.dev.java.libs.eventBus.EventBus
import com.sup.dev.java.tools.ToolsColor
import com.sup.dev.java.tools.ToolsThreads

class CardSticker(
        override val unit: UnitSticker
) : CardUnit(unit) {

    private val eventBus = EventBus

    private val xKarma = XKarma(unit) { update() }
    private var flash = false
    private var animationFlash: AnimationPendulumColor? = null
    private var subscriptionFlash: Subscription? = null

    override fun getLayout() = R.layout.card_sticker

    override fun bindView(view: View) {
        super.bindView(view)

        val vImage: ImageView = view.findViewById(R.id.vImage)
        val vProgress: View = view.findViewById(R.id.vProgress)
        val vRootContainer: View = view.findViewById(R.id.vRootContainer)

        ToolsImagesLoader.loadGif(unit.imageId, unit.gifId, 0, 0, vImage, vProgress)
        updateFlash()

        ToolsView.setOnLongClickCoordinates(vRootContainer) { v, x, y ->
            ControllerUnits.showStickerPopup(vRootContainer, x, y, unit)
        }
    }

    override fun notifyItem() {
        ToolsImagesLoader.load(unit.imageId).intoCash()
    }

    private fun updateFlash() {
        if (getView() == null) return
        val vRootContainer: View = getView()!!.findViewById(R.id.vRootContainer)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (animationFlash != null) {
                vRootContainer.foreground = ColorDrawable(animationFlash!!.color)
            } else
                vRootContainer.foreground = ColorDrawable(0x00000000)
        } else {
            if (animationFlash != null) {
                vRootContainer.background = ColorDrawable(animationFlash!!.color)
            } else
                vRootContainer.background = ColorDrawable(0x00000000)
        }


        if (flash) {
            flash = false
            if (subscriptionFlash != null) subscriptionFlash!!.unsubscribe()

            if (animationFlash == null)
                animationFlash = AnimationPendulumColor(ToolsColor.setAlpha(0, ToolsResources.getColor(R.color.focus_dark)), ToolsResources.getColor(R.color.focus_dark), 500, AnimationPendulum.AnimationType.TO_2_AND_BACK)
            animationFlash?.to_2()

            subscriptionFlash = ToolsThreads.timerThread((1000 / 30).toLong(), 1000,
                    { subscription ->
                        animationFlash?.update()
                        ToolsThreads.main { updateFlash() }
                    },
                    {
                        ToolsThreads.main {
                            animationFlash = null
                            updateFlash()
                        }
                    })
        }

    }


    fun flash() {
        flash = true
        updateFlash()
    }


}
