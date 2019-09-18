package com.practice060.ex_indexed_access_operator

fun main(args: Array<String>)
{
	val person = Person("Kotlin", "2016-02-15")
	// person[0] 은 컴파일시 person.get(0)으로 번역됨.
	println(person[0])	// 출력: Kotlin
	println(person[1])	// 출력: 2016-02-15
	println(person[-1])	// 출력: 알 수 없음

	// person[0] = "Java"은 컴파일시 person.set(0, "Java")로 번역된다.
	person[0] = "Java"
	println(person.name)	// 출력: Java
}
