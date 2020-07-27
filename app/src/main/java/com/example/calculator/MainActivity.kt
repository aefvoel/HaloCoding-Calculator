package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickZero(view: View) {
        text_result.text = joinString(text_result.text.toString(), getString(R.string.text_0))
    }
    fun clickOne(view: View) {
        text_result.text = joinString(text_result.text.toString(), getString(R.string.text_1))
    }
    fun clickTwo(view: View) {
        text_result.text = joinString(text_result.text.toString(), getString(R.string.text_2))
    }
    fun clickThree(view: View) {
        text_result.text = joinString(text_result.text.toString(), getString(R.string.text_3))
    }
    fun clickNine(view: View) {
        text_result.text = joinString(text_result.text.toString(), getString(R.string.text_9))
    }
    fun clickEight(view: View) {
        text_result.text = joinString(text_result.text.toString(), getString(R.string.text_8))
    }
    fun clickSeven(view: View) {
        text_result.text = joinString(text_result.text.toString(), getString(R.string.text_7))
    }
    fun clickSix(view: View) {
        text_result.text = joinString(text_result.text.toString(), getString(R.string.text_6))
    }
    fun clickFive(view: View) {
        text_result.text = joinString(text_result.text.toString(), getString(R.string.text_5))
    }
    fun clickFour(view: View) {
        text_result.text = joinString(text_result.text.toString(), getString(R.string.text_4))
    }
    fun clickPlus(view: View) {
        text_result.text = joinString(text_result.text.toString(), getString(R.string.text_plus))
    }
    fun clickMinus(view: View) {
        text_result.text = joinString(text_result.text.toString(), getString(R.string.text_min))
    }
    fun clickDivided(view: View) {
        text_result.text = joinString(text_result.text.toString(), getString(R.string.text_div))
    }
    fun clickMultiply(view: View) {
        text_result.text = joinString(text_result.text.toString(), getString(R.string.text_mul))
    }
    fun clickCLear(view: View) {
        text_result.text = ""
    }
    fun clickEqual(view: View) {
        when {
            text_result.text.toString().contains(getString(R.string.text_plus)) -> {
                val split = text_result.text.toString().split(getString(R.string.text_plus))
                text_result.text = plus(split[0].toInt(), split[1].toInt()).toString()
            }
            text_result.text.contains(getString(R.string.text_min)) -> {
                val split = text_result.text.toString().split(getString(R.string.text_min))
                text_result.text = minus(split[0].toInt(), split[1].toInt()).toString()
            }
            text_result.text.contains(getString(R.string.text_mul)) -> {
                val split = text_result.text.toString().split(getString(R.string.text_mul))
                text_result.text = multiply(split[0].toInt(), split[1].toInt()).toString()
            }
            text_result.text.contains(getString(R.string.text_div)) -> {
                val split = text_result.text.toString().split(getString(R.string.text_div))
                text_result.text = divided(split[0].toInt(), split[1].toInt()).toString()
            }
        }
    }
    fun clickAbout(view: View) {
        startActivity(Intent(this, AboutActivity::class.java))
    }

    private fun joinString(s1: String, s2: String): String {
        return "$s1$s2"
    }

    private fun plus(i1: Int, i2: Int): Int{
        return i1 + i2
    }
    private fun minus(i1: Int, i2: Int): Int{
        return i1 - i2
    }
    private fun multiply(i1: Int, i2: Int): Int{
        return i1 * i2
    }
    private fun divided(i1: Int, i2: Int): Int{
        return i1 / i2
    }
}