package com.practice133.ex_iterable_interface
// Iterable 인터페이스: 클래스가 반복자를 지원하도록 하기 
// Iterable 인터페이스는 클래스에 operator fun iterator():Iterator<T> 연산자 멤버 함수를 주입하기위한 인터페이스
// IntRange는 IntProgression과 ClosedRange 인터페이스를 Long은..Long...Char는 Char인터페이스를  구현

// Progression에는 val first, last, step 프로퍼티가 있음.
// ClosedRange는 1~10 처럼 작은 수~큰 수 형태로 밖에 표현이 안됨.
// Porgression은 10~1 처럼 큰수에서 작은 수로의 이동 표현가능
// step은 반복자의 next를 호출 할때 몇칸씩  건너 뛸지 정하는 프로퍼티. 기본값은 1.

fun main(args: Array<String>)
{
	val prog: IntProgression = 3..7		// IntRange 타입의 표현식을 IntProgression 타입의 변수로 받고있다.
	println(prog.first)	// 출력: 3
	println(prog.last)	// 출력: 7
	println(prog.step)	// 출력: 1

	for (i in prog)		// IntProgression을 for 문의 in 연산자에 적용. 
		print("$i ")	// 출력: 3 4 5 6 7 
}
