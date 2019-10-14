package com.practice113.ex_generic_to_class_and_interface
// 클래스와 인터페이스에서 제네릭 사용하기

fun main(args: Array<String>)
{
	val pair: Pair<Int, Double>	// 제네릭이 적용된 클래스와 인터페이스에는 이름 옆에 <타입인수>를 붙여야한다.
	// Pair<Int, Double> 부분은 하나의 고유한 타입으로 취급된다. 따라서 Pair<Int, Int>와 Pair<Int, Double>은 서로 다른 타입.
	pair = Pair<Int, Double>(15, 9.12)	// 생성자를 호출할때도 생성자 이름옆에 <타입인수를 붙인다.
	println(pair.toString())	// 출력 15    9.12
}
