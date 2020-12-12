package com.example.innotime.addTimer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.innotime.R
import kotlinx.android.synthetic.main.fragment_add_sequential_sub_timer.*

class AddSequentialSubTimer : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_sequential_sub_timer, container, false)
    }

    companion object {
        fun newInstance() = AddSequentialSubTimer()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        back.setOnClickListener { goToPreviousPage() }

        create.setOnClickListener {
            Toast.makeText(activity, "Need to save somewhere", Toast.LENGTH_LONG).show()
        }
    }

    private fun goToPreviousPage() {
        (requireActivity() as AddTimerActivity).navigateToAddSequentialTimer()
    }
}