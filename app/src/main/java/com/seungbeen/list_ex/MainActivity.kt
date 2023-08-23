package com.seungbeen.list_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // mutableList에 String 문자열을 집어넣겠다는 의미
        var testList = mutableListOf<String>()
        testList.add("a")
        testList.add("b")
        testList.add("c")

        Log.d("MainActivity", testList.toString())

        Log.d("MainActivity", testList[0])
        Log.d("MainActivity", testList[1])
        Log.d("MainActivity", testList[2])
    }
}