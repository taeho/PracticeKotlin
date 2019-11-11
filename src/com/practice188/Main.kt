package com.practice188.ex_timer_function
// 188 timer 함수: 타이머 생성하기

import java.util.*
import kotlin.concurrent.timer

//@kotlin.internal.InlineOnly
//public inline fun timer(name: String? = null,	// 타이머의 이름 지정
//          daemon: Boolean = false,	// 데몬 스레드로 만들것인지 여부 지정
//			initialDelay: Long = 0.toLong(),	// 초기 지연 시간을 밀리 초 단위로 설정
//			period: Long, crossinline	// 주기를 밀리 초 단위로 설정
//			action: TimerTask.() -> Unit): Timer {	/// 매주기마다 실행할 함수를 지정 
//    val timer = timer(name, daemon)
//    timer.schedule(initialDelay, period, action)
//    return timer
//}

fun main(args: Array<String>)
{
	var i = 1
	val t: Timer = timer(initialDelay = 1500, period = 250) {	// 1500 밀리초 간 대기 뒤, 250 밀리초마다 정수의 값을 증가시키며 출력하는 타이머 생성
		println(i)
		i += 1
	}

	Thread.sleep(2400)	// 2400 밀리초 만큼 대기하고 , 
	t.cancel()			// Timer의 cancel 멤버함수로 타이머 중단. 1부터 4까지 출력하고 종료	
}
