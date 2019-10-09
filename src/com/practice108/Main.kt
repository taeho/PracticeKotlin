package com.practice108.ex_closure
// 클로저 Closure
//지역변수는 소속된 블록이 끝나면 종료, 클로저는 지역변수가 소멸하지 않보이게 한다.

fun returnFunc(num: Int): () -> Unit	// () -> Unit 타입의 함수를 반환하는 returnFunc 함수 선언
{
	return {
		println(num)
	}
}

fun main(args: Array<String>)
{
	val f: () -> Unit = returnFunc(30)	// returnFunc 함수가 반환한 함수를 f 참조 변수에 저장
	f()	// f 가 가리키는 함수 호출 30이 출력
	// 근데, f가 호출되는 시점에 returnFunc의 시점과 맞지 않아 num은 소멸된다.
	// 함수리터럴은 자신이 만들어질때 상황을 기억. val f 부터 함수가 만들어질때 num매개변수의 값을 복사해 갖고 잇는다.
}
