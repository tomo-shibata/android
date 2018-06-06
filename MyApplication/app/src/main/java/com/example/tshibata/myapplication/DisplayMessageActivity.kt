package com.example.tshibata.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        // 前のActivityで設定されたmessageを取ってきてtextviewに設定する
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.textView)

        val handler = Handler()
        val response = GetExample().run("https://raw.github.com/square/okhttp/master/README.md", handler, textView)


    }
}
