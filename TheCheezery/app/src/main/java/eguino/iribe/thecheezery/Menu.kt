package eguino.iribe.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById(R.id.btnCold) as Button
        var btnHot: Button = findViewById(R.id.btnHot) as Button
        var btnCombos: Button = findViewById(R.id.btnCombos) as Button
        var btnCustom: Button = findViewById(R.id.btnCustom) as Button
        var btnSalties: Button = findViewById(R.id.btnSalties) as Button
        var btnSweets: Button = findViewById(R.id.btnSweets) as Button

        btnCold.setOnClickListener(){
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("valor","cold")
            startActivity(intent)
        }

        btnCombos.setOnClickListener(){
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("valor","combos")
            startActivity(intent)
        }

        btnCustom.setOnClickListener(){
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("valor","custom")
            startActivity(intent)
        }

        btnHot.setOnClickListener(){
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("valor","hot")
            startActivity(intent)
        }

        btnSalties.setOnClickListener(){
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("valor","salties")
            startActivity(intent)
        }

        btnSweets.setOnClickListener(){
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("valor","sweets")
            startActivity(intent)
        }
    }
}