package com.example.tshibata.myapplication

import android.app.DownloadManager
import android.os.Handler
import android.widget.TextView
import okhttp3.*
import java.io.IOException
import java.net.URL

class GetExample {

    val client = OkHttpClient()

    fun run(url: String, handler: Handler, textView: TextView) {

        val request = Request.Builder().url(url).build()
        val response = client.newCall(request).enqueue(object :Callback {
            override fun onResponse(call: Call?, response: Response?) {
                handler.post {
                    textView.setText(response?.body()?.string())
                }
            }

            override fun onFailure(call: Call?, e: IOException?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
    }
}

