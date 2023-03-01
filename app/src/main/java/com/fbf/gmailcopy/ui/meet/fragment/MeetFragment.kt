package com.fbf.gmailcopy.ui.meet.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.fbf.common.base.BaseCommonFragment
import com.fbf.gmailcopy.R
import com.fbf.gmailcopy.databinding.FragmentMeetBinding
import com.fbf.gmailcopy.databinding.FragmentPrimaryBinding
import com.fbf.gmailcopy.util.Constants


class MeetFragment : BaseCommonFragment() {
    private lateinit var binding: FragmentMeetBinding
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMeetBinding.inflate(layoutInflater)
        val view = binding.root

        drawerLayout = requireActivity().findViewById(Constants.DRAWER_LAYOUT)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.menuNavigationView.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view) {
            binding.menuNavigationView -> {
                drawerLayout.openDrawer(GravityCompat.START)
            }
        }
    }


}