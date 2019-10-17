package com.practice119.ex_for
// 흐름제어 반복문 for

fun main(args: Array<String>)
{
	for (i: Int in 1..10)	// IntRange 클래스에는 Iterator<Int> 타입을 반환하는 iterator 연산자 멤버 함수가 선언 되어 있으므로 for문의 in 연산자 적용 가능.
		// iterator의 타입 인수가 Int 이므로, Int 타입과 호환되는 타입의 변수만 for 문의 소괄호 속에 선언 할수 잇다.
		print("$i ")	// 출력 : 1 2 3 4 5 6 7 8 9 10 

	println()	// 줄바꿈 수행 

	for (i: Int in 1..10)
	{
		if (i > 5)
			break

		print("$i ")	// 출력 : 1 2 3 4 5
	}
}
