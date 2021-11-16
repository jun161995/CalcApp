package jp.techacademy.junichirou.yoshihara.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    var value3: Float = 0.0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        value3 = intent.getFloatExtra("value3", 0F)
        textView1.text = "${value3}"
    }
}