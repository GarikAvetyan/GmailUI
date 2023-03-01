package com.fbf.gmailcopy.ui.promotions.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fbf.gmailcopy.R
import com.fbf.gmailcopy.databinding.RowMessageBinding
import com.fbf.gmailcopy.ui.promotions.model.MessagePromotions

class PromotionsMessagesAdapter: RecyclerView.Adapter<PromotionsMessagesAdapter.MessageViewHolder>() {

    private var promotionsMessages = listOf(
        MessagePromotions("Facebook", "Password", "asfsddsfasfd",4),
        MessagePromotions("Instagram", "Login", "asfsasdfasf",3),
        MessagePromotions("Garik", "Name", "asfsddfgfhfd",1),
        MessagePromotions("Linkedin", "Work", "mnfsddfgfhfd",1),
        MessagePromotions("Linkedin", "Work", "asfsddfgfhfd",3),
        MessagePromotions("Linkedin", "Work", "asfsddfgfhfd",4),
        MessagePromotions("Facebook", "Password", "asfsddsfasfd",1),
        MessagePromotions("GitHub", "Forgot", "asfsddfsdfas",2),
        MessagePromotions("John", "Work", "asfsddfgfhfd",4),
        MessagePromotions("Ani", "Hello", "asfsddfgfhfd",1),
        MessagePromotions("Anush", "Hiring", "asfsdfsdf",3),
        MessagePromotions("Linkedin", "Work", "mnfsddfgfhfd",1),
        MessagePromotions("Linkedin", "Work", "asfsddfgfhfd",3),
        MessagePromotions("Linkedin", "Work", "asfsddfgfhfd",4),
        MessagePromotions("Facebook", "Password", "asfsddsfasfd",1),
        MessagePromotions("Instagram", "Login", "asfsasdfasf",3),
        MessagePromotions("Garik", "Name", "asfsddfgfhfd",2),
        MessagePromotions("GitHub", "Forgot", "asfsddfsdfas",4),
        MessagePromotions("John", "Work", "asfsddfgfhfd",2),
        MessagePromotions("Ani", "Hello", "asfsddfgfhfd",3),
        MessagePromotions("Anush", "Hiring", "asfsdfsdf",4),
        MessagePromotions("Linkedin", "Work", "asfsddfgfhfd",1),
        MessagePromotions("Facebook", "Password", "asfsddsfasfd",2),
        MessagePromotions("Instagram", "Login", "asfsasdfasf",3),
        MessagePromotions("Garik", "Name", "asfsddfgfhfd",4),
        MessagePromotions("GitHub", "Forgot", "asfsddfsdfas",2),
        MessagePromotions("John", "Work", "asfsddfgfhfd",3),
        MessagePromotions("Ani", "Hello", "asfsddfgfhfd",1),
        MessagePromotions("Anush", "Hiring", "asfsdfsdf",1),
        MessagePromotions("Linkedin", "Work", "wtrwthfd",2),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val binding = RowMessageBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MessageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        with(holder) {
            with(promotionsMessages[position]) {

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

    override fun getItemCount() = promotionsMessages.size

    inner class MessageViewHolder(val binding: RowMessageBinding) :
        RecyclerView.ViewHolder(binding.root)

}