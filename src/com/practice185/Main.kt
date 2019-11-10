package com.practice185.ex_file_io
// 185 파일 입출력

import java.io.*	// 자바 표준 라이브러리에 선언된 클래스 import 

fun main(args: Array<String>)
{
	val file = File("./hello.txt")	// File 특정 파일을 표현하는 자바 클래스 , 생성자의 첫 번째 인수로 파일의 경로를 넘기면 해당 파일의 정보로 File 클래스 인스턴스 생성

	if (!file.exists())	// File 클래스의 Exists 멤버함수는 해당경로에 파일이 존재하는 여부 반환 
		file.createNewFile()	// 현재는 없으니 , false 반환하고 새로운 파일생성

	val outputStream: OutputStream = file.outputStream()	// OutputStream 장치로 데이터를  출력하기 위한 기본적인 멤버
	outputStream.write(35)	// 파일에 35라는 값이 바이너리 형태로 출력된다.

	val osw: OutputStreamWriter = outputStream.writer()	// 텍스트 형태로 데이터를 출력하는 멤버함수 .// charset 은 출력할 텍스트의 문자 셋. 기본 UTF_8.
	osw.write("파일 입출력")	// 파일에 파일 입출력이 텍스트 형태로 출력된다.
	osw.close()	// 출력을 마쳣으면 닫아줘야한다.

	val inputStream: InputStream = file.inputStream()	// 어떤 장치로 부터 데이터를 읽기 위 한 기본 멤버 
	println(inputStream.read())	// 읽은 걸 출력

	val isr: InputStreamReader = inputStream.reader()	// InputStreamReader 클래스는 텍스트 형태로 데이터를 출력. 
	println(isr.readText())	// 파일에 남아 있는 데이터를 모두 텍스트 형태로 읽어들인뒤 반환.
	isr.close()	// 역시 다 읽은 뒤에 파일을 닫아준다
}
