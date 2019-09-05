package com.practice034

fun main(args: Array<String>)
{
	println(getSumOf(1, 2, 3, 4, 5, 6, 7))	// 7개의 인수전달. 출력: 28
	println(getSumOf(32, 57, 12))	// 3개의 인수전달, 출력: 101
	println(getSumOf())	// 아무것도..이경우 size 0, 출력:0 
}

// 매변수 앞에 vararg 키워드를 붙인다. 이 키워드는 여러개의 인수를 받을수 잇다.
fun getSumOf(vararg numbers: Int): Int
{
	val count = numbers.size	// count에 인수 개수를 저장. .size의 타입은 int
	var i = 0
	var sum = 0

	while (i < count)
	{
		sum += numbers[i]	// sum에 가변 매개변수 numers에 값들을 누적한다. 특정위치는 대괄호 사용.
		i += 1
	}

	return sum
}
