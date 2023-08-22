package ug.ac.mygridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ProductAdapter(val context: Context, var list: ArrayList<Product>): BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }
    //returning the object at indext position
    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //false means can either be to aparent or not
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_layout, null, false)
        val imageId =  view.findViewById<ImageView>(R.id.image)
        val nameId = view.findViewById<TextView>(R.id.name)
        val buttonId = view.findViewById<Button>(R.id.button)

        nameId.text = list[position].name
        imageId.setImageResource(list[position].image)
        buttonId.text = list[position].name
         //imageId.s

        return view

    }

}