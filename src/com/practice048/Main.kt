package com.practice048.ex_role_of_heap
// 힙 영역의 존재이유는?

fun main(args: Array<String>)
{
	val product: Product; product = createProduct()	// Product 타입의 값을 반환하는 함수 호출, product 참조변수에 저장.
	// 다음 라인에 apple 참조변수는 createProduct 함수가 끝나면서 종료.하지만. apple 참조변수가 가리키던 객체는 힙에 아직 있음.
	printProductInfo(product)	// printProductInfo 함수로 product 의 참조값을 전달.
	processProduct(product)
	printProductInfo(product)
}

fun createProduct(): Product
{
	val apple = Product()	// apple 참조변수가 가리키는 객체의 프로퍼티에 값을 채운다.
	apple.name = "Apple"
	apple.price = 1000

	return apple
}

fun processProduct(product: Product)
{
	product.price += 500
}

fun printProductInfo(product: Product)
{
	println("이름: ${product.name}")
	println("가격: ${product.price}")
}
