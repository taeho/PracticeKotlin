package com.practice161.ex_let_extension_function
// let 확장함수 : 코드 중복 줄이기
// let 함수도 매개변수의 타입만 다를뿐 run과 거의 유사한 역할
// public inline fun <T, R> T.let(block: (T) -> R): R
// {	return block(this)		}

fun main(args: Array<String>)
{
	val a = 10
	val b = 5
	// let를 사용하면 (a * b - 2 * a) 표현식이 this로 들어가지 않고, 함수 리터럴의 첫 번째 매개변수, 즉 result 매개변수로 들어간다. 
	(a * b - 2 * a).let { result: Int ->
 		if (result > 0)
			println(result)	// 출력: 30
	}
}
