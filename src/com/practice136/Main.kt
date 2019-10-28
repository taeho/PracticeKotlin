package com.practice136.ex_collection_interface
// Collection 인터페이스 살펴보기 
// public interface Collection<out E> : Iterable<E>
// Iterable<E>는, fun iterator():Iterator<E> 멤버 함수를 컬렉션에 주입하기 위한 인터페이스
// Collection 인터페이스느 한개의 추상 프로퍼티와 4개의 추상 멤버 함수를 갖고 있다.
// size: 컬렉션에 포함된 원소의 개수를 갖는 프로퍼티
// isEmpty: 컬렉션이 비어있는지 여부를 반환하는 멤버함수
// contains: element 원소가 컬렉션에 포함되어 이쓴ㄴ지 여부 반환하는 멤버함수
// containsAll: elemens의 원소들이 컬렉션에 모두 포함되어 있는지 여부를 반환하는 연산자 멤버함수
// iterator: 컬렉션의 각 원소를 순회하는 Iterator<E> 타입의 객체를 반환 하는 연산자 멤버함수  컬렉션을 for문의 in 연산자를 사용하게 해준다.

fun main(args: Array<String>)
{
	val list: Collection<Int> = listOf(18, 1, 1, 4)	//list<Int> 타입의 객체를 생성

	println(list.size)	// 네개의 원소가 있으므로 출력:4
	println(list.isEmpty())	// 비어있지 않으므로 출력:false
	println(18 in list)	// 18은 list에 있으므로 출력: true

	for (i: Int in list)
		print("$i ")	// 원소를 하나씩 순회하며 출력 : 18 1 1 4 
}
