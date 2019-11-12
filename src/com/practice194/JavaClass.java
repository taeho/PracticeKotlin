package com.practice194;
//package ex_java_to_kotlin_getter_setter;
// 194 코틀린에서 자바 코드 접근하기: Getter/Setter

public class JavaClass
{
	private int value;	

	public int getSomething()	
	{
		return value;
	}

	public void setSomething(int value)
	{
		this.value = value;
	}

	public double getDoubleValue()
	{
		return 3.14;
	}

	public boolean isGood()	//
	{
		return true;
	}
}
