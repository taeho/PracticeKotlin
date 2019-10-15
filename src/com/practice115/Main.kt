package com.practice115.ex_generic_specific_type
// 특정타입을 상속*구현하는 타입만 인수로 받기

fun <T : ValueContainer> T.printValue()	//특정 타입을 구현하는 타입만 인수로 받으려면, 상속을 할 때처럼 타입 매개변수 뒤에 :타입 이름을 적어준다. :타입1, :타입2..여러개가능.
{
	println(this.getValue())	// T타입은 ValueContainer인터페이스를 구현하므로 getValue 멤버 함수 호출할수잇다.
}

fun main(args: Array<String>)
{
	AAA().printValue()	// 출력: 1102
	BBB().printValue()	// 출력: 127
}
