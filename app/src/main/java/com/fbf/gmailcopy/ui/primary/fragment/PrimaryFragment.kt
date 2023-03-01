package com.fbf.gmailcopy.ui.primary.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.fbf.common.base.BaseCommonFragment
import com.fbf.gmailcopy.databinding.FragmentPrimaryBinding
import com.fbf.gmailcopy.ui.primary.adapter.PrimaryMessagesAdapter


class PrimaryFragment : BaseCommonFragment() {

    private lateinit var binding: FragmentPrimaryBinding
    private lateinit var primaryMessagesAdapter: PrimaryMessagesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPrimaryBinding.inflate(layoutInflater)
        val view = binding.root

        primaryMessagesAdapter = PrimaryMessagesAdapter()
        initRecyclerView()

        return view
    }

    override fun onClick(view: View?) {

    }

    private fun initRecyclerView() {
        binding.primaryRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireActivity())
            adapter = primaryMessagesAdapter
        }
    }

}