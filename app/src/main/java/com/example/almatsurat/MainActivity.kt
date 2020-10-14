package com.example.almatsurat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        main_btn_pindah3.setOnClickListener {

            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity, MainActivity2::class.java)

            //menjalankan intent
            startActivity(go)
        }



        main_btn_pindah2.setOnClickListener {

            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity, Activity2::class.java)

            //menjalankan intent
            startActivity(go)
        }

        main_btn_pindah1.setOnClickListener {

            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity, Activity1::class.java)

            //menjalankan intent
            startActivity(go)
        }
    }
}