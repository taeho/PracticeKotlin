package com.practice180.ex_verify_real_number
// Double 값 검증하기 
// Double에는 NaN 또는 Infinite 무한 이라는 특수값이 들어갈수잇다.

fun main(args: Array<String>)
{
	val a: Double = 0.0 / 0.0	// 0.0 / 0.0 표현식은 NaN이 나온다.
	val b: Double = 7 / 0.0		// Infinity 값이 결과로 나온다.
	val c: Double = 3.2			// 정상적인 실수값 표현된다. 

	print("$a ")		// 출력: NaN
	println(a.isNaN())	// 출력: true
	/**
	 * Returns `true` if the specified number is a
	 * Not-a-Number (NaN) value, `false` otherwise.
	 */
	//@kotlin.internal.InlineOnly
	//public actual inline fun Double.isNaN(): Boolean = java.lang.Double.isNaN(this)

	print("$b ")				// 출력: Infinity
	println(b.isInfinite())		// 출력: true
	/**
	 * Returns `true` if this value is infinitely large in magnitude.
	 */
	//@kotlin.internal.InlineOnly
	//public actual inline fun Double.isInfinite(): Boolean = java.lang.Double.isInfinite(this)

	print("$c ")			// 출력: 3.2
	println(c.isFinite())	// 출력: true
	/**
	 * Returns `true` if the argument is a finite floating-point value; returns `false` otherwise (for `NaN` and infinity arguments).
	 */
	//@kotlin.internal.InlineOnly
	//public actual inline fun Double.isFinite(): Boolean = !isInfinite() && !isNaN()

}
