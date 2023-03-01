package com.fbf.gmailcopy.ui.promotions.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.fbf.common.base.BaseCommonFragment
import com.fbf.gmailcopy.R
import com.fbf.gmailcopy.databinding.FragmentMeetBinding
import com.fbf.gmailcopy.databinding.FragmentPromotionsBinding
import com.fbf.gmailcopy.ui.primary.adapter.PrimaryMessagesAdapter
import com.fbf.gmailcopy.ui.promotions.adapter.PromotionsMessagesAdapter
import com.fbf.gmailcopy.util.Constants


class PromotionsFragment : BaseCommonFragment() {
    private lateinit var binding: FragmentPromotionsBinding
    private lateinit var promotionsMessagesAdapter: PromotionsMessagesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentPromotionsBinding.inflate(layoutInflater)
        val view = binding.root

        promotionsMessagesAdapter = PromotionsMessagesAdapter()
        initRecyclerView()

        return view
    }

    override fun onClick(p0: View?) {

    }

    private fun initRecyclerView() {
        binding.promotionsRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireActivity())
            adapter = promotionsMessagesAdapter
        }
    }
}