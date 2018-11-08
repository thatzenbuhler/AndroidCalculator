package edu.fullerton.csu.hatzenbuhler.tyler.application1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*


val calcList = arrayOf(
    "Calculate Area",
    "Calculate Tip",
    "BMI Calculator",
    "Price After Tax Calculator"
)
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, calcList)

        listView.adapter = adapter
        listView.setOnItemClickListener{_,_, position, _ ->
            val message = position.toString()
            val intent = Intent(this, CalculatorActivity::class.java).apply{
                putExtra(EXTRA_MESSAGE, message)
            }
            startActivity(intent)
        }
    }
}
