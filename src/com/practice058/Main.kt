package com.practice058.ex_property_getter_setter
// 프로퍼티와 getter setter

fun main(args: Array<String>)
{
	val person = Person()
	person.age = -30	// person객체의 age 프로퍼티에 값을 저장. 프로퍼티에 특정값을 대입하면 setter 호출
	println(person.age)	// 출력: 0, Person 프로퍼티의 setter 속성에 0보다 적으면 0
	//프로퍼티는 실제로 데이터가 저장되는 공간 field.
	// 저장된값을 읽을 때 호출되는 함수 getter
	// 값을 저장할때 호출되는 함수 Setter로 이루어짐.
	// val 프로퍼티는 초기값이 주어지면 더이상 셋팅 불가 그래서 getter만 존재한다.
}
