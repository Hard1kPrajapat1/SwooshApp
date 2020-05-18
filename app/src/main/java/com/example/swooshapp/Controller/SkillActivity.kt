package com.example.swooshapp.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swooshapp.Model.Player
import com.example.swooshapp.R
import com.example.swooshapp.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBeginnerClicked(view: View){
        skillBallerBtn.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerClicked(view: View){
        skillBeginnerBtn.isChecked = false
        player.skill = "baller"
    }

    fun onFinishClicked(view: View){

        if(!skillBallerBtn.isChecked && !skillBeginnerBtn.isChecked)
            player.skill = ""

        if(player.skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        } else{
            Toast.makeText(this, "Please select the skill level", Toast.LENGTH_SHORT).show()
        }
    }
}
