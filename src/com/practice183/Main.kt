package com.practice183.ex_exit_process_function
// 183 exitProcess 함수: 어디서나 프로그램 종료하기
//exitProcess를 이용해 어느 부분 진행중이더라도 프로그램을 바로 종료가능 
//@kotlin.internal.InlineOnly
//public inline fun exitProcess(status: Int): Nothing {
//    System.exit(status)
//    throw RuntimeException("System.exit returned normally, while it was supposed to halt JVM.")
//}

import kotlin.system.exitProcess

fun main(args: Array<String>)
{
	something(-1)
	println("Hello")
}

fun something(num: Int)
{
	if (num < 0)
		exitProcess(0)	// 인수 호출이 -1이므로 exitProcess(0)이 호출된다.
}
