package com.practice051.ex_triple_equals
// === : 두 참조 변수가 같은 객체를 가리키고 있는지 여부 체크, 같으면 true, 아니면 false
// !== : 두 참조변수가 다른객체를 가리키고 있을 때 True

fun main(args: Array<String>)
{
	var a = "one"
	var b = "one"	// String 타입의 리터널로 이루어진 표현식에 한해, 참조변수에 동일한 문자열을 저장하면
	// 컴파일러는 매번 새로운 문자열을 생성하지 않고 하나의 문자열을 가리키도록 함.

	println(a === b)	// 출력: true

	b = "on"		//on 문자열 저장
	b += "e"		//e 문자열 누적. 표현식이 리터럴이 아니면 새로운 문자열 생성
	println(a !== b)	// 출력: true, 그래서 참

	b = a	// b에 a가 가진 참조값 저장.
	println(a === b)	// 출력: true
}
