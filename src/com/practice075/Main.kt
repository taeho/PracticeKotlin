package com.practice075.ex_null
//Nullable 타입과 null

// 업캐스팅 예제의 Person 클래스 재활용
import com.practice065.ex_upcasting.Person

fun main(args: Array<String>)
{
	var person: Person? = Person("K", 30)	// Person? 타입의 참조 변수에 Person의 인스턴스를 대입
	person = null	// 참조 변수에 null 지정. Nothing? 타입의 표현식이며, 어떤타입과도 호환, Person? 타입에 대입가능

	var num: Int? = null	// Byte, Short 등 자료형 타입 뒤에 ?를 붙이면, 그 변수는 참조 변수가 된다.
	num = 10	// num은 Nullable 타입이므로, 스택이 아니라 힙에 10이 실제 데이터가 저장된다.
}
