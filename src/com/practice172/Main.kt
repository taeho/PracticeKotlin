package com.practice172.ex_hypot_function
// 172 hypot 함수: 빗변의 길이 구하기
// hypot는 hypotenuse빗변의 약자. 빗변의 길이를 구하는데 사용 
/**
 * Computes `sqrt(x^2 + y^2)` without intermediate overflow or underflow.
 *
 * Special cases:
 *   - returns `+Inf` if any of arguments is infinite
 *   - returns `NaN` if any of arguments is `NaN` and the other is not infinite
 */
//@SinceKotlin("1.2")
//@InlineOnly
//public actual inline fun hypot(x: Double, y: Double): Double = nativeMath.hypot(x, y)

import kotlin.math.hypot

fun main(args: Array<String>)
{
	println(hypot(3.0, 4.0))	// 출력: 5.0  // 9 + 16 = 루트25니까  계산하면 상수 5 
}
