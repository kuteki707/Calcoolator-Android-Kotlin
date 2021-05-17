package com.kuteki.calcoolatorv2

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.kuteki.calcoolatorv2.databinding.ActivityMainBinding

var value1 = ""
var value2 = ""
var value1IsActive = true
var operator = ""
var result = 0.0
var dotPressed = false
var equalIsActtive = false
var fan = 1
var operatorsActive = false
var minusFan = 0



class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR)

        binding.buttonOne.setOnClickListener {
            if(value1IsActive){
                if(value1.length<9){
                    value1 += "1"
                    binding.textView.text = value1
                    operatorsActive = true
                }

            }
            else{
                if(value2.length<9){
                    value2 += "1"
                    binding.textView.text = value1 + operator + value2
                    equalIsActtive = true
                }
            }
            if(value1.length==8&&value2.length==8){
                Toast.makeText(this,"The value is too big", Toast.LENGTH_LONG).show()
            }
        }

        binding.buttonTwo.setOnClickListener {
            if(value1IsActive){
                if(value1.length<9){
                    value1 += "2"
                    binding.textView.text = value1
                    operatorsActive = true
                }

            }
            else{
                if(value2.length<9){
                    value2 += "2"
                    binding.textView.text = value1 + operator + value2
                    equalIsActtive = true
                }
            }
            if(value1.length==8&&value2.length==8){
                Toast.makeText(this,"The value is too big", Toast.LENGTH_LONG).show()
            }
        }
        binding.buttonThree.setOnClickListener {
            if(value1IsActive){
                if(value1.length<9){
                    value1 += "3"
                    binding.textView.text = value1
                    operatorsActive = true
                }

            }
            else{
                if(value2.length<9){
                    value2 += "3"
                    binding.textView.text = value1 + operator + value2
                    equalIsActtive = true
                }
            }
            if(value1.length==8&&value2.length==8){
                Toast.makeText(this,"The value is too big", Toast.LENGTH_LONG).show()
            }
        }
        binding.buttonFour.setOnClickListener {
            if(value1IsActive){
                if(value1.length<9){
                    value1 += "4"
                    binding.textView.text = value1
                    operatorsActive = true
                }

            }
            else{
                if(value2.length<9){
                    value2 += "4"
                    binding.textView.text = value1 + operator + value2
                    equalIsActtive = true
                }
            }
            if(value1.length==8&&value2.length==8){
                Toast.makeText(this,"The value is too big", Toast.LENGTH_LONG).show()
            }
        }
        binding.buttonFive.setOnClickListener {
            if(value1IsActive){
                if(value1.length<9){
                    value1 += "5"
                    binding.textView.text = value1
                    operatorsActive = true
                }

            }
            else{
                if(value2.length<9){
                    value2 += "5"
                    binding.textView.text = value1 + operator + value2
                    equalIsActtive = true
                }
            }
            if(value1.length==8&&value2.length==8){
                Toast.makeText(this,"The value is too big", Toast.LENGTH_LONG).show()
            }
        }
        binding.buttonSix.setOnClickListener {
            if(value1IsActive){
                if(value1.length<9){
                    value1 += "6"
                    binding.textView.text = value1
                    operatorsActive = true
                }

            }
            else{
                if(value2.length<9){
                    value2 += "6"
                    binding.textView.text = value1 + operator + value2
                    equalIsActtive = true
                }
            }
            if(value1.length==8&&value2.length==8){
                Toast.makeText(this,"The value is too big", Toast.LENGTH_LONG).show()
            }
        }
        binding.buttonSeven.setOnClickListener {
            if(value1IsActive){
                if(value1.length<9){
                    value1 += "7"
                    binding.textView.text = value1
                    operatorsActive = true
                }

            }
            else{
                if(value2.length<9){
                    value2 += "7"
                    binding.textView.text = value1 + operator + value2
                    equalIsActtive = true
                }
            }
            if(value1.length==8&&value2.length==8){
                Toast.makeText(this,"The value is too big", Toast.LENGTH_LONG).show()
            }
        }
        binding.buttonEight.setOnClickListener {
            if(value1IsActive){
                if(value1.length<9){
                    value1 += "8"
                    binding.textView.text = value1
                    operatorsActive = true
                }

            }
            else{
                if(value2.length<9){
                    value2 += "8"
                    binding.textView.text = value1 + operator + value2
                    equalIsActtive = true
                }
            }
            if(value1.length==8&&value2.length==8){
                Toast.makeText(this,"The value is too big", Toast.LENGTH_LONG).show()
            }
        }
        binding.buttonNine.setOnClickListener {
            if(value1IsActive){
                if(value1.length<9){
                    value1 += "9"
                    binding.textView.text = value1
                    operatorsActive = true
                }

            }
            else{
                if(value2.length<9){
                    value2 += "9"
                    binding.textView.text = value1 + operator + value2
                    equalIsActtive = true
                }
            }
            if(value1.length==8&&value2.length==8){
                Toast.makeText(this,"The value is too big", Toast.LENGTH_LONG).show()
            }
        }
        binding.buttonZero.setOnClickListener {
            if(value1IsActive){
                if(value1.length<9){
                    value1 += "0"
                    binding.textView.text = value1
                    operatorsActive = true
                }

            }
            else{
                if(value2.length<9){
                    value2 += "0"
                    binding.textView.text = value1 + operator + value2
                    equalIsActtive = true
                }
            }
            if(value1.length==8&&value2.length==8){
                Toast.makeText(this,"The value is too big", Toast.LENGTH_LONG).show()
            }
        }
        binding.buttonOpC.setOnClickListener {
            clear()
        }
        binding.buttonDel.setOnClickListener {
            if(value1IsActive){
                var x = value1.length
                if(x>0){
                    value1 = value1.removeRange(x-1,x)
                    if(value1.length == 0)
                        operatorsActive = false
                    binding.textView.text = value1
                }
            }else{
                var x = value2.length
                if(x>0){
                    value2 = value2.removeRange(x-1,x)
                    if(value2.length == 0)
                        equalIsActtive = false
                    binding.textView.text =value1 + operator + value2
                }
            }
        }

        binding.buttonOpPlus.setOnClickListener {

            if(operatorsActive){
                var x = 0.0
                if(value2.isNotBlank()){
                    when(operator){
                        " + "->{
                            x = value1.toDouble() + value2.toDouble()
                            if(x.rem(1).equals(0.0)){
                                value1 = x.toInt().toString()
                            }
                            else{
                                value1 = x.toString()
                            }

                        }
                        " - "->{
                            x = value1.toDouble() - value2.toDouble()
                            if(x.rem(1).equals(0.0)){
                                value1 = x.toInt().toString()
                            }
                            else{
                                value1 = x.toString()
                            }

                        }
                        " ÷ "->{
                            x = value1.toDouble() / value2.toDouble()
                            if(x.rem(1).equals(0.0)){
                                value1 = x.toInt().toString()
                            }
                            else{
                                value1 = x.toString()
                            }

                        }
                        " x "->{
                            x = value1.toDouble() * value2.toDouble()
                            if(x.rem(1).equals(0.0)){
                                value1 = x.toInt().toString()
                            }
                            else{
                                value1 = x.toString()
                            }

                        }
                    }
                    value2 = ""
                }
                value1IsActive = false
                dotPressed = false
                operator = " + "
                if(value1.toDouble().rem(1).equals(0.0)){
                    binding.textView.text = value1.toDouble().toInt().toString() + operator
                }
                else{
                    binding.textView.text = value1 + operator
                }
            }
            operator = " + "
        }
        binding.buttonOpMinus.setOnClickListener {

            if(operatorsActive){
                var x = 0.0
                if(value2.isNotBlank()){
                    when(operator){
                        " + "->{
                            x = value1.toDouble() + value2.toDouble()
                            if(x.rem(1).equals(0.0)){
                                value1 = x.toInt().toString()
                            }
                            else{
                                value1 = x.toString()
                            }

                        }
                        " - "->{
                            x = value1.toDouble() - value2.toDouble()
                            if(x.rem(1).equals(0.0)){
                                value1 = x.toInt().toString()
                            }
                            else{
                                value1 = x.toString()
                            }

                        }
                        " ÷ "->{
                            x = value1.toDouble() / value2.toDouble()
                            if(x.rem(1).equals(0.0)){
                                value1 = x.toInt().toString()
                            }
                            else{
                                value1 = x.toString()
                            }

                        }
                        " x "->{
                            x = value1.toDouble() * value2.toDouble()
                            if(x.rem(1).equals(0.0)){
                                value1 = x.toInt().toString()
                            }
                            else{
                                value1 = x.toString()
                            }

                        }
                    }
                    value2 = ""
                }
                value1IsActive = false
                dotPressed = false
                operator = " - "
                if(value1.toDouble().rem(1).equals(0.0)){
                    binding.textView.text = value1.toDouble().toInt().toString() + operator
                }
                else{
                    binding.textView.text = value1 + operator
                }
            }
            else{
                if(minusFan == 0){
                    value1 = "-"
                    minusFan++
                    binding.textView.text = value1
                }

            }

        }

        binding.buttonOpDivide.setOnClickListener {
            if(operatorsActive){
                var x = 0.0
                if(value2.isNotBlank()){
                    when(operator){
                        " + "->{
                            x = value1.toDouble() + value2.toDouble()
                            if(x.rem(1).equals(0.0)){
                                value1 = x.toInt().toString()
                            }
                            else{
                                value1 = x.toString()
                            }

                        }
                        " - "->{
                            x = value1.toDouble() - value2.toDouble()
                            if(x.rem(1).equals(0.0)){
                                value1 = x.toInt().toString()
                            }
                            else{
                                value1 = x.toString()
                            }

                        }
                        " ÷ "->{
                            x = value1.toDouble() / value2.toDouble()
                            if(x.rem(1).equals(0.0)){
                                value1 = x.toInt().toString()
                            }
                            else{var tempX=String.format("%.2f",x)
                                value1 = tempX
                            }

                        }
                        " x "->{
                            x = value1.toDouble() * value2.toDouble()
                            if(x.rem(1).equals(0.0)){
                                value1 = x.toInt().toString()
                            }
                            else{var tempX=String.format("%.2f",x)
                                value1 = tempX
                            }

                        }
                    }
                    value2 = ""
                }
                value1IsActive = false
                dotPressed = false
                operator = " ÷ "
                if(value1.toDouble().rem(1).equals(0.0)){
                    binding.textView.text = value1.toDouble().toInt().toString() + operator
                }
                else{
                    binding.textView.text = value1 + operator
                }
            }
        }

        binding.buttonOpMultiplied.setOnClickListener {
            if(operatorsActive){
                var x = 0.0
                if(value2.isNotBlank()){
                    when(operator) {
                        " + " -> {
                            x = value1.toDouble() + value2.toDouble()
                            if (x.rem(1).equals(0.0)) {
                                value1 = x.toInt().toString()
                            } else {
                                value1 = x.toString()
                            }

                        }
                        " - " -> {
                            x = value1.toDouble() - value2.toDouble()
                            if (x.rem(1).equals(0.0)) {
                                value1 = x.toInt().toString()
                            } else {
                                value1 = x.toString()
                            }

                        }
                        " ÷ " -> {
                            x = value1.toDouble() / value2.toDouble()
                            if (x.rem(1).equals(0.0)) {
                                value1 = x.toInt().toString()
                            } else {
                                var tempX = String.format("%.2f", x)
                                value1 = tempX
                            }

                        }
                        " x " -> {
                            x = value1.toDouble() * value2.toDouble()
                            if (x.rem(1).equals(0.0)) {
                                value1 = x.toInt().toString()
                            } else {
                                var tempX = String.format("%.2f", x)
                                value1 = tempX
                            }

                        }
                    }
                    value2 = ""
                }
                value1IsActive = false
                dotPressed = false
                operator = " x "
                if(value1.toDouble().rem(1).equals(0.0)){
                    binding.textView.text = value1.toDouble().toInt().toString() + operator
                }
                else {
                    binding.textView.text = value1 + operator
                }
            }
        }

        binding.buttonOpEquals.setOnClickListener {
            if(equalIsActtive){
                when(operator){
                    " + " ->{
                        if(value2.isNotBlank()){
                            result = value1.toDouble() + value2.toDouble()
                        }else{
                            result = value1.toDouble()
                        }

                    }
                    " - " ->{
                        if(value2.isNotBlank()){
                            result = value1.toDouble() - value2.toDouble()
                        }else{
                            result = value1.toDouble()
                        }
                    }
                    " ÷ " ->{
                        if(value2.isNotBlank()){
                            result = value1.toDouble() / value2.toDouble()
                        }else{
                            result = value1.toDouble()
                        }
                    }
                    " x " -> {
                        if (value2.isNotBlank()) {
                            result = value1.toDouble() * value2.toDouble()
                        } else {
                            result = value1.toDouble()
                        }
                    }
                }
                var roundedResult = String.format("%.2f", result)
                dotPressed = false
                if(result.rem(1).equals(0.0)){
                    if(result!= value1.toDouble()){
                        binding.textView.text = value1 + operator + value2 + " = " + result.toInt().toString()
                        value1 = result.toInt().toString()
                    }else{
                        binding.textView.text = result.toInt().toString()
                    }

                }
                else{
                    if(result!=value1.toDouble()){
                        binding.textView.text = value1 + operator + value2 + " = " + roundedResult
                        value1 = roundedResult
                    }else{
                        binding.textView.text = result.toInt().toString()
                    }

                }
                /*if(roundedResult.toDouble().rem(1).equals(0.0)){
                    value1 = roundedResult.toDouble().toInt().toString()
                }
                else{
                    value1 = roundedResult
                }*/

                value2 = ""
                equalIsActtive = false
            }
        }

        binding.buttonOpDot.setOnClickListener {
            if(value1IsActive){
                if(value1.isNotBlank()&& dotPressed==false){
                    value1=value1 + "."
                    dotPressed = true
                    binding.textView.text= value1
                }
                else{
                    value1 = "0."
                    dotPressed = true
                    binding.textView.text= value1
                }
            }
            else{
                if(value2.isNotBlank()&& dotPressed==false){
                    value2=value2 + "."
                    dotPressed = true
                    binding.textView.text = value1 + operator + value2
                }
                else{
                    value2= "0."
                    dotPressed = true
                    binding.textView.text = value1 + operator + value2
                }
            }
        }

    }


    fun coolFactor(view:View){
        if(fan>=8){
            clear()
            Thread.sleep(100)
            val intent = Intent(this,CoolActivity::class.java)
            startActivity(intent)
        }else{
        Toast.makeText(this,"You are ${(1..100).random()}% cool",Toast.LENGTH_SHORT).show()}
        fan++

    }

    fun clear(){
        value1 = ""
        value2 = ""
        value1IsActive = true
        equalIsActtive = false
        dotPressed = false
        binding.textView.text = "0"
        operatorsActive = false
        minusFan = 0
    }
}