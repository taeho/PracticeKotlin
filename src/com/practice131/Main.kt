package com.practice131.ex_comparable_interface
// Comparable 인터페이스: 클래스를 비교 가능하게 만들기
//public interface Comparable<in T> { 
//    public operator fun compareTo(other: T): Int
//}
// 타입 매개변수 T를 받으며, 연산자 멤버 함수로 compareTo를 가지고 있다.
// 즉, Comparable 인터페이스를 구현하는 클래스는 비교 연산자(>, <, >=, <=)를 지원하게 된다.

class Rectangle(val width: Int, val height: Int) : Comparable<Rectangle>
{
	val area = width * height

	override fun compareTo(other: Rectangle): Int =	// 사각형의 넓이로 인스턴스의 대소를 비교하도록 compareTo 를 오버라이딩 
			when
			{
				this.area > other.area -> 1
				this.area < other.area -> -1
				else -> 0
			}
}

fun main(args: Array<String>)
{
	val rect = Rectangle(3, 5)		// Rectangle 인스턴스들끼리 대소비교
	val rect2 = Rectangle(7, 3)
	val rect3 = Rectangle(2, 9)

	println(rect >= rect3)	// 출력: false
	println(rect < rect2)	// 출력: true
	println(rect2 > rect3)	// 출력: true
}
