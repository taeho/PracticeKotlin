package com.practice135.ex_kotlin_collection
// 코틀린의 컬렉션Collection:
// 컬렉션이란 프로그램을 개발하는 데 필요한 기본 자료구조
// List: 순서가 있는 목록을 표현하는 자료구조(동적배열, 연결리스트)
// Set: 집합을 표현하는 자료구조. 원소의 중복을 허용하지 않고, 각 원소는 순서가 없다.
// Map: 연관배열(Associative Array)을 표현. 키와 값을 1:1로 대응하여 저장. 키는 중복될수 없다.

fun main(args: Array<String>)
{
	val list: Collection<Int> = listOf(10, 20, 10)	// listOf는 주어진 인수로 List<T>타입의 객체를 생성하는 함수. 제네릭이 적용되어 잇어서 임의 타입의 <T>객체 생성가능
	val set: Collection<Int> = setOf(1, 2, 3, 2, 3)	// setOf는 주어진 인수로 Set<T> 타입의 객체를 생성하는 함수. 
	val map: Map<String, String> = mapOf("Apple" to "사과", "Banana" to "바나나")	// mapOf는 주어진 Pair<K,V>타입의 객체들로 Map<K,V>타입의 객체를 생성하는 함수. 

	println(list)	// 출력: [10, 20, 10]
	println(set)	// 출력: [1, 2, 3]
	println(map)	// 출력: {Apple=사과, Banana=바나나}
}
