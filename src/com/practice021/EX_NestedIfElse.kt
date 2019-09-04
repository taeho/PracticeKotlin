package com.practice021

fun main(args: Array<String>): Unit
{
	val score = 88

	if (score >= 90)
	{
		println('A')
	}
	else
	{
		if (score >= 80)
		{
			println('B')	// 출력: B
		}
		else
		{
			if (score >= 70)
			{
				println('C')
			}
			else
			{
				println('F')
			}
		}
	}
}
