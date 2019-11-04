package com.practice160.ex_run_extension_function
//run 확장 함수 
//public inline fun <T, R> T.run(block: T.() -> R): R {
//    contract {
//        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
//    }
//    return block()
//}
// 리시버 타입에 제네릭이 적용되어 있어, run 확장함수는 모든 타입에 적용할수 있다.
// block 을 매개변수로 T.() -> R 형태의 함수를 받는데, run 함수를 호출하면 바로 block 호출리턴

fun main(args: Array<String>)
{
	val a = 10
	val b = 5
	(a * b - 2 * a).run {	// run 확장 함수의 리시버로 "a * b - 2 * a" 를 지정, 이코드는 if(a*b-2*a>0) println(a*b-2*a)
		if (this > 0)
			println(this)	// 출력 : 30
	}
}
