package com.practice069.ex_object_extends_class
// 클래스를 상속하는 객체 ,  클래스 없이 특정 클래스를 상속하는 객체 만든다

// 클래스 없이 객체를 만들때 스는 object 표현식으로도 상속할수 잇다.
// 상속가능한 print 멤버 함수를 갖는 Person 클래스 선언
open class Person(val name: String, val age: Int)
{	
	open fun print()
	{
		println("이름: $name")
		println("나이: $age")
	}
}

fun main(args: Array<String>)
{
	// Person 클래스를 상속하는 obejct 표현식
	// 객체를 만들면서 어떤 클래스를 상속하려면 클래스간에 상속하듯이
	// ojbect 뒤에 : 슈퍼클래스 이름(생성자 인수)를 붙여주면 된다.
	// 클래스 없이 객체를 마들면서 상속햇으므로 1회용 상속
	val custom: Person = object : Person("Alan", 23)
	{
		override fun print()
		{
			println("It's a object")
		}
	}
	custom.print()	// custom 참조 변수가 실제로 가리키고 있는 객체의 print 멤버 함수 호출.
}
