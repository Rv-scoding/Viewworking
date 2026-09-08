package edu.temple.viewworking

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageView : ImageView = findViewById(R.id.imageView)
        var id: Int = R.drawable.normal_galaxy

        findViewById<Button>(R.id.button).setOnClickListener{
            if (id == R.drawable.dark_galaxy) {
                imageView.setImageResource(R.drawable.normal_galaxy)
                id = R.drawable.normal_galaxy
            }
            else {
                imageView.setImageResource(R.drawable.dark_galaxy)
                id = R.drawable.dark_galaxy

            }
        }
    }
}