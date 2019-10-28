package com.practice138.ex_list_iterator_interface
// ListIterator 인터페이스 살펴보기
// public fun hasPrevious(): Boolean	// 이전 원소가 존재하는지 여부 반환
// public fun previous(): T				// 이전원소를 반환하고 , 커서를 뒤로 한칸 이동
// public fun nextIndex(): Int			// 다음 원소의 인덱스를 반환, 커서를 옮기지 않는다.
// public fun previousIndex(): Int		// 이전 원소의 인덱스를 반환, 커서를 옮기지 않는다. 

private fun moveToNext(iter: ListIterator<Int>)
{
	print("${iter.hasPrevious()}, ")
	print("${iter.hasNext()}, ")
	print("${iter.previousIndex()}, ")
	print("${iter.nextIndex()}, ")
	println("${iter.next()}")
}

fun main(args: Array<String>)
{
	val iter: ListIterator<Int> = listOf(10, 20, 30).listIterator()

	moveToNext(iter)	// 출력: false, true, -1, 0, 10
	moveToNext(iter)	// 출력: true, true, 0, 1, 20
	moveToNext(iter)	// 출력: true, true, 1, 2, 30
}
