package com.fbf.gmailcopy.ui.primary.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fbf.gmailcopy.R
import com.fbf.gmailcopy.databinding.RowMessageBinding
import com.fbf.gmailcopy.ui.primary.model.MessagePrimary

class PrimaryMessagesAdapter : RecyclerView.Adapter<PrimaryMessagesAdapter.MessageViewHolder>() {

    private var primaryMessages = listOf(
        MessagePrimary("Linkedin", "Work", "asfsddfgfhfd",1),
        MessagePrimary("Facebook", "Password", "asfsddsfasfd",2),
        MessagePrimary("Instagram", "Login", "asfsasdfasf",3),
        MessagePrimary("Garik", "Name", "asfsddfgfhfd",4),
        MessagePrimary("GitHub", "Forgot", "asfsddfsdfas",2),
        MessagePrimary("John", "Work", "asfsddfgfhfd",3),
        MessagePrimary("Ani", "Hello", "asfsddfgfhfd",1),
        MessagePrimary("Anush", "Hiring", "asfsdfsdf",1),
        MessagePrimary("Linkedin", "Work", "asfsddfgfhfd",3),
        MessagePrimary("Linkedin", "Work", "asfsddfgfhfd",4),
        MessagePrimary("Facebook", "Password", "asfsddsfasfd",1),
        MessagePrimary("Instagram", "Login", "asfsasdfasf",3),
        MessagePrimary("Garik", "Name", "asfsddfgfhfd",2),
        MessagePrimary("GitHub", "Forgot", "asfsddfsdfas",4),
        MessagePrimary("John", "Work", "asfsddfgfhfd",2),
        MessagePrimary("Ani", "Hello", "asfsddfgfhfd",3),
        MessagePrimary("Anush", "Hiring", "asfsdfsdf",4),
        MessagePrimary("Linkedin", "Work", "wtrwthfd",2),
        MessagePrimary("Linkedin", "Work", "asfsddfgfhfd",1),
        MessagePrimary("Facebook", "Password", "asfsddsfasfd",4),
        MessagePrimary("Instagram", "Login", "asfsasdfasf",3),
        MessagePrimary("Garik", "Name", "asfsddfgfhfd",1),
        MessagePrimary("GitHub", "Forgot", "asfsddfsdfas",2),
        MessagePrimary("John", "Work", "asfsddfgfhfd",4),
        MessagePrimary("Ani", "Hello", "asfsddfgfhfd",1),
        MessagePrimary("Anush", "Hiring", "asfsdfsdf",3),
        MessagePrimary("Linkedin", "Work", "mnfsddfgfhfd",1),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val binding = RowMessageBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MessageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        with(holder) {
            with(primaryMessages[position]) {

                binding.usernameTextView.text = this.username
                binding.titleTextView.text = this.title
                binding.generalTextView.text = this.general

                when(this.color){
                    1->{
                        binding.userImageView.setImageResource(R.drawable.icon_user_blue)
                    }
                    2->{
                        binding.userImageView.setImageResource(R.drawable.icon_user_red)
                    }
                    3->{
                        binding.userImageView.setImageResource(R.drawable.icon_user_yellow)
                    }
                    4->{
                        binding.userImageView.setImageResource(R.drawable.icon_user_purple)
                    }

                }
            }
        }
    }

    override fun getItemCount() = primaryMessages.size

    inner class MessageViewHolder(val binding: RowMessageBinding) :
        RecyclerView.ViewHolder(binding.root)

}