package com.example.tabalyout.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tabalyout.R
import com.example.tabalyout.databinding.FragmentBirdBinding
import com.example.tabalyout.databinding.FragmentCatBinding


class BirdFragment : Fragment() {

    private var _binding: FragmentBirdBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBirdBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }


}