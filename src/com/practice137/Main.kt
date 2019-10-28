package com.practice137.ex_list_interface
// List의 인터페이스 살펴보기 
// public interface List<out E> : Collection<E>
// public operator fun get(index: Int): E   //get은 List의 index 번째 원소를 반환하는 멤버 함수
// public fun indexOf(element: @UnsafeVariance E): Int  //element 원소가 List의 몇번째의 인덱스에 위치해있는지 반환하는 멤버함수 , 없으면 -1 반환.
// public fun lastIndexOf(element: @UnsafeVariance E): Int  //마지막으로 일치하는 원소의 인덱스를 반환한다.
// public fun listIterator(): ListIterator<E>    //특화된 Iterator를 반환하는 멤버함수
// public fun listIterator(index: Int): ListIterator<E>	// index가 지정하면 그 인덱스부터 시작하는 listIterator 반환한다.
// public fun subList(fromIndex: Int, toIndex: Int): List<E> // from 부터 to 구간의 원소를 뽑아 새로운 List 만들어 반환 

fun main(args: Array<String>)
{
	val list: List<Double> = listOf(20.18, 1.14, 9.15, 1.14)

	println(list[0])		// 출력: 20.18
	println(list.indexOf(1.14))	// 출력: 1
	println(list.indexOf(9.31))	// 출력: -1
	println(list.lastIndexOf(1.14))	// 출력: 3
	println(list.subList(0, 3))	// 출력: [20.18, 1.14, 9.15]
}
