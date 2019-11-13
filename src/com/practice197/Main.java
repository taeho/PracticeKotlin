package com.practice197;
//package ex_kotlin_to_java_package_level;
// 197 자바에서 코틀린 코드 접근하기: 패키지 레벨 변수·함수

public class Main
{
	public static void main(String[] args)
	{
		// 코틀린 파일에 선언된 패키지 레벨이 변수*함수들은 파일명kt 클래스의 static 멤버로 들어간다.
		System.out.println(File1Kt.getA());	// File1.kt 에 선언된 변수와 함수는 File1Kt 클래스의 static 멤버가 된다.
		// 패키지 레벨 변수는 오로지 Getter와 Setter 를 통해서만 접근 가능하다. 변수 a에 접근하려면 getA를 호출해야 한다. 10 출력
		File1Kt.func();		// File1.kt 파일에 선언된 func 함수를 호출하고 있다. Hello 출력
		File1Kt.extension(100);	// 확장함수도 static 멤버 . File1Kt.extension(100) 은 코틀린으로 100.extension()과 같다.

		MyKotlin.func2();	// File2.kt 파일 선두에는  @file:JvmName("MyKotlin") 이 적혀있다. 
		// 즉, MyKotlin.func2는 File2.kt에 선언된 func2 를 가리킨다. From File2.kt 이 출력
	}
}
