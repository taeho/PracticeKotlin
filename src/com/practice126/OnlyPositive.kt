package com.practice126.ex_delegated_property
// 위임된 프로퍼티 delegated property
// 프로퍼티의 Getter/Setter 구현을 다른 객체에 맡기는 방법을 알아본다.

import kotlin.reflect.KProperty

class OnlyPositive
{
	private var realValue: Int = 0
	
	// 프로퍼티를 대리하는 객체는 operator fun getValue(thisRef: Any?, property: KProperty<*>): T,
	// operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) 멤버함수를 갖고 있어야한다.
	// 여기서 T는 대리할 프로퍼티의 타입.
	operator fun getValue(thisRef: Any?, property: KProperty<*>): Int
	{
		return realValue
	}

	operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int)
	{
		realValue = if (value > 0) value else 0
	}
	// sample 클래스의 number 프로퍼티의 Getter는 OnlyPositive 의 getValue로 대체되고,
	// Setter 는 OnlyPositive의 setValue로 대체된다.
}
