package com.practice145.ex_mutable_map_interface
// MutableMap 인터페이스 살펴보기
// 수정이 가능한 Map인 MutableMap
// MutableEntry 는 키와 값 한 쌍을 표현하는 중첩 인터페이스. Map.Entry 인터페이스를 상속, 값을 변경할 수 있는 setValue멤버 함수 

fun main(args: Array<String>)
{
	val map: MutableMap<String, String> = mutableMapOf()	// 빈 map을 생성
	println(map)	// 출력: {}

	println(map.put("Hi", "こんにちは"))	// 출력: null, "Hi"를 키로 쌍을 map에 추가. 근데 기존에 없엇으므로 null 출력 
	println(map)	// 출력: {Hi=こんにちは}	, 입력된 값 출력 

	println(map.put("Hi", "你好"))	// 출력: こんにちは, 이미 값이 존재하므로 교체, 이전의 값을 출력
	println(map)	// 출력: {Hi=?好}	// 교체된 값이 출력

	map["Hi"] = "안녕"	// [] 연산자를 이용해 "Hi" 키와 연관된 값을 바꾼다.
	println(map)	// 출력: {Hi=안녕}	

	map.putAll(mapOf("How is it going?" to "잘 지내?", "Bye!" to "잘 가!"))	// 다른 Map에 존재하는 키와 값 쌍들을 map에 추가
	println(map)	// 출력: {Hi=안녕, How is it going?=잘 지내?, Bye!=잘 가!}

	println(map.remove("Hi"))	// 출력: 안녕	// "Hi"와 일치하는 키의 쌍을 삭제 
	println(map)	// 출력: {How is it going?=잘 지내?, Bye!=잘 가!}

	println(map.remove("Bye!", "잘"))	// 출력: false	// 키가 "Bye!" 값이 "잘"인 쌍을 삭제하라. 근데 없으니 false
	println(map)	// 출력: {How is it going?=잘 지내?, Bye!=잘 가!}

	println(map.remove("Bye!", "잘 가!"))	// 출력: true	// 키가 "Bye!" 값이 "잘 가!"인 쌍을 삭제하라. 있으니까 true 
	println(map)	// 출력: {How is it going?=잘 지내?}

	map.clear()	// map 있는 모든 쌍을 삭제 
	println(map)	// 출력: {}

}
