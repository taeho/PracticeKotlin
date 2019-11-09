package com.practice173.ex_mathematical_constant
// 173 지수함수

import kotlin.math.*

fun main(args: Array<String>)
{
	println(sqrt(2.0))		// 출력: 1.4142135623730951
	// sqrt는 square root(제곱근)의 약자 루트 x값을 반환한다.

	println(2.0.pow(0.5))	// 출력: 1.4142135623730951
	// pow 는 리시버의 x 제곱을 반환하는 확장함수 , 즉 2.0의 0.5 제곱근을 반환

	println(exp(2.0))		// 출력: 7.38905609893065
	// exp는 e의 x승 값을 반환한다.

	println(expm1(2.0))		// 출력: 6.38905609893065
	// expm1 은 e의 x승의 마이너스 1 을 반환 

}
