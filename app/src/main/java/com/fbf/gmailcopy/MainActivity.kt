package com.fbf.gmailcopy

import android.content.Intent
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.fbf.common.base.BaseCommonActivity
import com.fbf.gmailcopy.databinding.ActivityMainBinding
import com.fbf.gmailcopy.ui.mail.fragment.MailFragment
import com.fbf.gmailcopy.ui.meet.fragment.MeetFragment
import com.fbf.gmailcopy.ui.primary.fragment.PrimaryFragment
import com.fbf.gmailcopy.ui.promotions.fragment.PromotionsFragment
import com.fbf.gmailcopy.ui.starred.fragment.StarredFragment
import com.fbf.gmailcopy.util.Constants

class MainActivity : BaseCommonActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mailFragment: MailFragment
    private lateinit var meetFragment: MeetFragment
    private lateinit var primaryFragment: PrimaryFragment
    private lateinit var promotionsFragment: PromotionsFragment
    private lateinit var starredFragment: StarredFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mailFragment = MailFragment()
        meetFragment = MeetFragment()
        primaryFragment = PrimaryFragment()
        promotionsFragment = PromotionsFragment()
        starredFragment = StarredFragment()

        itemSelectedBottomNavigation()
        binding.mainBottomNavigationView.selectedItemId = Constants.NAVIGATION_MAIL

        itemSelectedNavigation()
    }

    private fun itemSelectedBottomNavigation() {
        binding.mainBottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                Constants.NAVIGATION_MAIL -> {
                    fragmentTransaction(mailFragment, binding.mainFrameLayout.id)
                    true
                }
                Constants.NAVIGATION_MEET -> {
                    fragmentTransactionWithBackStack(meetFragment, binding.mainFrameLayout.id)
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    private fun itemSelectedNavigation() {
        binding.navigationView.setNavigationItemSelectedListener {
            fragmentTransaction(mailFragment, binding.mainFrameLayout.id)
            binding.mainBottomNavigationView.selectedItemId = Constants.NAVIGATION_MAIL
            binding.drawerLayout.close()

            when (it.itemId) {
                Constants.NAVIGATION_PRIMARY -> {
                    fragmentTransaction(primaryFragment, R.id.mailFrameLayout)
                    true
                }
                Constants.NAVIGATION_PROMOTIONS -> {
                    fragmentTransactionWithBackStack(promotionsFragment, R.id.mailFrameLayout)
                    true
                }
                Constants.NAVIGATION_STARRED -> {
                    fragmentTransactionWithBackStack(starredFragment, R.id.mailFrameLayout)
                    true
                }
                Constants.NAVIGATION_CALENDAR -> {
                    openAnotherApp(Constants.CALENDAR)
                    true
                }
                Constants.NAVIGATION_CONTACTS -> {
                    openAnotherApp(Constants.CONTACTS)
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    private fun fragmentTransactionWithBackStack(fragment: Fragment, id: Int) {
        supportFragmentManager.beginTransaction()
            .addToBackStack("")
            .replace(id, fragment).commit()
    }

    private fun fragmentTransaction(fragment: Fragment, id: Int) {
        supportFragmentManager.beginTransaction()
            .replace(id, fragment).commit()
    }

    private fun openAnotherApp(packageName: String) {
        val intent = Intent()
        intent.setPackage(packageName)
        startActivity(intent)
    }
}