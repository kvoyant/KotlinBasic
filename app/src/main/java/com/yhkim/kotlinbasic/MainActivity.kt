package com.yhkim.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Ctrl + / 주석
//        버튼이( okBtn ) 눌리면
//        EditText( inputTxt )에 적힌 값을 받아서
//        TextView ( ResultTxt )의 내용으로 반영.
        okBtn.setOnClickListener {

        }
    }
}
