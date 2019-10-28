package com.practice139.ex_map_interface
// Map 인터페이스 살펴보기
// public interface Map<K, out V>
// public interface Entry<out K, out V> 	// 키와 값 한 쌍을 표현하는 중첩 인터페이스
// public val size: Int	// Map에 들어있는 키와 값 쌍의 개수를 갖는  프로퍼티
// public val keys: Set<K>		// keys 는 Map의 키들만 갖는 프로퍼티. Map의 키는 중복되지 않기때문에 Set 타입
// public val values: Collection<V>	// Map의 값들만 갖는 프로퍼티 . 중복될수 있기때문에 Collection 타입
// public val entries: Set<Map.Entry<K, V>>	// Map 들어 있는 모든 키와 값 쌍들을 갖는 프로퍼티
// public fun isEmpty(): Boolean	// Map 비어있는 지 여부를 반환하다.
// public fun containsKey(key: K): Boolean	// Map에 key에 해당하는 키가 들어 있는지 여부를 반환
// public fun containsValue(value: @UnsafeVariance V): Boolean	// Map에 해당하는 값이 들어있는지 여부를 반환.
// public operator fun get(key: K): V?	// key에 해당하는 값을 반환하는 연산자 멤버 함수. key에 해당하는 값이 없으면 null이 반환. 그래서 반환타입이 V?

fun main(args: Array<String>)
{
	val map: Map<String, String> = mapOf("Apple" to "사과", "Banana" to "바나나")

	println(map.size)	// 출력: 2
	println(map.keys)	// 출력: [Apple, Banana]
	println(map.values)	// 출력: [사과, 바나나]
	println(map.entries)	// 출력: [Apple=사과, Banana=바나나]
	println(map.isEmpty())	// 출력: false
	println(map.containsKey("Cocoa"))	// 출력: false
	println(map.containsValue("바나나"))	// 출력: true
	println(map["Apple"])	// 출력: 사과
	println(map.getOrDefault("Cocoa", "코코아"))	// 출력: 코코아
}
