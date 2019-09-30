package com.practice090.ex_inline_function
// 인라인inline 함수, 함수 호출문이 함수 속에 들어있는 문장으로 대체되는 함수

// inline 함수를 사용하면 실행를 점프 하지 않고 함수 호출문을 함수의 몸체로 대체하기때문에 좋다
inline fun hello()	// 함수앞에 inline 키워드를 붙이면 그 함수는 inline 함수가 된다.
{
	println("Hello")
	println("Kotlin")
}

fun main(args: Array<String>)
{
	hello()	// inline 함수 호출, 즉, println("Hello") println("Kotlin")
	hello() // inline 함수 호출, 즉, println("Hello") println("Kotlin")
	hello() // inline 함수 호출, 즉, println("Hello") println("Kotlin")
}
// inline 함수는 함수 속의 문장을 재활용하지 않기 때문에, 프로그램 크기가 커질수 잇다.