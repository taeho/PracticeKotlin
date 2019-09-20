package com.practice070.ex_any_class

// 생성자와 프로퍼티를 한번에 쓰도록 수정
class Building(	val name: String = "",	// 건물명
				val date: String = "",	// 건축일자
				val area: Int = 0)		// 면적 (㎡)
{
	// 기존 print 멤버 함수를 toString 멤버 함수로 수정했다. override 키워드를 붙여 Any 클래스의 toString을 오버라이딩
	override fun toString() =
			"이름: ${this.name}\n" +
			"건축일자: ${this.date}\n" +
			"면적: ${this.area} ㎡"
}
