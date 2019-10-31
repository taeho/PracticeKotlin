package com.practice149.ex_collection_sorted
// 컬렉션 정렬하기
// sorted 계열의 확장 함수를 이용하면 컬렉션 내의 원소를 정렬 할수 있다. 
// public fun <T : Comparable<T>> Iterable<T>.sorted(): List<T> 


fun main(args: Array<String>)
{
	val list = listOf(43, 76, 28, 19, 22, 68)

	println(list.sorted())	// 출력: [19, 22, 28, 43, 68, 76], 오름차순 정렬

	println(list.sortedDescending())	// 출력: [76, 68, 43, 28, 22, 19] , 내림차순 정렬

}
