package com.practice127.ex_class_delegation
// 클래스의 위임 class delegation
// 코틀린에서는 인터페이스의 구현을 다른 클래스에 맡길수 있는 문법 설명

class ClassDelegator : Plusable	// Plusable 인터페이스를 구현하는 클래스 선언
{
	override fun plus(other: Int): Int
	{
		println("기본 구현")
		return other
	}
}
