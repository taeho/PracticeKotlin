package com.practice120.ex_array
// 배열 Array: 타입이 같은 변수를 여러개 만들때 사용
// size, get(index:Int): T, set(index:Int, value:T):Unit, iterator():Iterator<T>

fun main(args: Array<String>)
{
	val integers: Array<Int> = arrayOf(10, 20, 30, 40)	// 배열은 arrayOf 함수를 통해 만들수잇다. arrayOf는 가변 인수를 받을수 잇도록되어잇으며
	// 제네릭이 적용되어 잇다. 여기서는 모두 인수가 Int 타입이므로 , 타입인수 생략. arrayOf 함수호출되면 힙영역에 10, 20, 30, 40 이 생성

	println(integers.size)	// 출력: 4, 원소개수
	println(integers[1])	// 출력: 20, 1번째 위치 원소

	for (i in integers)
		print("$i ")	// 출력: 10 20 30 40 // for문을 통한 순회
}
