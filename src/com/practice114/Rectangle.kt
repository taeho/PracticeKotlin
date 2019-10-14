package com.practice114.ex_inherit_from_generic
// 제네릭이 적용된 클래스/ 인터페이스 상속*구현하기

class Rectangle(val width: Int, val height: Int) : Plusable<Rectangle>
{	// Plusable에는 제네릭이 적용되어 있으므로 , 타입인수를 전달해야한다. 여기서는 Rectangle 타입을 전달
	override fun plus(other: Rectangle) =		// Rectangle 의 width와 height끼리 더한 결과를 반환하도록 plus를 오버라이딩.
			Rectangle(width + other.width, height + other.height)	//Plusable 인터페이스를 구현하면서 타입인수를  Rectangle로 전달했으므로 매개변수와 반환 타입을 Rectangle

	override fun toString() = "width: $width, height: $height"
}
