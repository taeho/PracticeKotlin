package com.practice003

fun main(args: Array<String>): Unit
{
	// var: ���� Ű����, total: �����̸�(�ĺ���), Int: ������ Ÿ��
	// var total: Int =0 //ó�� ���ٷ� �����ϰ� �ʱ�ȭ�� �����ϴ�.
	// �Ʒ� ������ var Ű����� total�̶�� �ĺ��ڰ� ������ ���ϰ�,�� Ÿ���� Int��� �����Ϸ����� �˸�	
	var total: Int
	total = 0
	
	// var �� �Ϲ� ���� �̰�, val�� final ������ �����ϸ� �ȴ�.	
	val a: Int = 10 + 53 - 7
	println(a)
	
	val b: Int = 43 + 75 + a
	println(b)
	
	total = a+b
	println(total)
}