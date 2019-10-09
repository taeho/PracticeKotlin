package com.practice107.ex_higher_order_function
// 고차함수Higher-order Function
// 함수 리터럴의 구체적인 용도에 대한 설명이 되는 함수
// 함수리터럴은 보통 고차함수를 위해 사용, 고차함수는 인수로 함수를 받거나, 함수를 반환하는 함수

fun decorate(task: () -> Unit)	// () -> Unit 타입의 함수를 인수로 받는 고차함수 decorate를 선언
{
	println("=== 작업 시작 ===")	// 작업 시작 전
	task()		// task 매개변수가 가리키는 함수 호출
	println("=== 작업 끝 ===")		// 작업 수행 후
}

fun main(args: Array<String>)
{
	decorate({		// decorate 함수에 함수 리터럴을 인수로 전달
		val a = 10
		val b = 5
		println("$a + $b = ${a + b}")
	})
	//=== 작업 시작 ===
	//10 + 5 = 15
	//=== 작업 끝 ===
	decorate({		// decorate 함수에 함수 리터럴을 인수로 전달
		println("some")
		println("tasks")
	})
	//=== 작업 시작 ===
	//some
	//tasks
	//=== 작업 끝 ===
}
