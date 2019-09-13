package com.practice052.ex_member_function
// 멤버함수 member function

fun main(args: Array<String>)
{
	val building = Building()	//인스턴스 생성
	building.name = "A 오피스텔"	// 값을 채워 넣고
	building.date = "2017-12-13"
	building.area = 120 * 8

	building.print() // building객체를 통해 print 멤버함수 호출.
	// 출력: 이름: A 오피스텔
	// 출력: 건축일자: 2017-12-13
	// 출력: 면적: 960 ㎡

}
