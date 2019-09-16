package com.practice059.ex_operator_overloading

class Point(var x: Int = 0, var y: Int = 0)
{
	// operator의 의미는 Point의 인스턴스간에 연산자를 사용햇을때 멤버함수를 대신 호출해달라는 뜻
	operator fun plus(other: Point): Point
	{
		return Point(x + other.x, y + other.y)
	}

	operator fun minus(other: Point): Point
	{
		return Point(x - other.x, y - other.y)
	}

	operator fun times(number: Int): Point
	{
		return Point(x * number, y * number)
	}

	operator fun div(number: Int): Point
	{
		return Point(x / number, y / number)
	}

	// 좌표 값을 출력한다.
	fun print()
	{
		println("x: $x, y: $y")
	}
}
