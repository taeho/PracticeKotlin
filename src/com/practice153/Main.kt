package com.practice153.ex_trim_char_sequence
// char sequence 가공하기 

fun main(args: Array<String>)
{
	val str = "   hello   "

	println(str.removeRange(0..5))	// 출력: lo   //지정한 범위의 문자들을 제거한 문자열을 반환 

	println(str.padStart(20, '*'))	// 출력: *********   hello   	//문자열의 길이를 length 만큼 늘인뒤,  앞부분의 빈공간을 padChar로 채운 문자열을 반환 
	println(str.padEnd(17, '*'))	// 출력:    hello   ******	//문자열의 길이를 length 만큼 늘인뒤, 뒷부분의 빈공간을 padChar로 채운 문자열을 반환

	println(str.trimStart())	// 출력: hello	//문자열 앞 부분의 공백문자를 없앤 문자열을 반환
	println(str.trimEnd())		// 출력:    hello	//문자열 뒷부분의 공백문자를 없앤 문자열을 반환
	println(str.trim())			// 출력: hello	// 문자열 앞뒤의 공백문자를 없앤 문자열 반환 

	println(str.slice(4..6))		// 출력: ell	// 지정한 범위의 문자열을 잘라낸뒤 반환 
	println(str.subSequence(4..6))	// 출력: ell	// 지정한 범위의 문자열을 잘라낸뒤 반환 
	println(str.substring(4..6))	// 출력: ell	// 지정한 범위의 문자열을 잘라낸뒤 반환 

	println(str.reversed())	// 출력:    olleh   	// 문자열을 거꾸로 뒤집은 문자열을 반환 
}
