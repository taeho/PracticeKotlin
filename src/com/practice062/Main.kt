package com.practice062.ex_in_operator
// in 연산자

fun main(args: Array<String>)
{
	// 'o' in "Kotlin" 는 컴파일 시 "Kotlin".contains('o')로 번역
	println('o' in "Kotlin")	// o는 포함됬으니, 출력: true
	// 'in' !in "Kotlin" 는 컴파일 시 !"Kotlin".contains('in')로 번역
	println("in" !in "Kotlin")	// in은 포함이 되어있는데, 없다라고 번역하면, 출력: false
}
