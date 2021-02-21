package eguino.iribe.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button= findViewById(R.id.button)

        button.setOnClickListener(){
            val intent = Intent(this, registerpage::class.java)
            startActivity(intent)
        }
    }
}