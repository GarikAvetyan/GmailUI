package com.fbf.gmailcopy.ui.mail.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.fbf.common.base.BaseCommonFragment
import com.fbf.gmailcopy.MainActivity
import com.fbf.gmailcopy.databinding.FragmentMailBinding
import com.fbf.gmailcopy.ui.compose.activity.ComposeActivity
import com.fbf.gmailcopy.ui.primary.fragment.PrimaryFragment
import com.fbf.gmailcopy.util.Constants


class MailFragment : BaseCommonFragment() {
    private lateinit var binding: FragmentMailBinding
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMailBinding.inflate(layoutInflater)
        val view = binding.root

        val primaryFragment = PrimaryFragment()

        requireActivity().supportFragmentManager.beginTransaction()
            .replace(binding.mailFrameLayout.id, primaryFragment)
            .commit()

        drawerLayout = requireActivity().findViewById(Constants.DRAWER_LAYOUT)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.menuNavigationView.setOnClickListener(this)
        binding.composeButton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view) {
            binding.menuNavigationView -> {
                drawerLayout.openDrawer(GravityCompat.START)
            }

            binding.composeButton -> {
                val intent = Intent(requireActivity(), ComposeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}