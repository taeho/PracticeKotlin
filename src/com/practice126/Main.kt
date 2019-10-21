package com.practice126.ex_delegated_property
// 위임된 프로퍼티 delegated property
// 프로퍼티의 Getter/Setter 구현을 다른 객체에 맡기는 방법을 알아본다.

fun main(args: Array<String>)
{
	val sample = Sample()

	sample.number = -50	// 실행되는 순간 OnlyPositive의 setValue 호출, 0으로 저장.
	println(sample.number)	// 출력: 0

	sample.number = 100	// OnlyPositive 의 realValue에 100 저장.
	println(sample.number)	// 출력: 100
}
