
package com.example.tshibata.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    companion object {
        val EXTRA_MESSAGE = "com.example.tshibata.myapplication.MESSAGE"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {

        val intent:Intent = Intent(this, DisplayMessageActivity::class.java)
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }

    fun get() {

    }

}
