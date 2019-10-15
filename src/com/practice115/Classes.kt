package com.practice115.ex_generic_specific_type
// 특정타입을 상속*구현하는 타입만 인수로 받기

class AAA : ValueContainer	// ValueContainer 인터페이스를 구현하는 클래스 선언
{
	override fun getValue(): Int = 1102
}

class BBB : ValueContainer	// ValueContainer 인터페이스를 구현하는 클래스 선언
{
	override fun getValue(): Int = 127
}
