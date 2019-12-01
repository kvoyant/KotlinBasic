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
//        EditText( inputTxt )에 적힌 값( text )을 받아서
//        TextView ( ResultTxt )의 내용( text ) 으로 반영.

        okBtn.setOnClickListener {
//            Ctrl + k 커밋
            var inputString = inputEdt.text.toString() // get => 내용물 받아오기.
            resultTxt.text = inputString // set => 내용물 설정하기.
        }

        okBtn.setOnLongClickListener {

            resultTxt.text = "초기상태"

            return@setOnLongClickListener true
        }
    }
}
