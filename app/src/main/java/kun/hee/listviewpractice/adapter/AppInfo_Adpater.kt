package kun.hee.listviewpractice.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kun.hee.listviewpractice.R
import kun.hee.listviewpractice.datas.AppInformation

class AppInfo_Adpater(context:Context, resId:Int, list:ArrayList<AppInformation> ):ArrayAdapter<AppInformation>(context, resId, list) {
    val mContext =context
    val mList = list
    val inf = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow =convertView
        if(tempRow == null) {
            tempRow =inf.inflate(R.layout.play_store_list, null)
        }


    }








}