package com.practice049.ex_string_plus

//String 타입 변수도 스태인이 아닌 힙 영역에 실제 데이터 생성
fun main(args: Array<String>)
{
	var first = "Hello "
	var second = "World"	
	first += second			// first 변수에 first와 second가 가리키는 문자열을 합쳐 저장.
	// 기존문자열은 사라지지 않고 그대로 남고, 합쳐진 문자열이 새롭게 생성된다.
}
