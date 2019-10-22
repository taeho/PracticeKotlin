package com.practice127.ex_class_delegation
// 클래스의 위임 class delegation
// 코틀린에서는 인터페이스의 구현을 다른 클래스에 맡길수 있는 문법 설명

fun main(args: Array<String>)
{
	println(Sample() + 10) // ClassDelegator의 plus가 호출
	// 출력: 기본구현
	// 출력: 10
}
