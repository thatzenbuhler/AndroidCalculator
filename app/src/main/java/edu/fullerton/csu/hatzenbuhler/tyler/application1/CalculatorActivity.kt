package edu.fullerton.csu.hatzenbuhler.tyler.application1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_calculator.*
import java.text.DecimalFormat

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        when (message) {
            "0" -> {
                calcTitle.text = "Calculate Area"
                inputOne.text = "Enter Length"
                inputTwo.text = "Enter Width"
                resultType.text = "Area in units squared:"
                button.setOnClickListener {
                    if(fieldOne.text.toString() != "" && fieldTwo.text.toString() != ""){
                        val a = fieldOne.text.toString().toDouble()
                        val b = fieldTwo.text.toString().toDouble()
                        val res = a * b
                        val df = DecimalFormat("#.##")
                        result.text = df.format(res)
                    }
                    else{
                        result.text = "Input Error"
                    }
                }
            }
            "1" -> {
                calcTitle.text = "Calculate Tip"
                inputOne.text = "Enter Cost of Bill"
                inputTwo.text = "Enter Percent Desired"
                resultType.text = "Dollars to give for tip:"
                button.setOnClickListener {
                    if(fieldOne.text.toString() != "" && fieldTwo.text.toString() != ""){
                        val a = fieldOne.text.toString().toDouble()
                        val b = fieldTwo.text.toString().toDouble()
                        val res = a * (b * .01)
                        val df = DecimalFormat("#.##")
                        result.text = df.format(res)
                    }
                    else{
                        result.text = "Input Error"
                    }
                }
            }
            "2" -> {
                calcTitle.text = "BMI Calculator"
                inputOne.text = "Enter height in inches"
                inputTwo.text = "Enter weight in pounds"
                resultType.text = "Body Mass Index:"
                button.setOnClickListener {
                    if(fieldOne.text.toString() != "" && fieldTwo.text.toString() != ""){
                        val a = fieldOne.text.toString().toDouble()
                        val b = fieldTwo.text.toString().toDouble()
                        val res = (b / (a * a)) * 705
                        val df = DecimalFormat("#.##")
                        result.text = df.format(res)
                    }
                    else{
                        result.text = "Input Error"
                    }
                }
            }
            "3" -> {
                calcTitle.text = "Price After Tax Calculator"
                inputOne.text = "Enter Price"
                inputTwo.text = "Enter Tax Rate (%)"
                resultType.text = "Price After Tax:"
                button.setOnClickListener {
                    if(fieldOne.text.toString() != "" && fieldTwo.text.toString() != ""){
                        val a = fieldOne.text.toString().toDouble()
                        val b = fieldTwo.text.toString().toDouble()
                        val res = a + (a * (b * .01))
                        val df = DecimalFormat("#.##")
                        result.text = df.format(res)
                    }
                    else{
                        result.text = "Input Error"
                    }
                }
            }
        }
    }
}