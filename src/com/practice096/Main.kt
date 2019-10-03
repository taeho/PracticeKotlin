package com.practice096.ex_abstract_class

// 단순히 학생, 교수, 직원 클래스를 하나의 타입으로 묶어주는 클래스
abstract class Person	// 클래스를 추상 클래스로 만드려면, 클래스 선언 맨 앞에 abstract 키워드를 붙인다
{	//추상 클래스는 일부 멤버의 내용이 비어있는 불완전한 클래스이기 때문에 객체를 생성할수없다. abstract 키워드는 그 자체로 open을 포함하고 있기때문에 open 키워드 불필요
	abstract fun getSalary(): Int	// 추상클래스는 추상 멤버 함수를 가질수없다. 추상 멤버함수란, 내용이 없는 멤버 함수를 뜻한다.
	//Person클래스의 getSalary 멤버 함수는 그저 서브클래스로 전파시키기 위해선언, 함수 내용 불필요. 그래서 추상 멤버함수로 생성
}

// 학생 클래스. tuition는 한 학기 등록금
class Student(private val tuition: Int) : Person()
{
	// 학생은 등록금을 납부하므로 salary를 음수 처리
	override fun getSalary() = -tuition	// 추상 클래스를 상송하는 일반클래스는 반드시 모든 추상 멤버함수를 오버라이딩
}

// 교수 클래스. classCount는 진행하는 수업의 수
class Professor(private val classCount: Int) : Person()
{
	override fun getSalary() = classCount * 200	// 추상 클래스를 상송하는 일반클래스는 반드시 모든 추상 멤버함수를 오버라이딩ㄴ
}

// 학교 직원 클래스. initial은 초봉(반기), years는 경력(년)
class Employee(private val initial: Int, private val years: Int) : Person()
{
	override fun getSalary() = initial * (1.0 + years / 10.0).toInt()	// 추상 클래스를 상송하는 일반클래스는 반드시 모든 추상 멤버함수를 오버라이딩
}

// 구성원으로부터 학교의 재정을 구한다.
fun getFinance(vararg persons: Person): Int
{
	var i = 0
	var finance = 0
	while (i < persons.size)
	{
		finance -= persons[i].getSalary()
		i += 1
	}
	return finance
}

fun main(args: Array<String>)
{
	val finance = getFinance(Student(330), Student(330), Professor(1), Professor(2), Employee(1300, 2))
	// Student, Professor, Employee 타입의 객체를 getFinance 함수로 넘겨 값 계산
	// getFinance 함수의 persons 매개변수 타입이 Person 이기는 하지만 실제 가리키고 있는 객체의 멤버함수 호출되므로 각 객체의 getSalary 멤버함수 정상호출
	println("학교 재정: $finance 만원")	// 출력: 학교 재정: -1240 만원
}
