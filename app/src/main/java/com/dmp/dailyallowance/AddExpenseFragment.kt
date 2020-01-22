package com.dmp.dailyallowance


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.databinding.DataBindingUtil
import com.dmp.dailyallowance.databinding.ActivityMainBinding
import com.dmp.dailyallowance.databinding.FragmentAddExpenseBinding

/**
 * A simple [Fragment] subclass.
 */
class AddExpenseFragment : Fragment() {


    lateinit var binding: FragmentAddExpenseBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_add_expense, container, false)
        val view = binding.root

        return view
//        return binding.roo
    }


}
