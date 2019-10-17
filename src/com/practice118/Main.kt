package com.practice118.ex_iterator
// 반복자Iterator: 특정 구간 속에 있는 원소를 하나씩 반복적으로 꺼내기 위한 인터페이스
// 코틀린은 Iterator라는 인터페이스가 기본적으로 선언되어 있다.

fun main(args: Array<String>)
{
	val range: IntRange = 1..3	// IntRange 클래스에는 operator fun iterator():IntIterator 연산자 멤버함수 선언.
	// IntIterator는 Iterator<Int>를 구현하는 클래스이기 때문에 Iterator<Int> 타입으로 받을수있다. 
	val iter: Iterator<Int> = range.iterator() 
	
	println(iter.hasNext())	// iter는 1..3 구간중 첫 원소인 1의 바로 이전을 가리키고있다.
	// 여기서, 특정 원소를 가리키는 iterator 내부의 변수를 커서(Cursor)라고 부른다. iter.hasNext()는 다음 원소가 있으면 true, 없으면 false를 반환
	println(iter.next())	// iter.next()는 커서를 다음 원소 1로 이동하고, 1을 반환한다. 1이 출력

	println(iter.hasNext())	// 출력: true
	println(iter.next())	// 출력: 2

	println(iter.hasNext())	// 출력: true
	println(iter.next())	// 출력: 3

	println(iter.hasNext())	// 출력: false 더이상 다른 원소가 없으므로 false가 출력
}
