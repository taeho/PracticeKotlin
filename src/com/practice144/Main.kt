package com.practice144.ex_mutable_set_interface
// MutableSet 인터페이스 살펴보기
// mutableSetOf 함수를 호출하면 MutableSet<E> 타입의 객체가 반환
// MutableSet<E> 인터페이스는 MutableCollection<E> 를 상속

fun main(args: Array<String>)
{
	val set: MutableSet<Int> = mutableSetOf(1, 5, 7)
	println(set)	// 출력: [1, 5, 7]

	println(set.add(5))	// 출력: 5는 이미 set에 있기때문에 추가되지 않는다. false 출력
	println(set)	// 출력: [1, 5, 7]

	println(set.addAll(listOf(3, 7)))	// 출력: 7은 이미 set에 존재하므로 추가 되지 않고, 3만 set에 추가된다. 추가된 원소가 존재하므로 true 출력 	 
	println(set)	// 출력: [1, 5, 7, 3]
}
