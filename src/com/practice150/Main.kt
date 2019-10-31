package com.practice150.ex_char_sequence_interface
// CharSequence 인터페이스 , 문자열과 관련된 클래스가 구현하는 뼈대 인터페이스
// CharSequence 인터페이스는 String, StringBuilder 등, 문자열과 곤련된 클래스들이 구현하는 기본 뼈대 인터페이스 

fun main(args: Array<String>)
{
	val seq: CharSequence = "Hello"
	println(seq.length)	// 출력: 5	// 길이를 반환한다 
	println(seq[2])	// 출력: l		// 2번째 인덱스의 문자를 출력한다.
	println(seq.subSequence(1, 4))	// 출력: ell	// [1,4] 구간의 인덱스에 해당하는 문자들을  뽑아출력 
}
