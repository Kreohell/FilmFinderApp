package ru.geekbrains.filmfinderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val person = DataClass("Ivan", "prog", 30)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.buttonTest).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = person.name
            findViewById<TextView>(R.id.textView2).text = DataObject.personData.name
            for(i in 1..10) {
                Log.d("Test","Hello Kotlin!")
            }
            for(i in 10 downTo 1 step 2) {
                Log.d("Test","Hello there, Kotlin!")
            }
            Toast.makeText(this,"buttonTest", Toast.LENGTH_SHORT).show()
        }
    }
}