package com.example.swooshapp.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swooshapp.Model.Player
import com.example.swooshapp.R
import com.example.swooshapp.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_final.*

class FinishActivity : AppCompatActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeagueText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
