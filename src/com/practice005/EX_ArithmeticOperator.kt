package com.practice005

fun main(args: Array<String>): Unit
{
	// + ���ϱ�, - ����, * ���ϱ�, / ���� �� ��, % ���� ������ ��
	val num: Int = 15 -4 * 3
	val num2: Int = 65 % 7
	val num3: Double = 7.5/5+22.25
	//	val num4: Double = num/num2 + 0.7
	// int �� double�� ��� ���谡 �ƴϹǷ� ĳ������ �ȵ�. �׷��� toDouble�޼ҵ带 ����ؼ� ��ȯ
	val num4: Double = num.toDouble() /num2 + 0.7
	
	println(num)
	println(num2)
	println(num3)
	println(num4)
}
