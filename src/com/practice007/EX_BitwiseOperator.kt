package com.practice007

// 비트 연산자
fun main(args: Array<String>): Unit
{
	println(15 and 7)	// 15와 7을 비트단위로 and 연산 , 15&7, 출력 7
	println(5 or 2)		// 5와 2를 비트단위 or 연산, 5|2, 출력 7
	println(15 xor 5)	// 15와 5를 비트단위 xor 연산, 15^5 ,출력 10
	println(32767.inv())	// 32767를 비트단위로 반전, 출력 -32768
	println(1 shl 3)	// 1을 왼쪽으로 3칸 시프트, 1<<3 , 출력 8
	println(8 shr 1)	// 8을 오른쪽으로 1칸 시프트, 8>>1, 출력 1
	println(-17 ushr 2)	// 부호 유지하고, -17을 오른쪽 2칸 시프트, -17 >>>2 , 출력  1073741819
}
