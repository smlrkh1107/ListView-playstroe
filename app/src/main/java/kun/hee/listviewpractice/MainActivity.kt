package kun.hee.listviewpractice

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kun.hee.listviewpractice.adapter.AppInfo_Adpater
import kun.hee.listviewpractice.datas.AppInformation

class MainActivity : AppCompatActivity() {

    var mAppAdaper: AppInfo_Adpater? = null
    val appList = ArrayList<AppInformation>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }

    fun setupEvents(){
        playStoreList.setOnItemLongClickListener { parent, view, position, id ->

            val alert = AlertDialog.Builder(this)
            alert.setTitle("삭제 확인")
            alert.setMessage("정말 이 앱을 삭제하시겠습니까?")
            alert.setPositiveButton("확인", object : DialogInterface.OnClickListener{
                //에러뜨니까 알트엔터쓰고 함수 제작.
                override fun onClick(dialog: DialogInterface?, which: Int) {

                    //이걸 override fun 안에 옮겨주면 됨.
                    Log.d("앱목록갯수-삭제전", appList.size.toString())
                    appList.removeAt(position)
                    Log.d("앱목록갯수-삭제후", appList.size.toString())
                    mAppAdaper?.notifyDataSetChanged()
                }
            })

            alert.setNegativeButton("취소", null)

            alert.show() // 삭제후는 안적고 show적기.
            return@setOnItemLongClickListener true

        }
    }

    fun setValues(){
        addApps()
        mAppAdaper = AppInfo_Adpater(this, R.layout.play_store_list, appList)
        //        여기서 바로 var로 정의하면 새로고침할때, 뭔지 모른다고 함.
        playStoreList.adapter = mAppAdaper
    }

    fun addApps(){
        appList.add(AppInformation("아스팔트8:에어본", "GameLoft", 5))
        appList.add(AppInformation("MineCraft ", "Mojang ", 4))
        appList.add(AppInformation("아스팔트7:히트", "GameLoft", 4))
        appList.add(AppInformation("팔라독 (Paladog)", "FazeCat ", 2))
        appList.add(AppInformation("Plants vs. Zombies", "EA Games", 3))
        appList.add(AppInformation("스왐피 (Swampy)", "Disney ", 5))
        appList.add(AppInformation("리니지 2M", "NCSOFT", 3))
        appList.add(AppInformation("리니지M ", "NCSOFT ", 4))
        appList.add(AppInformation("AFK아레나", "Lilith Games", 1))
    }
}
