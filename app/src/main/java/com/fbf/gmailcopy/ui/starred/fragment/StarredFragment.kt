package com.fbf.gmailcopy.ui.starred.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fbf.common.base.BaseCommonFragment
import com.fbf.gmailcopy.R
import com.fbf.gmailcopy.databinding.FragmentMailBinding
import com.fbf.gmailcopy.databinding.FragmentStarredBinding
import com.fbf.gmailcopy.ui.primary.fragment.PrimaryFragment
import com.fbf.gmailcopy.util.Constants

class StarredFragment : BaseCommonFragment() {
    private lateinit var binding: FragmentStarredBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentStarredBinding.inflate(layoutInflater)
        val view = binding.root


        return view
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

}