package com.practice076.ex_safe_call_operator
// 안전한 호출 연산자 safe call operator ?.
// Nullable한 참조 변수의 프로퍼티나 멤버 함수에 접근하는 방법
// . 점 대신 ?. 연산자를 반드시 사용해야 한다. ?. null 값에 안전한 연산자

// 멤버 함수 예제의 Building 클래스 재활용
import com.practice052.ex_member_function.Building

fun main(args: Array<String>)
{
	var obj: Building? = null	// Building? 타입의 참조 변수에 null 을 지정하고 있다.
	obj?.print()		// obj에는 null 이 지정되어 있으므로, print()호출은 무시되며, obj?.print() 표현식의 값은 null, 타입은 Unit?이 된다.
	obj?.name = "건물"	// obj에는 null 이 지정되어 있으므로, 프로퍼티에 값을 집어 넣는것도 무시된다.

	obj = Building()	// obj가 갓 생성된 Building의 인스턴스를 가리키게 하고잇다.
	obj?.name = "서울월드컵경기장"	//이제 obj에는 더이상 null이 지정되어 있지 않으므로, 프로퍼티 정상 저장된다.
	obj?.date = "2001년 11월 10일"
	obj?.area = 21_6712
	obj?.print()
}
