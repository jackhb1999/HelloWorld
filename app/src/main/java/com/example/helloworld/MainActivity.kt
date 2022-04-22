package com.example.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/**
 *  MainActivity 是继承自 AppCompatActivity 的
 *  AppCompatActivity 是 AndroidX 中提供的一种向下兼容的 Activity
 *
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         *  Android 程序的设计讲究逻辑和视图分离
         *  在布局文件中编写页面，然后在 Activity 中引入进来
         *
         */
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","onCreate execute")
    }
}