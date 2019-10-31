package com.practice147.ex_collection_map
// 컬렉션 원소 타입 변환하기
// map 계열의 확장 함수를 이용하면 Collection<T> 타입을 Collection<R> 타입으로 변환할 수 있다.

fun main(args: Array<String>)
{
	val origin = listOf(65, 66, 67, 68, 69)

	println(origin.map { it.toChar() })

	println(origin.mapIndexed { index, element ->	// mapIndexed 는 변환 함수에 index 매개변수를 추가한 버전
		println("[$index]: $element")
		element.toChar()
	})
	// 출력: [A, B, C, D, E]
	// 출력: [0]: 65
	// 출력: [1]: 66
	// 출력: [2]: 67
	// 출력: [3]: 68
	// 출력: [4]: 69
	// 출력: [A, B, C, D, E]
	val to100 = 1..100
	println(to100.mapNotNull {	// mapNotNull 은 변환 함수가 null 을 반환하면 결과에서 제외한다.
		if (it % 3 == 0) it		// 원소가 3의 배수이면 그대로 반환하고,
		else null				// 아니면 null을 반환하여 결과에 3의 배수만 남도록 했다. 1~100 중 3의 배수가 출력된다.
	})
	// 출력: [3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
}
