package com.practice116.ex_kotlin_in_out
// in, out 키워드. - 타입 매개변수에 붙일수 잇다.

class AAA<out T>	// AAA 클래스의 타입 매개변수 앞에 out 키워드를 붙였다. 이렇게 하면 AAA<서브타입>을 AAA<슈퍼타입>에 대입할수 있게된다.
// out T는 자바의 ? extends T와 같다.

class BBB<in T>	// BBB 클래스의 타입 매개변수 앞에 in 키워드를 붙였다 . 이렇게 하면 BBB<슈퍼타입>을 BBB<서브타입>에 대입할수 잇게된다.
// in T 는 자바의 ? super T와 같다.

fun main(args: Array<String>)
{
	val aaaSub = AAA<Int>()
	val aaaSuper: AAA<Any> = aaaSub

	val bbbSuper = BBB<Any>()
	val bbbSub: BBB<Int> = bbbSuper

	val star: AAA<*> = aaaSub	// 타입인수로 *를 지정하면 , 타입인수가 무엇이든 상관없이 AAA 타입을 대입할 수 있다. 즉, AAA<Any>든, AAA<Int>든, AAA<String> 이든 상관없이 star 변수에 대입가능.
}
