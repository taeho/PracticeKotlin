package com.practice126.ex_delegated_property
// 위임된 프로퍼티 delegated property
// 프로퍼티의 Getter/Setter 구현을 다른 객체에 맡기는 방법을 알아본다.

class Sample
{
	var number: Int by OnlyPositive()	// 프로퍼티 선언문 뒤에 b 객체를 적으면 해당 객체가 프로퍼티의 getter/setter를 대체한다.
}
