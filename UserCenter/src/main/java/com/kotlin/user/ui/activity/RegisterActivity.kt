package com.kotlin.user.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin.user.R
import kotlinx.android.synthetic.main.activity_register.*
//import org.jetbrains.anko.toast

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mRegisterBtn.setOnClickListener {
//            toast("test")
            Toast.makeText(this, "注册", Toast.LENGTH_SHORT).show()
        }
    }
}
