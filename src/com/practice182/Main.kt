package com.practice182.ex_kotlin_version
// 182 KotlinVersion 클래스: 사용 중인 코틀린 버전 알아내기
// Comparable 인터페이스를 구현하기때문에 <, > 연산자로 비교도 가능
// @kotlin.jvm.JvmField
// public val CURRENT: KotlinVersion = KotlinVersion(1, 3, 50) // value is written here automatically during build

fun main(args: Array<String>)
{
	val kotlinVersion: KotlinVersion = KotlinVersion.CURRENT
	println("${kotlinVersion.major}.${kotlinVersion.minor}.${kotlinVersion.patch}")	// 출력: 1.3.50	// 코틀린의 메이저, 마이너, 패치버전 출력
	println(kotlinVersion.isAtLeast(1, 1, 0))	// 출력: true	// 특정버전 이상인지 체크한다.
}
