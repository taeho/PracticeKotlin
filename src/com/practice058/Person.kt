package com.practice058.ex_property_getter_setter

class Person
{
	var age: Int = 0
		get()	// age 프로퍼티의 getter
		{
			return field
		}
		set(value)	// age 프로퍼티의 setter
		{
			field = if (value >= 0) value else 0
		}
}
