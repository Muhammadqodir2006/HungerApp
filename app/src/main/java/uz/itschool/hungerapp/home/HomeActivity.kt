package uz.itschool.hungerapp.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.itschool.hungerapp.R
import uz.itschool.hungerapp.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var categoryRecyclerView: RecyclerView
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        
        categoryRecyclerView = binding.categoryRecyclerView

        categoryRecyclerView.layoutManager =LinearLayoutManager(applicationContext)
        categoryRecyclerView.adapter = CategoryRecyclerAdapter()
        
    }
}