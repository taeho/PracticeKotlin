package com.practice125.ex_sealed_class
// sealed 클래스: 자신의 중첩 클래스에만 상속을 허용

fun main(args: Array<String>)
{
	val instance: Outer = Outer.Three()

	val text: String = when (instance)	// instance 변수의 실제 타입을 판별하여 대응되는 String 리터럴로 반환하는 when 표현식.
	{									// sealed 클래스는 서브클래스가 sealed 클래스 안에 모두 존재하므로, 모든 타입을 체크했다면
		is Outer.One -> "첫 번째"			// when의 else 블록을 생략해도 구성할수 있다.
		is Outer.Two -> "두 번째"
		is Outer.Three -> "세 번째"		// 세번째가 출력된다.
	}

	println(text)	// 출력: 세번째
}
