package com.practice061.ex_invoke_operator
// 호출 연산자 invoke operator ()

fun main(args: Array<String>)
{
	val product = Product(762443, "코틀린 200제")
	product(108)	//product(108)은 컴파일시 product.invoke(108)로 번역
}
