package com.practice125.ex_sealed_class
// sealed 클래스: 자신의 중첩 클래스에만 상속을 허용
sealed class Outer	// sealed 클래스 선언. Outer클래스는 자신의 중첩 또는 내부 클래스에서만 상속이 가능.
{					// Outer클래스 자체로는 인스턴스를 만들 수 없다.
	class One : Outer()
	class Two : Outer()
	class Three : Outer()
}
