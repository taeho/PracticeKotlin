package com.practice187.ex_thread_function
//187 thread 함수: 스레드 생성하기
// thread 함수는 JVM 의 스레드를 생성하기 때문에, 이 함수를 사용하면 JVM에 의존성이 생긴다.

//public fun thread(
//    start: Boolean = true,	// true로 넘기면 스레드를 생성과 동시에 바로시작
//    isDaemon: Boolean = false,	// 데몬 스레드로 만들지 여부 지정
//    contextClassLoader: ClassLoader? = null,	// 스레드에서 사용할 클래스 로더를 지정
//    name: String? = null,	// 스레드의 이름 지정
//    priority: Int = -1,	// 스레드의 우선순위 1~10 지정, 높은 숫자가 더 높은 우선순위 
//    block: () -> Unit		// 스레드에서 실행할 함수를 지정
//): Thread 

import kotlin.concurrent.thread

fun main(args: Array<String>)
{
	thread(start = true) {	// 스레드를 생성하자마 실행
		print("Hello, ")
		Thread.sleep(1000)	// 자바함수 사용. 밀리초만큼 대기 
		print("World!")
	}

	Thread.sleep(500)	// 500 밀리초 한단어씩
	print("Kotlin ")	// 출력: Hello, Kotlin World!
}
