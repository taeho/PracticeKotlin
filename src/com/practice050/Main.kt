package com.practice050.ex_garbage_collection
// 모든 참조 변수와 연결이 끊어진 객체가 어떻게 될까
// 참조되지 않는 객체는 가바지 컬렉션에 의해 힙에서 삭제

fun main(args: Array<String>)
{
	var result = ""	
	var i = 1

	while (i <= 100)
	{
		result += "$i "	// 반복문을 통해 100번 문자열 덧셈.
		i += 1			// 반복문이 마치고나면 수백개의 미아 객체 존재				
	}	//미아가된 문자열객체가 힙에 쌓이면 가비지컬렉션 수행

	println(result)

}
