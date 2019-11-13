package com.practice197
//package ex_kotlin_to_java_package_level
// 197 자바에서 코틀린 코드 접근하기: 패키지 레벨 변수·함수
// 패키지 레벨의 변수, 함수, 확장 함수를 선언

val a = 10

fun func() = println("Hello")

fun Int.extension() = println(this)
