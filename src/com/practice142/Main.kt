package com.practice142.ex_mutable_list_interface
// MutableList 인터페이스 살펴보기
// mutableListOf 함수를 호출하면 MutableList<E> 타입의 객체가 반환.
// MutableList<E> 인터페이스는 MutableCollection<E>를 상속한다.
// public fun add(index: Int, element: E): Unit		//index 위치에 element를 추가
// public fun addAll(index: Int, elements: Collection<E>): Boolean	// index위치에 elements 컬렉션에 있는 모든 원소를 추가하는 함수 
// public operator fun set(index: Int, element: E): E	// []연산자를 오버로딩 하는 멤버함수. index 번째 위치의 원소를 elements로 교체한다.
// public fun removeAt(index: Int): E	// index 번째 원소를 삭제하는 멤버함수 

fun main(args: Array<String>)
{
	val list: MutableList<Char> = mutableListOf('c', 'a', 'z')
	println(list)	// 출력: [c, a, z]	// 초기 list 의 값 출력

	list.add(1, '%')	// 1번째 위치에 '%'를 추가한다.
	println(list)	// 출력: [c, %, a, z]

	list.addAll(0, listOf('L', 'P'))	// 0 번째 위치에 'L'과 'P' 를 추가한다.
	println(list)	// 출력: [L, P, c, %, a, z]

	println(list.set(2, '/'))	// 출력: c	// 2번째원소를 '/'로 교체하고 있다. 이전의 값 c가 출력
	println(list)	// 출력: [L, P, /, %, a, z]

	println(list.removeAt(4))	// 출력: a	// 4번째 원소를 삭제하고 그 값인 a 출력 
	println(list)	// 출력: [L, P, /, %, z]
}
