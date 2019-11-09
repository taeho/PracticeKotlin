package com.practice174.ex_logarithmic_function
// 174 로그함수

import kotlin.math.*

fun main(args: Array<String>)
{
	println(log(4f, 2f))	// 출력: 2.0
	//	@SinceKotlin("1.2")
	//public actual fun log(x: Double, base: Double): Double {
	//    if (base <= 0.0 || base == 1.0) return Double.NaN
	//    return nativeMath.log(x) / nativeMath.log(base)
	//}
	println(log2(8f))		// 출력: 3.0
	//	/**
	// * Computes the binary logarithm (base 2) of the value [x].
	// *
	// * @see [ln] function for special cases.
	// */
	//@SinceKotlin("1.2")
	//public actual fun log2(x: Double): Double = nativeMath.log(x) / LN2

	println(log10(10000f))	// 출력: 4.0
	//	/**
	// * Computes the common logarithm (base 10) of the value [x].
	// *
	// * @see [ln] function for special cases.
	// */
	//@SinceKotlin("1.2")
	//@InlineOnly
	//public actual inline fun log10(x: Double): Double = nativeMath.log10(x)

	println(ln(E))			// 출력: 1.0
	//	/**
	// * Computes the natural logarithm (base `E`) of the value [x].
	// *
	// * Special cases:
	// *   - `ln(NaN)` is `NaN`
	// *   - `ln(x)` is `NaN` when `x < 0.0`
	// *   - `ln(+Inf)` is `+Inf`
	// *   - `ln(0.0)` is `-Inf`
	// */
	//@SinceKotlin("1.2")
	//@InlineOnly
	//public actual inline fun ln(x: Double): Double = nativeMath.log(x)

	
	println(ln1p(E))		// 출력: 1.3132616875182228
	//	/**
	// * Computes `ln(x + 1)`.
	// *
	// * This function can be implemented to produce more precise result for [x] near zero.
	// *
	// * Special cases:
	// *   - `ln1p(NaN)` is `NaN`
	// *   - `ln1p(x)` is `NaN` where `x < -1.0`
	// *   - `ln1p(-1.0)` is `-Inf`
	// *   - `ln1p(+Inf)` is `+Inf`
	// *
	// * @see [ln] function
	// * @see [expm1] function
	// */
	//@SinceKotlin("1.2")
	//@InlineOnly
	//public actual inline fun ln1p(x: Double): Double = nativeMath.log1p(x)

}
