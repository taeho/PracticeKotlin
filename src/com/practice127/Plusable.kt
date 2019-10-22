package com.practice127.ex_class_delegation
// 클래스의 위임 class delegation
// 코틀린에서는 인터페이스의 구현을 다른 클래스에 맡길수 있는 문법 설명

interface Plusable
{
	operator fun plus(other: Int): Int	// Int 타입과 덧셈을 가능하게 하는 인터페이스 선언
}
