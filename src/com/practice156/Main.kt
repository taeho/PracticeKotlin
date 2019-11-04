package com.practice156.ex_string_replace
// 문자열 찾아 바꾸기
// String 일부 문자열을 찾아 바꾸기 
// public actual fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = false): String
// public actual fun String.replaceFirst(oldChar: Char, newChar: Char, ignoreCase: Boolean = false): String
// public fun CharSequence.replaceRange(range: IntRange, replacement: CharSequence): CharSequence =
//    replaceRange(range.start, range.endInclusive + 1, replacement)

fun main(args: Array<String>)
{
	val adage = "Love begets love."

	println(adage.replace("love", "hate", ignoreCase = true))	// 출력: hate begets hate.
	// love에 일치하는 문자열을 hate로 교체. 대소문자 무시 옵션 true
	println(adage.replaceFirst("love", "compliment", ignoreCase = true))	// 출력: compliment begets love.
	// love에 일치하는 '첫번째' 문자열을 compliment 로 교체 
	println(adage.replaceRange(5..10, "hello"))	// 출력: Love hello love.
	// 지정한 범위의 문자열을 replaceRange로 교체 

}
