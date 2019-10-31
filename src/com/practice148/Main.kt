package com.practice148.ex_collection_filter
//컬렉션 중 원하는 원소 걸러내기
// filter 계열의 확장 함수를 이용하면 컬렌션중 원하는 원소만 걸러낼수있다.

fun main(args: Array<String>)
{
	val to50 = 1..50	// 선언과 동시에 초기화 

	println(to50.filter { it % 4 == 0 })	// 1~50 중에 4의 배수만 출력 
	// 출력: [4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48]

	println(to50.filterNot { it % 4 == 0 })	//4의 배수가 아닌것만 출력
	// 출력: [1, 2, 3, 5, 6, 7, 9, 10, 11, 13, 14, 15, 17, 18, 19, 21, 22, 23, 25, 26, 27, 29, 30, 31, 33, 34, 35, 37, 38, 39, 41, 42, 43, 45, 46, 47, 49, 50]

	println(to50.filterNotNull())	// null이 아닌 원소만 걸러내 출력
	// 출력: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]

	println(to50.filterIndexed { index, element -> element > 20 })	// predicate 함수에 index 매개변수를 추가한 버전. 1~50 중에서, 20을 넘는 수만 출력 
	// 출력: [21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]

	println(to50.filterIsInstance<Long>())	// 출력: []	// 지정된 타입만 걸러내는 함 수, 여기서 Long 타입은 없다.

}
