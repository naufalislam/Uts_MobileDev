package com.uts_mobiledev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cvTransasksi.setOnClickListener {
            val intent = Intent(this, TransaksiActivity::class.java)
            startActivity(intent)
            finish()
        }

        cvBarang.setOnClickListener {
            val intent = Intent(this, BarangActivity::class.java)
            startActivity(intent)
            finish()
        }

       cvAkun.setOnClickListener {
           val intent = Intent(this, AccountActivity::class.java)
           startActivity(intent)
           finish()
       }

    }
}
