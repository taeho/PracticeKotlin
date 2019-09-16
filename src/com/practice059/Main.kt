package com.practice059.ex_operator_overloading

fun main(args: Array<String>)
{
	val pt1 = Point(3, 7)	// 인스턴스 생성, 초기화
	val pt2 = Point(2, -6)

	val pt3 = pt1 + pt2	// Point 클래스의 멤버함수가 대신 호출
	val pt4 = pt3 * 6
	val pt5 = pt4 / 3

	pt3.print()	// 출력: x: 5, y: 1
	pt4.print()	// 출력: x: 30, y: 6
	pt5.print()	// 출력: x: 10, y: 2
}
