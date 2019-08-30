package com.sayzen.campfiresdk.screens.other

import android.view.View
import com.dzen.campfire.api.API
import com.sayzen.campfiresdk.R
import com.sayzen.campfiresdk.controllers.ControllerCampfireSDK
import com.sayzen.campfiresdk.screens.account.profile.SAccount
import com.sup.dev.android.libs.screens.Screen
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsAndroid
import com.sup.dev.android.tools.ToolsIntent
import com.sup.dev.android.tools.ToolsToast
import com.sup.dev.android.views.widgets.WidgetMenu

class SAboutCreators : Screen(R.layout.screen_other_abount_creators){

    private val vCopyLink:View = findViewById(R.id.vCopyLink)

    private val vMoreZeon: View = findViewById(R.id.vMoreZeon)
    private val vMoreSaynok: View = findViewById(R.id.vMoreSaynok)
    private val vMoreEgor: View = findViewById(R.id.vMoreEgor)
    private val vMoreTurbo: View = findViewById(R.id.vMoreTurbo)


    init {
        vMoreZeon.setOnClickListener {
            WidgetMenu()
                    .add(R.string.app_campfire){w,i -> SAccount.instance(1, Navigator.TO)  }
                    .add(R.string.app_email){w,i -> ToolsIntent.startMail("zeooon@ya.ru")  }
                    .add(R.string.app_vkontakte){w,i -> ControllerCampfireSDK.openLink("https://vk.com/zeooon")   }
                    .asSheetShow()
        }

        vMoreSaynok.setOnClickListener {
            WidgetMenu()
                    .add(R.string.app_campfire){w,i -> SAccount.instance(2720, Navigator.TO)  }
                    .add(R.string.app_email){w,i -> ToolsIntent.startMail("saynokdeveloper@gmail.com")  }
                    .add(R.string.app_vkontakte){w,i -> ControllerCampfireSDK.openLink("https://vk.com/saynok")   }
                    .asSheetShow()
        }

        vMoreEgor.setOnClickListener {
            WidgetMenu()
                    .add(R.string.app_campfire){w,i -> SAccount.instance(9447, Navigator.TO)  }
                    .add(R.string.app_email){w,i -> ToolsIntent.startMail("georgepro036@gmail.com")  }
                    .add(R.string.app_vkontakte){w,i -> ControllerCampfireSDK.openLink("https://vk.com/id216069359")   }
                    .asSheetShow()
        }

        vMoreTurbo.setOnClickListener {
            WidgetMenu()
                    .add(R.string.app_campfire){w,i -> SAccount.instance(8083, Navigator.TO)  }
                    .add(R.string.app_email){w,i -> ToolsIntent.startMail("turboRO99@gmail.com")  }
                    .add(R.string.app_vkontakte){w,i -> ControllerCampfireSDK.openLink("https://vk.com/turboa99")   }
                    .asSheetShow()
        }

        vCopyLink.setOnClickListener {
            ToolsAndroid.setToClipboard(API.LINK_CREATORS)
            ToolsToast.show(R.string.app_copied)
        }
    }

}