package com.practice011

fun main(args: Array<String>): Unit
{
	var str: String = "Hello"
	println(str)	// ���: Hello

	str = str + "\nKotlin!"
	println(str)	// ���: Hello\nKotlin!

	println(str[8])	// ���: t

	val num = 10 * 5 + 3	// 53���� �����.
	println(str + num)	// String�� string�ƴѰ������ϸ�, String���� ���: Hello\nKotlin!53
}
