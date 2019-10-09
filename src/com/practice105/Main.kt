package com.practice105.ex_it_identifier
// it 식별자 , 람다식의 매개변수가 하나일 때는 매개변수 선언을 생략할수있다.

fun main(args: Array<String>)
{
	val instantFunc: (Int) -> Unit = {	//  (Int) -> Unit 타입에 맞는 함수 리터럴을 작성하려면 Int 타입의 매개변수를 적어줘야하지만 생략
		println("Hello $it")	// 매개변수를 생략하면 it 이라는 특별한 식별자가 만들어진다. 여기서 it이 우리가 생략한 Int 타입의 매개변수를 대체 
	}

	instantFunc(33)	// 출력: Hello 33
}
