package com.practice189.ex_synchronized_function
// 189 synchronized 함수: 스레드 동기화하기
// 코틀린에서는 스레드를 동기화하려면 synchronized 함수를 이용해야 한다.
// public actual inline fun <R> synchronized(lock: Any, block: () -> R): R {
// lock은 동시 수정으로 부터 보호할 객체, block은 lock 객체를 점유하고 잇는 동안 실행할 함수 

import kotlin.concurrent.thread

private var obj: Int = 0

private fun objPlus()	// 전역변수 obj 의 값을 1000 번 증가시키는 함수 
{
	for (i in 1..1000)
		synchronized(obj) {	// obj의 값을 증가시키는 코드를 동기화 블록으로 감쌌다
			obj++
		}
}

fun main(args: Array<String>)
{
	thread { objPlus() }	// 두개의 스레드에서 obj의 값을 동시에 증가시키고잇다
	objPlus()				// 두개의 스레드에서 obj의 값을 동시에 증가시키고잇다
	Thread.sleep(100)		// 스레드가 종료될 때 까지 대기하는 코드
	println(obj)			// obj 값출력: 2000
}
