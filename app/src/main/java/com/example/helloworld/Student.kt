package com.example.helloworld

class Student(name: String, age: Int) : Person(name, age), Study {
    //    init {
//        println("sno is $sno")
//        println("grade is $grade")
//    }
//    //次构造函数通过 constructor 关键字来定义的
//    constructor(name: String, age: Int) : this("", 0, name, age){
//    }
//
//    constructor() : this("",0){
//    }
    override fun readBooks() {
        println("$name is reading.")
    }

//    override fun doHomework() {
//        println("$name is doing homework.")
//    }
}