package com.practice102.ex_destructuring_object
// 객체 분해하기
// 데이터클래스의 인스턴스에 한해 , 객체를 여러개의 변수로 쪼개는 것이 가능하다.

data class Employee(val name: String,
                    val age: Int,
                    val salary: Int)

fun main(args: Array<String>)
{
	val (name, _, salary) = Employee("John", 30, 3300)	// Employee는 데이터 클래스이므로, Employee타입의 표현식을 여러변수로 쪼갤수 있따.
	// name,  _ , salary 변수가 선언과 동시에 Employee의 프로퍼티 순서대로 초기화. 안쓰는 변수는 언더스코어를 사용
	// 어떤 객체에서 필요한 부분만 변수로 추출할때 유용
	println(name) // 출력: John
	println(salary) // 출력: 3300
}
