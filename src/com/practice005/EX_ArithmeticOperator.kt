package com.practice005

fun main(args: Array<String>): Unit
{
	// + 더하기, - 빼기, * 곱하기, / 나눈 값 몫, % 나눈 나머지 값
	val num: Int = 15 -4 * 3
	val num2: Int = 65 % 7
	val num3: Double = 7.5/5+22.25
	//	val num4: Double = num/num2 + 0.7
	// int 와 double은 상속 관계가 아니므로 캐스팅이 안됨. 그래서 toDouble메소드를 사용해서 변환
	val num4: Double = num.toDouble() /num2 + 0.7
	
	println(num)
	println(num2)
	println(num3)
	println(num4)
}
