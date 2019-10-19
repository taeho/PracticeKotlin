package com.practice121.ex_array_to_vararg
// 배열을 가변 인수로 활용하기
// 배열 속의 들어 있는 원소 가변 인수활용 

fun printAll(vararg tokens: String)	// 가변인수를 모두출력하는 함수 
{
	for (token in tokens)
		print("$token ")
}

fun main(args: Array<String>)
{
	val numbers: Array<String> = arrayOf("What's", "your", "name?")
	printAll(*numbers)	// 배열 앞에 *을 찍으면 배열 속의 내용을 가변 인수로 활용 
}
