package com.practice122.ex_enum_class
// 열거 클래스 enum class, 정해진 집한 내의 값을 표현하기 위한 열거클래스 
// 

enum class Mode	// 열거 클래스 언언, 클래스 앞에 enum 키워드 붙임.
{
	SELECTION, PEN, SHAPE, ERASER	// 쉼표로 나열, 대문자로 권장
}

fun main(args: Array<String>)
{
	// 현재 선택된 모드
	val mode: Mode = Mode.PEN	//Mode 타입의 변수는 열거클래스.열거상수 형태로 초기화. Mode.PEN 표현식의 타입은 Mode

	when (mode)	//mode에 저장된 열거상수에 따라 분기 처리.
	{
		Mode.SELECTION -> println("선택 모드")	
		Mode.PEN -> println("펜 모드")
		Mode.SHAPE -> println("도형 모드")
		Mode.ERASER -> println("지우개 모드")
	}
}
