package com.example.callapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnCall.setOnClickListener {
            val view = findViewById<EditText>(R.id.etNumber)
            val number = view.text
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$number")
            startActivity(intent)

//            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + number))
//            startActivity(intent)


        }
    }
}