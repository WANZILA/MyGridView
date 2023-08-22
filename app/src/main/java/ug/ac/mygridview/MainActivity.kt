package ug.ac.mygridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import ug.ac.mygridview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myList = ArrayList<Product>()
        myList.add(Product(R.drawable.rice,"Ronny"))
        myList.add(Product(R.drawable.rice,"" +
                "wan"))
        myList.add(Product(R.drawable.rice,"Nathan"))
        myList.add(Product(R.drawable.rice,"Ronnie"))

        val myAdapter = ProductAdapter(this, myList)
        val grid = binding.grid

        grid.adapter = myAdapter
    }
}