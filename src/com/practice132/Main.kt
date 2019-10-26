package com.practice132.ex_closed_range_interface
// 닫힌 구간을 표현하는 ClosedRange 인터페이스
//public interface ClosedRange<T: Comparable<T>> { 
//    public val start: T 
//    public val endInclusive: T 
//    public operator fun contains(value: T): Boolean = value >= start && value <= endInclusive 
//    public fun isEmpty(): Boolean = start > endInclusive
//}
// ClosedRange는 타입 매개변수로 Comparable<T>를 구현하는 타입만 받는다. 대소 비교가 가능해야 범위를 형성할수있기 때문.
// start 프로퍼티는 구간의 최소값을, endInclusive 프로퍼티는 구간의 최대값을 나타낸다.
// contains는 in 연산자를 지원역할. value >= start && value <= endInclusive 기본구현 제공
// isEmpty 는 구간이 비어잇는지, 구간에 객체가 존재하지 않는지 여부를반환.

fun main(args: Array<String>)
{
	val intRange: IntRange = 1..10		// ClosedRange 인터페이스를 구현
	val longRange: LongRange = 1L..100L	// ClosedRange 인터페이스를 구현
	val charRange: CharRange = 'A'..'Z'	// ClosedRange 인터페이스를 구현

	println(intRange.start)		// 첫번째 값은 1이므로 출력:1
	println(longRange.endInclusive)	// longRange의 마지막은 100L이므로, 출력:100
	println('*' in charRange)	// *은 A부터 Z 구간에 없기 때문에 false 출력
	println(charRange.isEmpty())	// charRange 구간은 비어잇지 않으니까 false 출력
}
