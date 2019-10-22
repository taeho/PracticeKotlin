package com.practice127.ex_class_delegation
// 클래스의 위임 class delegation
// 코틀린에서는 인터페이스의 구현을 다른 클래스에 맡길수 있는 문법 설명

class Sample : Plusable by ClassDelegator()	// 인터페이스를 구현하면서 뒤에 by 객체를 지정하면 인터페이스의 구현을 해당 객체로 위임.
// 이 객체는 대리할 인터페이스를 구현하고 있어야한다.
// 앞으로 Sample의 plus 연산자 멤버 함수를 호출하면 ClassDelegatordml plus가 호출된다.
