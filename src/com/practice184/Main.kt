package com.practice184.ex_measure_performance
// 184 코드 성능 측정하기
/**
 * Executes the given [block] and returns elapsed time in milliseconds.
 */
//public inline fun measureTimeMillis(block: () -> Unit): Long {
//    val start = System.currentTimeMillis()
//    block()
//    return System.currentTimeMillis() - start
//}
/**
 * Executes the given [block] and returns elapsed time in nanoseconds.
 */
//public inline fun measureNanoTime(block: () -> Unit): Long {
//    val start = System.nanoTime()
//    block()
//    return System.nanoTime() - start
//}
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

fun main(args: Array<String>)
{
	println(measureTimeMillis {	// 밀리초	// 출력: 74
		var sum = 0L
		for (i in 1..100000000)
			sum += i
	})

	println(measureNanoTime {	// 나노초	// 출력: 71942300
		var sum = 0L
		for (i in 1..100000000)
			sum += i
	})
}
