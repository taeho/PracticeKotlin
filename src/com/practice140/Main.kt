package com.practice140.ex_mutable_collection_interface
//변경할 수 있는Mutable 컬렉션
// 자바와 다르게 코틀린의 컬렉션은 기본적으로 수정이 불가능, Thread-Safe 한 코드를 만든다.
// public interface MutableCollection<E> : Collection<E>, MutableIterable<E>
//     override fun iterator(): MutableIterator<E>
// public fun add(element: E): Boolean	// 컬렉션에 element 원소를 추가
// public fun addAll(elements: Collection<E>): Boolean	// elements 컬렉션의 모든 원소를 컬렉션에 추가
// public fun remove(element: E): Boolean	// 컬렉션에서 element와 일치하는 원소 하나 제거, 성공하면 true, 아니며 false
// public fun removeAll(elements: Collection<E>): Boolean	// elements 컬렉션의 원소들과 일치하는 모든 원소를 제거한다.
// public fun retainAll(elements: Collection<E>): Boolean	// elements 컬렉션의 원소와 일치하는 원소만 남기고 컬렉션에서 모두 제거 제거되면 true, 아니면 false
// public fun clear(): Unit	// 컬렉션의 모든 원소를 삭제하는 멤버 함수 

fun main(args: Array<String>)
{
	val mutableList: MutableCollection<Int> = mutableListOf(1, 2, 4, 2, 3, 2, 5)
	println(mutableList)	// 출력: [1, 2, 4, 2, 3, 2, 5]

	mutableList.add(1)
	println(mutableList)	// 출력: [1, 2, 4, 2, 3, 2, 5, 1]

	mutableList.addAll(listOf(3, 2, 4))
	println(mutableList)	// 출력:	[1, 2, 4, 2, 3, 2, 5, 1, 3, 2, 4]

	mutableList.remove(1)
	println(mutableList)	// 출력: [2, 4, 2, 3, 2, 5, 1, 3, 2, 4]

	mutableList.removeAll(listOf(1, 2))
	println(mutableList)	// 출력: [4, 3, 5, 3, 4]

	mutableList.retainAll(listOf(3, 5))
	println(mutableList)	// 출력: [3, 5, 3]

	mutableList.clear()
	println(mutableList)	// 출력: []
}
