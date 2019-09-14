package com.practice053.ex_this_duplication
// 프로퍼티와 멤버 함수의 매개변수의 이름이 같을때 구분은.

class AAA
{
	var num = 15	// num 프로퍼티 

	fun memberFunc(num: Int)	// 함수의 매개변수도 num 
	{
		println(num)	// 이건 매개변수 num을 인식, 출력: 53
		println(this.num)	// this를 붙이면 프로퍼티로 인식, 구분하기위 필수. 출력: 15
	}
}

fun main(args: Array<String>)
{
	val a = AAA()	// AAA 인스턴스를 생성한뒤, a에 대입
	a.memberFunc(53)	// a객체의 멤버 함수 memberFunc 호출
}
