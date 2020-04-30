package com.uts_mobiledev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_account.*

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        cvEditdata.setOnClickListener {
            Toast.makeText(applicationContext, "Fitur ini belum di tambahkan", Toast.LENGTH_LONG).show()
        }
    }
}
