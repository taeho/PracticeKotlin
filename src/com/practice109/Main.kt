package com.practice109.ex_function_literal_with_receiver
// 리시버가 붙은 함수 리터럴
// 함수 리터럴에 리시버를 적용하여 확장 함수처럼 만들 수 있다.
 
fun main(args: Array<String>)
{
	// Int 리시버를 [left, right] 범위 이내로 가공하여 반환하는 확장 함수
	val makeSure: Int.(left: Int, right: Int) -> Int	// Int.(left: Int, right: Int) 은 리시버타입이 Int 고, 매개변수 타입이 (Int, Int)이며, 반환타입이 Int인 함수타입

	// 리시버가 적용된 함수 리터럴을 만들고 있다. 람다식으로 함수 리터럴을 작성항 때는 기존과 동일하게 적으면 된다.
	// 익명함수 형태로 함수리터럴을 작성하고 싶으면 fun Int.(left:Int, right:Int):Int{..} 로 작성.리시버가 붙은 함수리터럴은 this 키워드 사용가능.
	makeSure = { left: Int, right: Int ->
		if (this < left) left
		else if (this > right) right
		else this
	}

	// 리시버가 적용된 함수 타입의 변수는 "리시버.변수(인수)" 형태로 호출가능
	println(15.makeSure(20, 40))	// 출력: 20
	println(18.makeSure(0, 50))		// 출력: 18
	println(25.makeSure(0, 19))		// 출력: 19

	val makeSure2: (Int, Int, Int) -> Int = makeSure
	makeSure2(15, 20, 40) == 15.makeSure(20, 40)
}
