package com.example.swooshapp.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swooshapp.Utilities.EXTRA_LEAGUE
import com.example.swooshapp.R
import com.example.swooshapp.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClicked(view: View){
        skillBallerBtn.isChecked = false
        skill = "beginner"
    }

    fun onBallerClicked(view: View){
        skillBeginnerBtn.isChecked = false
        skill = "baller"
    }

    fun onFinishClicked(view: View){

        if(!skillBallerBtn.isChecked && !skillBeginnerBtn.isChecked)
            skill = ""

        if(skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, skill)
            startActivity(finishIntent)
        } else{
            Toast.makeText(this, "Please select the skill level", Toast.LENGTH_SHORT).show()
        }
    }
}
