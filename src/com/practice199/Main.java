package com.practice199;
//package ex_kotlin_to_java_object;
// 199 자바에서 코틀린 코드 접근하기: 선언된 객체

public class Main
{
	public static void main(String[] args)
	{
		// Object 키워드로 선언된 객체는 자바에서 일반적인 클래스로 인식
		System.out.println(KotlinObject.INSTANCE.getNum());	// INSTANCE라는 이름의 static 필드를 자동으로 갖는다. INSTANCE는 KotlinObject 타입의 필드이다.
		// 이 INSTANCE 를 통해 객체의 프로퍼티와 멤버 함수에 접근할수있다.
		// 출력 : 52
		KotlinObject.INSTANCE.setNum(0);
		KotlinObject.INSTANCE.hello();	// 출력: Hello
	}
}
