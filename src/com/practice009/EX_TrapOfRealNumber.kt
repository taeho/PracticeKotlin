package com.practice009

fun main(args: Array<String>): Unit
{
	println(0.1f + 0.1f + 0.1f)		//출력 : 0.3
	println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f)	// 출력: 1.0000001
	// 0.1 을 10번 더했다고 1이 아닌 1.0000001 이 출력된다.연산할수록 오차가 거듭되기때문에
	println(0.1f * 10)	// 출력: 1.0, 곱하기 연산은 1번이기때문에 온전하게 값이 출력
}
