package com.practice162.ex_with_extension_function
// with 함수: 코드 중복 줄이기
// with는 run과 let 에 비해 이해하기도 쉽고 사용법도 직관적 
//public inline fun <T, R> with(receiver: T, block: T.() -> R): R {
//    contract {
//        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
//    }
//    return receiver.block()
//}	// T타입의 인수를 receiver 매개변수로 받고, 이를  block 매개변수가 가리키는 함수에 바로 넣어 호출 

fun main(args: Array<String>)
{
	val a = 3
	val b = 7

	with(a * b - b * b) {	// with 함수의 인수 a * b - b * b 는 함수 리터럴의 this 로 전달된다. 
		println(this)	// 출력: -28
		println(-this)	// 출력: 28
	}
}
