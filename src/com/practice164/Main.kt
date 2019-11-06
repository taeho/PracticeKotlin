package com.practice164.ex_also_extension_function
//  also 함수: 객체 생성 및 초기화 코드를 표현식 하나로 압축하기
// apply 와 매개변수 타입만 다르고 동일한 역할을 수행.
//public inline fun <T> T.also(block: (T) -> Unit): T {
//    contract {
//        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
//    }
//    block(this)
//    return this
//}

class Person
{
	var name: String = ""
	var age: Int = 0
	var money: Int = 0

	override fun toString() = "$name $age $money"
}

fun main(args: Array<String>)
{
	println(	// 출력: Alan 0 70
			Person().also { person: Person ->	// also를 사용하면 Person() 표현식이 this로 들어가지 않고
				person.name = "Alan"			// 함수 리터럴의 첫 번째 매개변수, 즉 person 매개변수로 들어간다.
				person.money = 70
			}
	)
}
