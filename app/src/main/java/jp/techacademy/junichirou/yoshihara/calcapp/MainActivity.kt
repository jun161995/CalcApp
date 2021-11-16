package jp.techacademy.junichirou.yoshihara.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var value1: Float = 0.0f
    var value2: Float = 0.0f
    var value3: Float = 0.0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }



    override fun onClick(v: View) {
        val intent = Intent(this, MainActivity2::class.java)
        value1 = editText1.text.toString().toFloat()
        value2 = editText2.text.toString().toFloat()
        when (v.id) {
            R.id.button1 -> {
                value3 = value1 + value2
            }
            R.id.button2 -> {
                value3 = value1 - value2
            }
            R.id.button3 -> {
                value3 = value1 * value2
            }
            R.id.button4 -> {
                value3 = value1 / value2
            }
        }
        intent.putExtra("value3", value3)
        startActivity(intent)
    }
}