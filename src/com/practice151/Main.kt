package com.practice151.ex_prefix_suffix
// 접두사 접미사 관련 CharSequence 확장 함수 

fun main(args: Array<String>)
{
	val str: CharSequence = "https://www.naver.com"

	println(str.startsWith("https://"))	// 출력: true		// 문자열이 지정한 prefix로 시작하면 true, 아니면 false
	println(str.endsWith(".com"))	// 출력: true			// 문자열이 지정한 suffix로 시작하면 true, 아니면 false

	println(str.removePrefix("https://"))	// 출력: www.naver.com	// 문자열이 지정한 prefix로 시작하면, 그부분을 잘라낸 문자열 반환 

	println(str.removeSuffix(".com"))	// 출력: https://www.naver	// 문자열이 지정한 suffix로 끝나면, 그부분 잘라낸 문자열 반환

	println(str.removeSurrounding("https://", ".com"))	// 출력: www.naver	// 지정한, prefix, suffix로 시작 마무리 하면 잘라낸 문자열 반환 

}
