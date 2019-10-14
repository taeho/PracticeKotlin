package com.practice114.ex_inherit_from_generic
// 제네릭이 적용된 클래스/ 인터페이스 상속*구현하기

interface Plusable<T>	// T타입과 덧셈을 가능하게 하는 인터페이스 선언
{
	operator fun plus(other: T): T	
}
