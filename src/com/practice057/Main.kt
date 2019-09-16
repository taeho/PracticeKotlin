package com.practice057.ex_secondary_constructor
// 보조 생성자 secondary constructor

// 주 생성자 primary constructor Time 선언, second 프로퍼티 선언 및초기화
class Time(val second: Int)
{
	init
	{
		println("init 블록 실행 중")
	}

	// 보조 생성자 1
	// 분과 초로 Time의 인스턴스를 초기화 하는 보조생성자 선언, 만약 클래스에 주생성자가 존재하면  주생성자 먼저 호출
	// this는 이 클래스에 포함된 또 다른 생성자를 호출하는 문법.
	// 여기서는 int 타입하나만 전달하여 주 생성자 호출 
	constructor(minute: Int, second: Int) : this(minute * 60 + second)
	{
		println("보조 생성자 1 실행 중")
	}

	// 보조 생성자 2
	// 시,분,초로 Time의 인스턴스를 초기화
	// 여기도 반드시 주 생성자 먼저 호출. 여기서는 Int 타입 인수두개를 전달하여 생성자호출
	// 즉 보조생성자 1 호출. 그리고 보조생성자1은 주 생성자를 먼저 호출
	constructor(hour: Int, minute: Int, second: Int) : this(hour * 60 + minute, second)
	{
		println("보조 생성자 2 실행 중")
	}

	init
	{
		println("또 다른 init 블록 실행 중")
	}
}

fun main(args: Array<String>)
{
	println("${Time(15, 6).second} 초")
	/* 출력:
 init 블록 실행 중
또 다른 init 블록 실행 중
보조 생성자 1 실행 중
906 초
	 */
	println("${Time(6, 3, 17).second} 초")
	/* 출력:
 init 블록 실행 중
또 다른 init 블록 실행 중
보조 생성자 1 실행 중
보조 생성자 2 실행 중
21797 초
 */
}
