package com.appbymikekrysan.module21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        topAppBar.setNavigationOnClickListener {
            Toast.makeText(this, "Когда-нибудь здесь будет навигация...", Toast.LENGTH_SHORT).show()
        }

        topAppBar.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.fav -> {
                    Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.search -> {
                    Toast.makeText(this, "Поиск", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.more -> {
                    Toast.makeText(this, "Еще", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }


        //Изменения стилей динамически:

        val textView = TextView(ContextThemeWrapper(this, R.style.MyTheme_red_MyTheme_orange))
        textView.text = "Hi, Amigo!"

        container.addView(textView)

        textView.setOnClickListener {
            container.removeAllViews()
            val textView2 = TextView(ContextThemeWrapper(this, R.style.MyTheme_red))
            textView2.text = "Hello, Amigo!"
            container.addView(textView2)
        }
    }
}