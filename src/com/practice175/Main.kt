package com.practice175.ex_trigonometric_function
// 175 삼각함수

import kotlin.math.*

fun main(args: Array<String>)
{
	// 코틀린의 내장된 삼각함수들은 Double 또는 Float 타입의'라디안' 값을 인수로 받으며, 상응하는 삼각함수의 값을 Double 또는 Float 타입으로 반환한다.
	println(sin(PI / 4))	// 출력: 0.7071067811865475 
	println(cos(PI / 4))	// 출력: 0.7071067811865476
	println(tan(PI / 4))	// 출력: 0.9999999999999999

	// 삼각함수의 역함수 값을 출력
	println(asin(PI / 4))	// 출력: 0.9033391107665127
	println(acos(PI / 4))	// 출력: 0.6674572160283838
	println(atan(PI / 4))	// 출력: 0.6657737500283538

	// 쌍곡선 함수의 값을 출력
	println(sinh(PI / 4))	// 출력: 0.8686709614860095
	println(cosh(PI / 4))	// 출력: 1.3246090892520057
	println(tanh(PI / 4))	// 출력: 0.6557942026326724

	// 쌍곡선 함수의 역함수 값을 출력
	println(asinh(PI / 4))	// 출력: 0.7212254887267799
	println(acosh(PI / 4))	// 출력: NaN	// Not a Number 의 약자, 값을 계산할수없음 의미
	println(atanh(PI / 4))	// 출력: 1.059306170823243

}
