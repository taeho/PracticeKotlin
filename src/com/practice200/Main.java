package com.practice200;
// .ex_kotlin_to_java_companion_object
// 200 자바에서 코틀린 코드 접근하기: 동반자 객체

public class Main
{
	public static void main(String[] args)
	{
		KotlinClass.Companion.setNum(30);	// 동반자 객체가 있는 클래스는 자바에서 Companion 이라는 이름의 static 필드를 갖는다. 이 Companion 필드로 동반자 객체에 접근 가능
		System.out.println(KotlinClass.Companion.getNum());	// 출력: 30
		KotlinClass.Companion.hello();	// 출력: Hello
	}
}
