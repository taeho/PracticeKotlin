package com.practice083.ex_access_modifier_private

fun main(args: Array<String>)
{
//	num = 5 // 에러, num은 private 이기 때문에. Test.kt외부파일에서 접근하면 에러 
	hello(15)	// hello 함수는 public 이기때문에 접근가능. 간접적으로 num 전역변수 값 수정, 출력: 15

	val person = Person(10)	// 
	println(person.age)	// person 객체의 age 프로퍼티 접근, age 프로퍼티는 public이나 , setter는 privte이므로 외부 수정 불가
//	person.age = 20 // 에러

	println(person.isYoung)	// public 프로퍼티로써 접근가능. 출력 : True
}
