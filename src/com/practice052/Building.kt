package com.practice052.ex_member_function
// 멤버함수 member function 
class Building
{
	var name ="" // 건물명
	var date = "" // 건축일자
	var area = 0 // 면적 (㎡)

	fun print()		// print 함수 내장, 클래스에 내장된 함수를 멤버함수라고 부른다.
	{
		println("이름: " + this.name)		//this는 멤버함수가 호출될때, 어떤 객체로부터 호출된 것인지 나타내는 키워드.
		println("건축일자: " + this.date)	//print 함수를 호출하면 building 참조변수가 가리키는 객체로 치환.
		println("면적: ${this.area} ㎡")	// this는 생략가능.
	}
}
