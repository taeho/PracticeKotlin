package com.practice154.ex_char_sequence_split
// Char Sequence 쪼개기 
//public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = false, limit: Int = 0): List<String> {
//    if (delimiters.size == 1) {
//        val delimiter = delimiters[0]
//        if (!delimiter.isEmpty()) {
//            return split(delimiter, ignoreCase, limit)
//        }
//    }
//    return rangesDelimitedBy(delimiters, ignoreCase = ignoreCase, limit = limit).asIterable().map { substring(it) }
//}

fun main(args: Array<String>)
{
	val hello: CharSequence = "안녕하세요.\n고맙습니다.\n반갑습니다."
	val time: CharSequence = "2018-01-22"

	// lines는 개행 문자 \n 기준으로 CharSequence를 쪼개 List<String> 타입 반환 
	println(hello.lines())	// 출력: [안녕하세요., 고맙습니다., 반갑습니다.]

	for (line in hello.lineSequence())		// lineSequence는 개행 문자 \n 기준으로 CharSequence를 쪼개 Sequence<String> 타입 반환
		println(line)
		// 출력: 안녕하세요.
		// 출력: 고맙습니다.
		// 출력: 반갑습니다.
	println(time.split('-'))		// 출력: [2018, 01, 22]	//
	// delimiters 는 문자열을 쪼갤 구분자, limit는 문자열을 최대 몇조각으로 쪼갤지 지정.
	// limit을 0으로 지정하면 쪼개술 수 있을때까지 문자열을 쪼갠다.
	
}
