package com.practice176.ex_real_number_to_binary
// 176 toBits, toRawBits 확장 함수: 실수 타입을 이진수 값으로 가져오기
// toBits 와 toRawBits 확장 함수를 이용하면 실수 값이 어떤 이진수 배열로 되잇는지 확인가능
// Double 과 Float의 이진수 배열을 Long 과 Int 타입 그대로 옮기는 방식

fun main(args: Array<String>)
{
	val normal = 10.0
	val infinite = 10.0 / 0
	val nan = 0.0 / 0

	println(normal.toBits().toString(2))	// 출력: 100000000100100000000000000000000000000000000000000000000000000 
	println(infinite.toBits().toString(2))	// 출력: 111111111110000000000000000000000000000000000000000000000000000
	println(nan.toBits().toString(2))		// 출력: 111111111111000000000000000000000000000000000000000000000000000

	println(normal.toRawBits().toString(2))	// 출력: 100000000100100000000000000000000000000000000000000000000000000
	println(infinite.toRawBits().toString(2))	// 출력: 111111111110000000000000000000000000000000000000000000000000000
	println(nan.toRawBits().toString(2))	// 출력: -1000000000000000000000000000000000000000000000000000

}
