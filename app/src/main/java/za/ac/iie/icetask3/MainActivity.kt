package za.ac.iie.icetask3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Arrays

class MainActivity : AppCompatActivity() {

    val teams = arrayOf<String>("Mamelodi Sundowns FC",
        "Bidvest Wits",
        "Orlando Pirates",
        "Kaizer Chiefs",
        "Cape Town City")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get the teams text view
        val teamsTextView = findViewById<TextView>(R.id.teamsTextView)

        // add all the teams to the display string
        var teamsDisplay = ""
        for (team in teams) {
            teamsDisplay += "${team}\n"
        }

        // set the text view's text to the string representation of teams
        teamsTextView.text =Arrays.toString(teams)
    }
}