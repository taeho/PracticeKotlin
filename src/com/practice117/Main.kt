package com.practice117.ex_range
// .. 연산자와 범위 표현식 Range Expression , 범위를 반환하는 연산자.

fun main(args: Array<String>)
{
	val oneToTen: IntRange = 1..10	// .. 연산자는 operator fun rangeTo(매개변수: 자유 타입):자유 타입으로 오버로딩 가능.
	// Int 클래스에는 다음과 같이 rangeTo가 선언되어있다. operator fun rangeTo(other:Int): IntRange
	// 즉, 1..10은 1.rangeTo(10)으로 컴파일되며, IntRange타입의 값이 반환 된다..
	// IntRange는 특정한 정수구간을 표현하는 클래스. 1..10은 1~10 의 구간을 표현한다.
	println(5 in oneToTen) // IntRange 클래스는 contains 연산자 멤버 함수를 갖고 있기 때문에 in 연산자를 사용 가능하다.
	// 표현식 5 in 1..10은 , 정수 5가 1~10 범위에 속해잇는지 여부를 Boolean 타입으로 반환한다.
	// 출력: True

	val upperAtoZ: CharRange = 'A'..'Z'
	// Char타입에는 rangeTo가 선언, operator fun rangeTo(other:Char):CharRange
	// 즉 , 'A'..'Z'는 'A'.rangeTo('Z')으로 컴파일 되며, CharRange 타입의 값이 반환된다. CharRange의 인스턴스는 특정한 문자 구간을 표현한다.
	
	if ('C' in upperAtoZ)
		println("대문자입니다.")	// 출력: 대문자입니다.

	if ('p' in 'a'..'z')
		println("소문자입니다.")	// 출력: 소문자입니다.
}
