package com.tech4dev.tech4devminiproject_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tech4dev.tech4devminiproject_2.databinding.ActivityMainBinding
import com.tech4dev.tech4devminiproject_2.recyclerview.SampleAdapter
import com.tech4dev.tech4devminiproject_2.recyclerview.SampleModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var nameList : MutableList<SampleModel> = mutableListOf()
    private lateinit var sampleAdapter: SampleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        sampleAdapter = SampleAdapter(nameList)
        binding.apply {
            rvMain.apply {
                layoutManager= LinearLayoutManager(this@MainActivity)
                adapter=sampleAdapter
            }
        }
    }
    fun loadData(){
        nameList.add(SampleModel(1,"Chidinma", R.drawable.person1))
        nameList.add(SampleModel(2,"Inem", R.drawable.person1))
        nameList.add(SampleModel(3,"Mimi", R.drawable.person1))
        nameList.add(SampleModel(4,"Olu", R.drawable.person2))
        nameList.add(SampleModel(5,"Sola", R.drawable.person2))
        nameList.add(SampleModel(6,"Eleanya", R.drawable.person2))
        nameList.add(SampleModel(7,"Ejiro", R.drawable.person1))
        nameList.add(SampleModel(8,"Arit", R.drawable.person1))
        nameList.add(SampleModel(9,"Joan", R.drawable.person1))
        nameList.add(SampleModel(10,"Vivian", R.drawable.person1))
        nameList.add(SampleModel(11,"Candy", R.drawable.person1))
        nameList.add(SampleModel(12,"Bassey", R.drawable.person1))
    }
}