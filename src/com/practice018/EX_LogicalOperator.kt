package com.practice018

fun main(args: Array<String>): Unit
{
	val a = 15
	val b = 17

	var bool: Boolean = (a - b < a + b) && (a == 15)
	// (15-17 < 15+17)&&(15==15)
	// (-2<32) && true
	// true && true
	println(bool)	// 결과: true

	bool = !((a + b) > (a * 3) || (b - a) > 0)
	// !((15+17)>(15*3)||(17-15)>0)
	// !(32>45||2>0)
	// !(false||true)
	println(bool)	// 결과: false
}	
