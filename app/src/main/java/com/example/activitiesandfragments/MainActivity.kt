package com.example.activitiesandfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.activitiesandfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ItemViewModelKotlin
    private lateinit var fragmentManager : FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[ItemViewModelKotlin::class.java]

        viewModel.selectedItem.observe(this, Observer {
            binding.fragmentText.text = it.toString()
        })


        binding.fragment1btn.setOnClickListener{
            replaceFragment(Fragment1())
        }

        binding.fragment2btn.setOnClickListener{
            replaceFragment(Fragment2())
        }
    }

    private fun replaceFragment(fragment : Fragment) {
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }

}