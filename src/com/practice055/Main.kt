package com.practice055.ex_init_blocks

class Size(width: Int, height: Int)
{
	val width = width	// 선언과 동시에 초기화
	val height: Int		// 단순 프로퍼티 선언만

	init
	{
		this.height = height	// 매개변수 height초기화
	}

	val area: Int	// 여기도 선언만

	init
	{
		area = width * height	// width * height의 곱으로 area 초기화
	}
}

fun main(args: Array<String>)
{
	val size = Size(10, 50)	// Size 인스턴스 생성
	println(size.area)	// 출력: 500
}
