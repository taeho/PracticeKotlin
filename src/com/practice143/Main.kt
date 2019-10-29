package com.practice143.ex_mutable_list_iterator_interface
// MutableListIterator 인터페이스 살펴보기 
// public fun set(element: T): Unit	// set은 커서가 가리키는 위치의 원소를 elements 로 교체한다.
// public fun add(element: T): Unit	// add는 커서가 가리키는 위치에 element를 추가한다.

fun main(args: Array<String>)
{
	val list = mutableListOf(1, 2, 3)
	val iter: MutableListIterator<Int> = list.listIterator()	//MutableList<Int> 타입의 list 변수로 부터 MutableListIterator<Int>를 가져온다 

	println(list)	// 출력: [1, 2, 3]

	iter.next(); iter.next()	// next를 호출 2번 하여, iter 커서가 1번째를 가리키도록
	iter.add(7)	// iter 커서가 가리키는 위치에 7을 추가 
	println(list)	// 출력: [1, 2, 7, 3]

	iter.next(); iter.set(10)	// iter의 커서를 다음의 원소로 옮긴뒤 갑 ㅅ을 10으로 수정 
	println(list)	// 출력: [1, 2, 7, 10]
}
