package com.practice177.ex_binary_to_real_number
// 177 fromBits 확장 함수: 이진수 값으로부터 실수 값 만들기
// fromBits는 toBits 의 반대 역할

fun main(args: Array<String>)
{
	val realNumber: Float = Float.fromBits(0b01000001_00100111_10101110_00010100)
	println(realNumber)	// 출력: 10.48

}
