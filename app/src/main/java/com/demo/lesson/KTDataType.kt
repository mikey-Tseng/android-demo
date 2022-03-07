package com.demo.lesson

import org.json.JSONObject
import kotlin.reflect.typeOf

//kt 数据类型
fun main() {
    println("----------------基本类型---------------------------")
    val number = 100 //自动类型推断
    val longNumber:Long = 101 //指定类型
    val floatNumber:Float = 1.288888888888888f
    val doubleNumber:Double = 1.2 //默认是double
    println("longNumber:$longNumber")
    println("floatNumber:$floatNumber")

    val char:Char = 'c'
    val bool:Boolean = false
    print("bool:$bool")

    val str:String = "string"
    val strChar:Char = str[0]
    println("str:$str,$strChar")
    println("${str.length}")

    val hello:String = """
        这是模板字符串
        测试换行""
    """.trimIndent()//去掉首位空格
    println(hello)

    println(longNumber.toString())

    val vip = true
    val admin = false
    println(vip.and(admin))
    println(vip.or(admin))

    println("----------------不可变数组---------------------------")
    val array:Array<Any> = arrayOf(1,2,3,"string",false)//Any 相当于Object
    val arrOfNull = arrayOfNulls<Any>(5)
    arrOfNull[2] = 3

    val arrayConstructer = Array<Any>(5){i->(i*i).toString()}//创建并循环5次【0，1，2，9，16】
    val arrayConstructer1 = Array<Any>(5){500}//初始化全是500
    val arrayConstructer2 = Array<Any>(5){it*2}//it就是代表数组的下标0，2，4，6，8

    for (item in arrOfNull){//遍历值
        println(item)
    }
    for (index in array.indices){//遍历key
        println("$index->${array[index]}")
    }
    for ((index,item) in array.withIndex()){//遍历key和值
        println("$index->${item}")
    }
    array.forEach {//遍历值
        println(it)
    }
    array.forEachIndexed{index,item->println("$index->${item}")}//遍历key和值

    println("----------------可变集合List---------------------------")
    val list = mutableListOf<Any>()
    list.add(1)
    list.add(2)
    list.add(2,3)

    val list2 = mutableListOf<Any>(1,"string",true)


}