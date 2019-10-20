package com.practice123.ex_enum_class_members
//  열거 클래스에 프로퍼티와 멤버 함수 선언하기

enum class Mode(val number: Int)	// 일반 클래스 처럼 생성자 매개변수에서 프로퍼티를 선언하고 있다.
{
	SELECTION(0),	// 열거 클래스에 생성자가 있으면, 열거 상수 각각에(인수)를 적어 생성자를 호출해야한다.
	PEN(1),			// 열거 상수 각각이 열거클래스의 인스턴스라고 생각하면 된다.
	SHAPE(2),
	ERASER(3);		// 마지막 열거 상수에는 끝에 세미콜론 필수 ;

	fun printNumber()	// 열거 클래스에 멤버 함수 선언. 열거 클래스의 프로퍼티나 멤버 함수는 반드시 열거 상수 나열문보다 뒤에 와야한다.
	{
		println("모드: $number")
	}
}

fun main(args: Array<String>)
{
	// 현재 선택된 모드
	val mode: Mode = Mode.ERASER

	println(mode.number)	// 출력: 3, 열거클래스의 ERASER상수의 프로퍼티와 멤버 함수에 접근
	mode.printNumber()		// 출력: 모드: 3
}
