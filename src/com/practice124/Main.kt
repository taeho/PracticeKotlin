package com.practice124.ex_enum_class_practice
//열거 클래스활용
// 모든 열거 클래스는 자동으로 Enum 클래스 상속
// Enum 클래스에는 val name String, Val ordinal:Int 멤버가 있다.
// 그리고 기본적으로 fun valueOf(value:String): 열거 클래스, fun values():Array<열거클래스> 와 같은 멤버함수 포함.

enum class Mode	// 열거 클래스 
{
	SELECTION, PEN, SHAPE, ERASER
}

fun main(args: Array<String>)
{
	val shapeMode: Mode = Mode.SHAPE // Mode.SHAPE 열거상수를 shapeMode 변수에 대입
	println(shapeMode.name)	// 출력: SHAPE
	println(shapeMode.ordinal)	// 출력: 2 , 열거상수는 0부터 시작하기때문에 

	val modes: Array<Mode> = Mode.values()	// 열거 클래스 values 멤버함수는 열거클래스에 있는 모든 열거 상수를 배열로 반환
	for (mode: Mode in modes)	// for문을 이용해서 열거 상수 모두출력
		println(mode)	// 출력: SELECTION PEN  SHAPE ERASER

	println(Mode.valueOf("PEN").ordinal)	//출력: 1	, "PEN"에 해당하는 열거상수 index 출력 	
}
