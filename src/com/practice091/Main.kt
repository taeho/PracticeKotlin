package com.practice091.ex_const
// const: 변수에 접근하는 코드를 변수에 저장된 값으로 대체

const val hello = "Hello" + " World!"	// 전역변수 hello에 const 키워드 추가
// const 키워드는 전역 변수, 오브젝트의 프로퍼티 등에 붙일 수 있다.
// const 붙은 변수는 리터럴로 이루어진 표현식만 저장가능

object Foo
{
	const val bar = "bar"	// 오브젝트 bar 프로퍼티에 const 키워드. 리터럴표현식 저장
}

fun main(args: Array<String>)
{
	println(hello)	// 출력: Hello World!
	println(Foo.bar) // 출력: bar
	println(hello)	// 출력: Hello World!
	println(Foo.bar) // 출력: bar
}
