package com.practice152.ex_char_sequence_empty
// 비어 있는 char sequence 인지 검사하기 

fun main(args: Array<String>)
{
	val emptyStr = ""
	val whiteSpaces = "   "
	val nullStr: String? = null

	println(emptyStr.isEmpty())	// 출력: true	// 문자열이 비어 있는지, 즉 ""와 같은지 여부를 반환하는 확장함수
	println(whiteSpaces.isEmpty()) // 출력: false
	
	println(emptyStr.isBlank())	// 출력: true		// 문자열이 비어있거나  공백문자로 이루어져 있는지 여부를 반환 
	println(whiteSpaces.isBlank())	// 출력: true

	println(nullStr.isNullOrEmpty())	// 출력: true		// 문자열이 null 이거나 비어 있는지 여부를 반환
	println(nullStr.isNullOrBlank())	// 출력: true		// 문자열이 null 이거나 공백문자로 이루어져 있는지 반환
}
