package com.practice159.ex_to_list
// toList 확장 함수 : List 타입으로 변환하기
// toList는 어떤 타입을 List로 전환하는 확장 함수 

fun main(args: Array<String>)
{
	// NOTE: Pair 객체 내부의 타입이 모두 같아야 한다.
	val list: List<Int> = Pair(10, 20).toList()	//Pair 객체를 List 객체로 전환

	// NOTE: Triple 객체 내부의 타입이 모두 같아야 한다.
	val list2: List<Double> = Triple(3.1, 6.25, 8.15).toList()	// Triple 객체를 List 객체로 전환
}
