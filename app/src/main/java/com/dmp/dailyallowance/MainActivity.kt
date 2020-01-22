package com.dmp.dailyallowance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.dmp.dailyallowance.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {


    lateinit var tvGreet:TextView
    lateinit var tvAllowance:TextView
    lateinit var tvAllowanceAmount:TextView

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        initVariables()
    }

    private fun initVariables() {
        binding.tvAllowanceAmount.setText("800")
    }
}
