package com.sugoijapaneseschool.mykotlinmpp.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.sugoijapaneseschool.mykotlinmpp.shared.ExchangeMoney


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = ("3 달라는 한국돈으로 " + ExchangeMoney(3.0).toWon())

    }
}
