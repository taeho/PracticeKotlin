package com.practice163.ex_apply_extension_function
// apply 함수  : 객체 생성 및 초기화 코드를 표현식 하나로 압축하기 
//public inline fun <T> T.apply(block: T.() -> Unit): T {	// 함수내부, T.() -> Unit 타입의 함수를 block 매개변수로 받은뒤 곧바로 호출하고, return this를 통해 apply 리시버를 그대로 반환  
//    contract {
//        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
//    }
//    block()
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
			Person().apply {	// person의 인스턴스를 생성한뒤, 곧바로 apply 확장 함수를 호출. apply는 리시버를 그대로 반환하기 때문에 여기는 전체의 표현식이 Person이 된다. 
				this.name = "Alan"	// class Person을 나타낸다
				this.money = 70
			}
	)
}
