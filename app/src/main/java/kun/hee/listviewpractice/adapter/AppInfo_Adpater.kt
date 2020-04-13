package kun.hee.listviewpractice.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kun.hee.listviewpractice.R
import kun.hee.listviewpractice.datas.AppInformation

class AppInfo_Adpater(context:Context, resId:Int, list:ArrayList<AppInformation> ):ArrayAdapter<AppInformation>(context, resId, list) {
    val mContext =context
    val mList = list
    val inf = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow =convertView
//        tempRow?.Let{ NULL이 아닐떄,}.Let{NULL 일때}
        if(tempRow == null) {
            tempRow = inf.inflate(R.layout.play_store_list, null)
        }
//        tempRow?.Let{
//        }.Let{ tempRow = inf.inflate(R.layout.play_store_list, null)}
//

        val row = tempRow!!
//      ★ 요기 위에 하나도 모르겠음 ★


//        이거 Text로 ★받고 반복문으로 평점할때마다 몇번적게 하려면 더 골치아프려나 ?>???
        val gameNameTxt = row.findViewById<TextView>(R.id.gameNameTxt)
        val companyNameTxt = row.findViewById<TextView>(R.id.companyNameTxt)
        val starGrade1 = row.findViewById<TextView>(R.id.starGrade1)
        val starGrade2 = row.findViewById<TextView>(R.id.starGrade2)
        val starGrade3 = row.findViewById<TextView>(R.id.starGrade3)
        val starGrade4 = row.findViewById<TextView>(R.id.starGrade4)
        val starGrade5 = row.findViewById<TextView>(R.id.starGrade5)





        return row

    }








}