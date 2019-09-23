package com.practice077.ex_notnull_assertion_operator
// Not-null 단정 연산자Not-null Assertion Operator, Nullable 타입을 Not-null 타입으로 변환하는법
// !! 연산자는 Nullable 타입을 Not-null 타입으로 강제 캐스팅한다.

// 멤버 함수 예제의 Building 클래스 재활용
import com.practice052.ex_member_function.Building

fun main(args: Array<String>)
{
	var obj: Building? = Building()	// obj참조변수가 생성한 Building 인스턴스를 가리키게 한다.
	obj!!.name = "서울시청"	// obj는 Building? 타입, obj!!는 Building 타입이다.
	//obj가 null 이 아니기때문에, obj!!는 무사히 Building 타입으로 캐스팅된다. 
	println(obj!!.name)	// obj는 null 아니기때문에 서울시청 출력

	obj = null	// 고의로 null 지정
	obj!!.print()	// obj는 null 이기 때문에 예외 발생, kotlin.KotlinNullPointerException
}
