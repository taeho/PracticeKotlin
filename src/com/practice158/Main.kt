package com.practice158.ex_regex_class
// Regex 클래스 : 정규식 다루기

// 정규식 패턴이 담긴 문자열 받는 생성자: public actual constructor(pattern: String) : this(Pattern.compile(pattern))
// input이 정규식에 매칭되는지 여부 반환: public actual infix fun matches(input: CharSequence): Boolean = nativePattern.matcher(input).matches()
// input 중 정규식에 매칭되는 부분 치환:  public actual fun replace(input: CharSequence, replacement: String): String = nativePattern.matcher(input).replaceAll(replacement)

fun main(args: Array<String>)
{
	val regex = Regex("[0-9]+")	// 숫자로 이루어 진건지 검사하는 정규식 생성 
	val str = "4324235"
	val str2 = "324 6546 5432"

	println(regex matches str)	// 출력: true
	println(regex matches str2)	// 출력: false
	println(regex.replace(str2, "숫자"))	// 출력: 숫자 숫자 숫자	// 숫자부분이 숫자로 치환되어 출력 

}
