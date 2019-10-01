package com.practice092.ex_lateinit
// 프로퍼티의 초기화를 유예하는 방법
// 클래스의 프로퍼티는 선언과 동시에 초기화하거나, init 블록안에서 반드시 초기화해주어야한다.

// 점을 표현하는 클래스
class Point(val x: Int, val y: Int)

// 사각형을 표현하는 클래스
class Rect
{
	lateinit var pt: Point	// pt앞에 lateint 키워드 붙임. 바로 초기화 안해도 된다. 그리고 이 키워드는 var 프로퍼티만 가능
	lateinit var pt2: Point

	val width: Int			// 사각형의 너비, 높이, 넓이를 갖고 있는 프로퍼티 선언.
		get() = pt2.x - pt.x	// 실시간 계싼을 위한 getter 를 커스터마이징
	val height: Int
		get() = pt2.y - pt.y
	val area
		get() = width * height
}

fun main(args: Array<String>)
{
	val rect = Rect()
	rect.pt = Point(3, 3)	// reat 객체의 pt, pt2 프로퍼티에 Point 객체 지정
	rect.pt2 = Point(6, 5)

	println("너비: ${rect.width}")	// 출력: 너비: 3 // rect 객체의 너비, 높이, 넓이 출력.	
	println("높이: ${rect.height}")	// 출력: 높이: 2 // 만일 pt와 pt2의 프로퍼티에 값을 지정하지 않은 채 프로퍼티에 접근하면
	println("넓이: ${rect.area}")		// 출력: 넓이: 6 // UninitializedPropertyAccessException 예외 발생
}
