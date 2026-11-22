package com.mdsorbit.jarvis

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val title = TextView(this).apply {
            text = "JARVIS"
            textSize = 32f
            gravity = Gravity.CENTER
        }
        val status = TextView(this).apply {
            text = "Foundation project is ready. Wake-word listening is not connected yet."
            textSize = 16f
            gravity = Gravity.CENTER
            setPadding(24, 24, 24, 24)
        }
        val note = TextView(this).apply {
            text = "Next: add the local wake-word engine, then Hindi speech recognition and voice replies."
            textSize = 14f
            gravity = Gravity.CENTER
            setPadding(24, 8, 24, 24)
        }

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(24, 24, 24, 24)
            addView(title)
            addView(status)
            addView(note)
        }
        setContentView(layout)
    }
}
