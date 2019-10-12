package com.practice111.ex_generic_several_types
// 여러 타입을 인수로 받기
// 타입인수를 여러개 받으려면 fun 키워드와 함수 이름 사이를 <타입1, 타입2, ..>형식으로 적는다.

fun <T, R> T.map(mapper: (T) -> R): R	//타입 매개변수 T와 R을 선언하여, 두개의 타입인수를 받을수 있게 했다.
// mapper 매개변수에는 T타입을  R 타입 으로 변환하는 함수를 받도록 한다.
// T.map에서 볼수 있듯이, 확장함수의 리시버에도 타입 매개변수를 적용가능. 타입이 쓰일수 있는 대부분의 자리에 타입 매개변수 쓸수 있다.
{
	return mapper(this)	// 매개변수로 받은 mapper 함수에 리시버(this)를 넣어 호출한뒤, 반환값을 그대로 반환.
}

fun main(args: Array<String>)
{
	val square: Int =		// 11에 map 확장 함수를 호출한뒤, 제곱을 반환하는 함수를 mapper 매개변수로 전달햇다. 
			11.map {		// 원래는 11.map<Int, Int>{...} 로 써주어야 하지만, 함수리터럴로 타입 추론이 가능 해서 인수 생략.
				it * it		// 함수 리터럴의 매개변수 11과 반환값 it * it 이 Int 타입이므로, T와 R에 각각 Int타입이 들어간다.
			}				// map 확장 함수의 반환값을 square 변수에 저장.
	println(square)			// 출력: 121
}
