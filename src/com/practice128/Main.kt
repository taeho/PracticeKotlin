package com.practice128.ex_pair
//Pair 클래스: 두 변수를 하나로 묶기
// 두개의 변수를 하나로 묶어주는 Pair 클래스
// data class Pair<out A, out B>(
//			val first: A,
//			val second:B) : Serializable
// Pair 클래스는 제네릭을 이용하여 두 가지 타입의 값을 보관한다.

// 두 수의 몫과 나머지를 반환한다.
fun divide(a: Int, b: Int): Pair<Int, Int>	// divide 함수의 반환 타입이 Pair<Int, Int>. a와 b의 몫과 나머지를 Pair 객체로 묶어서 반환
{
	return Pair(a / b, a % b)
}

fun main(args: Array<String>)
{
	val (q, r) = divide(10, 3)	// Pair 클래스는 데이터 클래스이므로 이렇게 분해가능.
	println("몫: $q")	// 출력: 몫: 3
	println("나머지: $r")	// 출력: 나머지: 1
}
