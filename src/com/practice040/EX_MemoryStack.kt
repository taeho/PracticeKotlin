package com.practice040
// 지역변수는 실제로 어디에 생길까.? 메모리영역중에 스택에...쌓이지..


fun main(args: Array<String>)
{
	val a = -36
	val result = absolute(a)
	println(result)	// 출력: 36
}

// 입력받은 정수의 절대값을 반환하는 함수
fun absolute(number: Int): Int
{
	return if (number >= 0)
		number
	else -number	// 음수면 반전시킨다.
}
