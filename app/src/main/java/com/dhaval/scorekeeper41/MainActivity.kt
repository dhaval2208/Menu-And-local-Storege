// Name :- Dhaval Bhimani Zaverbhai
// Student id:- A00255187
// Course :- JAV-1001 - 91337 - App Development for Android - 202209 - 001

package com.dhaval.scorekeeper41

import android.content.SharedPreferences
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


// define all variable
class MainActivity : AppCompatActivity() {
    var India: TextView? = null
    var Canada: TextView? = null
    var Gamename: TextView? = null
    var back_arrow: ImageView? = null
    var toolbar_title: TextView? = null
    var increaseindia: Button? = null
    var decreaseindia: Button? = null
    var increasecanada: Button? = null
    var decreasecanada: Button? = null
    var indiascore: RadioButton? = null
    var canadascore: RadioButton? = null
    var score = 0
    var Goal = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        indiascore = findViewById<View>(R.id.indiascore) as RadioButton
        canadascore = findViewById<View>(R.id.canadascore) as RadioButton
        India = findViewById<View>(R.id.India) as TextView
        Canada = findViewById<View>(R.id.Canada) as TextView
        Gamename = findViewById<View>(R.id.Gamename) as TextView
        increaseindia = findViewById<View>(R.id.decreaseindia) as Button
        decreaseindia = findViewById<View>(R.id.decreaseindia) as Button
        increasecanada = findViewById<View>(R.id.increasecanada) as Button
        decreasecanada = findViewById<View>(R.id.decreasecanada) as Button
        back_arrow = findViewById<View>(R.id.back_arrow) as ImageView
        toolbar_title = findViewById<View>(R.id.toolbar_title) as TextView


// set back arrow on click
        back_arrow?.setOnClickListener() {
            fun onClick(v: View?) {
                // when click on back arrow set text
                Toast.makeText(this@MainActivity, "you click in Left icon", Toast.LENGTH_SHORT)
                    .show()
            }
        }


// set text on toolbar
        toolbar_title?.setText("ScoreKeeper")
    }


    // increment indiascore
    fun increment(v: View?) {
        score++
        indiascore!!.text = ("" + score)
    }

    // decrement indiascore
    fun Decrement(v: View?) {
        if (score <= 0) score = 0
        else score--
        indiascore!!.text = ("" + score)
    }

    // decrement canadascore
    fun increase(v: View?) {
        Goal++
        canadascore!!.text = ("" + Goal)
    }

    // decrement canadascore
    fun decrease(v: View?) {
        if (score <= 0) score = 0
        else Goal--
        canadascore!!.text = ("" + Goal)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.About -> {
                Toast.makeText(this, "Name :- DHAVAL BHIMANI , Course :- Jav1001", Toast.LENGTH_SHORT).show()
            }
            R.id.Setting -> {
                Toast.makeText(this, "Name :- DHAVAL BHIMANI , Course :- Jav1001", Toast.LENGTH_SHORT).show()
            }

            else -> return super.onOptionsItemSelected(item)

        }
        return true
    }
}







