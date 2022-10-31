package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val id:Int = 10
    private val language:String = "kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener()
        {
            intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("id_value", id)
            intent.putExtra("language_value", language)
            startActivity(intent)
        }
    }
}
