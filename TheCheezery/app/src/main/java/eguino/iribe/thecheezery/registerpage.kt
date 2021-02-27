package eguino.iribe.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView

class registerpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registerpage)

        val button: Button = findViewById(R.id.button)
        val accept: CheckBox = findViewById(R.id.accept)
        val terms: TextView = findViewById(R.id.terms)

        button.setOnClickListener(){
            if(accept.isChecked) {
                val intent = Intent(this, Menu::class.java)
                startActivity(intent)
            } else {
                terms.setVisibility(TextView.VISIBLE);
            }
        }
    }
}