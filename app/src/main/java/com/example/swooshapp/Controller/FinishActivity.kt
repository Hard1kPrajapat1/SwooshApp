package com.example.swooshapp.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swooshapp.R
import com.example.swooshapp.Utilities.EXTRA_LEAGUE
import com.example.swooshapp.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_final.*

class FinishActivity : AppCompatActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)
        searchLeagueText.text = "Looking for $league $skill league near you..."
    }
}
