package com.practice056.ex_property_in_constructor
// 생성자와 프로퍼티 한번에 쓰기

// 생성자 매개변수 앞에 val 키워드 사용. 그리고 매개변수에 들어온 인수가 초기값인된다.
// speed 매개변수는 디폴수 인수를 지정하여 프로퍼티를 좀더 간편히 초기화
class Car(val name: String, val speed: Int = 0)	

fun main(args: Array<String>)
{
	val car = Car("My Car")
	println(car.name)	// 출력: My Car
	println(car.speed)	// 출력: 0
}
