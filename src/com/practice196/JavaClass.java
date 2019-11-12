package com.practice196;
//package ex_java_to_kotlin_class_reference;
// 196 코틀린에서 자바 코드 접근하기: 클래스 참조

public class JavaClass
{
	public static <T> void printClassInfo(Class<T> clazz)
	{
		System.out.println(clazz.getCanonicalName());
	}
}
