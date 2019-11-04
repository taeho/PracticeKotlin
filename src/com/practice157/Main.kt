package com.practice157.ex_string_builder_class
// StringBuilder 클래스
// String 타입끼리 + 연산을 하면 덧셈의 결과가 heap에 매번 생성되어 메모리낭비.
// StringBuilder 는 이와 다르게 덧붙인다. 

fun main(args: Array<String>)
{
	val builder = StringBuilder()	// StringBuilder 인스턴스 생성 
			.append("2018 ")		// append 멤버 함수는 StringBuilder 를 반환하기때문에 연쇄 호출 가능
			.append("Pyeongchang ")
			.append("Olympic")

	val result = builder.toString()	// 완성된 최종 문자열은 toString 멤버 함수 호출을 통해 수행
	println(result)	// 출력: 2018 Pyeongchang Olympic

}
