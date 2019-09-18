package com.practice063.ex_infix_notation
// 멤버 함수의 중위 표기 법 Infix Notation
// 피연산자 연산자 피연산자 순서로 표현식을 구성하는 방식

class Point(var x: Int = 0, var y: Int = 0)
{
	// base를 원점으로 생각했을 때의 좌표를 반환한다.
	infix fun from(base: Point): Point	// 중위표기법을 지원하려면 멤버 함수선언문 앞에 infix를 붙인다.
	{
		return Point(x - base.x, y - base.y)
	}
}

fun main(args: Array<String>)
{
	// from 멤버함수를 중위표기법으로 호출
	// Point(3, 6) from Point(1, 1)은  Point(3, 6).from(Point(1, 1))의 문법적 변형
	// 점과 소괄화가 줄어서 가독성 향상
	val pt = Point(3, 6) from Point(1, 1)
	println(pt.x)	// 출력: 2
	println(pt.y)	// 출력: 5
}
