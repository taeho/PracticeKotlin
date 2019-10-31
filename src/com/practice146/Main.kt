package com.practice146.com.practice146.ex_sequence_interface
// Sequence 인터페이스 살펴보기
// Sequence도 List 처럼 일련의 데이터를 표현하는 인터페이스
// 그러나 List 와 달리, Sequence는 각 데이터를 게으르게Lazily 계산하기 때문에 잠재적으로 무한대의 데이터를 다룰수 있다.
// Sequence는 크기가 정해져 있지 않다.
// public interface Sequence<out T>
// 	public operator fun iterator(): Iterator<T>
// public fun <T> sequenceOf(vararg elements: T): Sequence<T> = if (elements.isEmpty()) emptySequence() else elements.asSequence()

fun main(args: Array<String>)
{
	val seq: Sequence<Int> = sequenceOf(1, 2, 3)	// 1,2,3을 원소로하는 List 생성한뒤 Sequence로 변환.

	for (i in seq)
		print("$i ")	// 출력: 1 2 3 
}
