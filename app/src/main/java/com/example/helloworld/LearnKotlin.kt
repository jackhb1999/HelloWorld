package com.example.helloworld

import kotlin.math.max


fun main(){
    Singleton.singletonTest()
}

fun doStudy(study: Study) {
    study.readBooks()
    study.doHomework()
}

fun largerNumber(num1: Int, num2: Int)= if (num1 > num2) {
        num1
    } else {
        num2
    }

fun getScore(name: String) = when {
    // 匹配值 -> { 执行逻辑 }
    name.startsWith("Tom") -> {
        86
    }
    name == "Jim" -> {
        77
    }
    name == "Jack" -> {
        95
    }
    name == "Lily" -> {
        100
    }
    else -> {
        0
    }
}

fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number is support")
    }
}

// 区间：val range = 0..10  创建了一个0到10的区间，并且两端都是闭区间。数学表达 [0,10]
