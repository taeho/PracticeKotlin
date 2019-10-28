package com.practice141.ex_mutable_iterator_interface
// MutableIterator: 커서가 가리키고 있는 원소를 삭제할 수 있다 
// public interface MutableIterator<out T> : Iterator<T> {
// public fun remove(): Unit	// 커서가 가리키고 있는 원소를 삭제할수 있는 멤버 함수 

fun main(args: Array<String>)
{
	val list = mutableListOf(1, 2, 3)
	val iter: MutableIterator<Int> = list.iterator()	// MutableList<Int> 타입의 list 변수로부터 MutableIterator<Int> 가져간다

	println(list)	// 출력: [1, 2, 3]

	iter.next(); iter.remove()	//반복자의 커서를 첫번째 원소로 옮기기 위해 next를 호출한뒤, remove를 호출하여 첫 원소삭제 
	println(list)	// 출력: [2, 3]

	iter.next(); iter.remove()	// 반복자의 커서를 다음 원소로 옮기고, remove를 호출하여 삭제 
	println(list)	// 출력: [3]
}	
