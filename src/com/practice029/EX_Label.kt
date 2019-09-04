package com.practice029

fun main(args: Array<String>): Unit
{
	var x = 0
	var y = 0
	// 레이블:특정 반복문에 붙인 이름
	outer@ while (x <= 20)	// while 앞에 텍스트가 잇는데, 이게 레이블
	{
		y = 0
		while (y <= 20)
		{
			if (x + y == 15 && x - y == 5)
				break@outer		// 레이블 이름을 실행하면 해당 반복문 탈출. 여기서는 break@outer를 사용했으므로 탈출
				// 즉 연립방정식 x+y == 15 && x-y ==5 의 해가 구해지는 순간에 아래 print 문으로 탈출
			y += 1
		}
		x += 1
	}

	println("x: $x, y: $y")	// 출력: x: 10, y: 5
}
