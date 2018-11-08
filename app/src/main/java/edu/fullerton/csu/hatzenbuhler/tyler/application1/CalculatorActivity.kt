package edu.fullerton.csu.hatzenbuhler.tyler.application1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        if(message == "0"){
            calcTitle.text = "Calculator 1"
            // Test comment
        }
        else if(message == "1"){
            calcTitle.text = "Calculator 2"
        }
        else if(message == "2"){
            calcTitle.text = "Calculator 3"
        }
        else if(message == "3"){
            calcTitle.text = "Calculator 4"
        }
    }
}
