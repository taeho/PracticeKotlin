package com.practice033

fun main(args: Array<String>)
{
	println(getAverage(89, 96))	// getAverage함수를 호출하면서 마지막 인수생략. 매개변수 print에는 default 값 false가 들어간다.
	getAverage(100, 50, true)	// 모든 인수를 지정하고 함수 호출. 이때는 default 값이 모두 무시된다.
	println(getAverage(90))		// 첫번째 인수만 지정, 나머지 매개변수 b는 0, print는 false가 전달된다.
	getAverage(66, print = true)	// 인수는 생략이 오른쪽에서 부터 하나씩. 매개변수 a에는 66을  이름을 직접지정한 print는 true가 전달.
	getAverage(print = true)	// 매개변수 print만 인수전달. 나머지는 default인 0이 들어간다.
	getAverage(print = true, a = 10, b = 30)	// 순서는 다르지만. 매개변수이름을 직접 지정한 경우 사용가능. 정상
}

//매개변수를 선언과 동시에 디폴트 값으로 초기화하고 있음. 이런경우 함수 호출시 해당 매개변수의 인수지정않해도됨.
// 인수 지정하지 않은 매개변수는 디폴트값으로 초기화 
fun getAverage(a: Int = 0, b: Int = 0, print: Boolean = false): Double
{
	val result = (a + b) / 2.0
	if (print)	// 조건이 참이면 출력
		println(result)
	return result
}
