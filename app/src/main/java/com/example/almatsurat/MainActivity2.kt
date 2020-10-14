package com.example.almatsurat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        crd_hitung1.setOnClickListener {
            tv_count.text = (tv_count.text.toString().toInt()+1).toString()
        }
        crd_hitung2.setOnClickListener {
            tv_count.text = (tv_count.text.toString().toInt()+1).toString()
        }
        crd_hitung3.setOnClickListener {
            tv_count.text = (tv_count.text.toString().toInt()+1).toString()
        }
        crd_hitung4.setOnClickListener {
            tv_count.text = (tv_count.text.toString().toInt()+1).toString()
        }
        crd_hitung5.setOnClickListener {
            tv_count.text = "0"
        }
    }
}