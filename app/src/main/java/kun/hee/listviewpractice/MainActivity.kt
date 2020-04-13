package kun.hee.listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*
import kun.hee.listviewpractice.adapter.AppInfo_Adpater
import kun.hee.listviewpractice.datas.AppInformation

class MainActivity : AppCompatActivity() {

    var mAppAdaper:AppInfo_Adpater? = null
    val appList = ArrayList<AppInformation>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appList.add(AppInformation("아스팔트8:에어본","GameLoft",5))
        appList.add(AppInformation("MineCraft ","Mojang ",4))
        appList.add(AppInformation("아스팔트7:히트","GameLoft",4))
        appList.add(AppInformation("팔라독 (Paladog)","FazeCat ",2))
        appList.add(AppInformation("Plants vs. Zombies","EA Games",3))
        appList.add(AppInformation("스왐피 (Swampy)","Disney ",5))
        appList.add(AppInformation("리니지 2M","NCSOFT",3))
        appList.add(AppInformation("리니지M ","NCSOFT ",4))
        appList.add(AppInformation("AFK아레나","Lilith Games",1))

        mAppAdaper = AppInfo_Adpater(this, R.layout.play_store_list, appList)

        playStoreList.adapter = mAppAdaper


    }
}
