package com.practice192.ex_java_to_kotlin_keyword_conflict
// 192 코틀린에서 자바 코드 접근하기: 키워드 충돌
// 자바와 키워드 충돌시 처리방법

import java.util.*

fun main(args: Array<String>)
{
	val scanner: Scanner = Scanner(System.`in`)
	// 자바의 System 클래스에는 in 이라는 이름의 정적 필드가 선언이 이미 되있다.
	// 그런데 코틀린에서는 in이라는 키워드가 이미 존재하므로 system.in과 같이 쓸수없다.
	// 이럴때는 ''을 감싸주면 된다.
}
