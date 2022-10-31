package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle: Bundle? = intent.extras
        val id = bundle?.get("id_value")
        val language = bundle?.get("language_value")
        Toast.makeText(applicationContext,id.toString()+""+language,Toast.LENGTH_LONG).show()
        findViewById<Button>(R.id.button2).setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
