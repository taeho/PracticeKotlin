package com.practice134.ex_progression_practice
// Progression과 관련된 함수 

fun IntProgression.print()	//	IntProgression 상태를 출력하는 함수 선언
{
	print("first: ${this.first}, ")
	print("last: ${this.last}, ")
	println("step: ${this.step}")

	for (i in this)
		print("$i ")
	println('\n')
}

fun main(args: Array<String>)
{
	val prog: IntProgression = 7 downTo 3	// downTo는 역순으로 진행하는 Progression을 반환하는 infix 확장함수. 7..3 같이 큰값>작은값은 못쓴다.
	prog.print()
	// 출력:
	// first: 7, last: 3, step: -1
	// 7 6 5 4 3 

	val prog2: IntProgression = (3..7).reversed()	// reversed 확장 함수는 원래의 Progression을 뒤집는 역할. 즉 3~7로 진행되는 Progression에 reversed를 호출하면 7~3으로 진행되는 Progression을 뒤집는 역할을한다.
	println(prog == prog2)	// (3..7)표현식은 IntProgression 타입과 호환되므로 reversed 함수 호출 가능, 7 downTo 3 과 (3..7).reserved는 값은 값을 가지므로 True
	prog2.print()
	// 출력:
	//true
	//first: 7, last: 3, step: -1
	//7 6 5 4 3 
	
	val prog3: IntProgression = (1..10) step 3	// step3 은 1, 4, 7, 10으로 진행하는 IntProgression
	prog3.print()
	// 출력:
	//first: 1, last: 10, step: 3
	//1 4 7 10 

	val prog4: IntProgression = 10 downTo 2 step 3	//10에서 2로 한번에 3칸씩 진행하는 IntProgression 만든다.
	prog4.print()
	// 출력:
	// first: 10, last: 4, step: -3
	// 10 7 4 
	
	val prog5: IntProgression = 2 until 5	// until은 시작과 끝으로 지냉하는 Progression을 반환하는 확장 함수이다.
	prog5.print()
	// 출력:
	// first: 2, last: 4, step: 1
	// 2 3 4 
}
