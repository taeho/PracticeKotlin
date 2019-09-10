package com.practice046.ex_memory_heap
// 객체가 만들어지는 공간 heap

fun main(args: Array<String>)
{
	// 처음에는 스택에 person 변수가 쌓이고.
	// object{..}부분이 실행되어 힙heap 영역에 객체 생성.
	val person = object	// 참조변수 person: 실제값을 가지지 않고 객체의 좌표만 저장하는 변수, 좌표값은 참조값Reference Value 라고 부른다.
	{
		val name: String = "홍길동"
		val age: Int = 36
	}

	println(person.name)
	println(person.age)
}
