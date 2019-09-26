package com.practice082.ex_access_modifier
// 접근 지정자 Access Modifier
// 코틀린에서 선언 가능한 요소 (함수, 전역변수, 클래스, 프로퍼티, 멤버 함수 등) 중, 일부 요소에는 접근 권한이라는것 지정.
// 접근지정자(Access Modifier)또는 가시성 지정자(Visibility Modifier)
// public: 모든 곳에서 접근 가능, 생략하면 기본적으로 public
// internal: 같은 모듈안에서 접근 가능.
// protected: 클래스 내부와, 서브클래스 안에서만 접근 가능
// private: 프로퍼티와 멤버 함수일 경우, 해당 클래스 안에서만 접근 가능, 그 외의 경우 같은 파일내에서만 접근가능

class Rectangle(private val width: Int,
				private val height: Int)	// 프로퍼티 width, height를 priavte 선언, 클래스 내부만 사용가능
{
	val area: Int
		get() = width * height
}

fun main(args: Array<String>)
{
	val rect = Rectangle(5, 7)
//	println(rect.width) // 에러
	println(rect.area)	// 출력: 35
}
