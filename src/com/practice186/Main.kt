package com.practice186.ex_file_tree_walk_class
// 186 FileTreeWalk 클래스: 디렉토리 순회하기
// 쉽게 특정 디렉토리의 하위 파일 및 하위 디렉토리들을 순회 할수잇다.
// public fun File.walk(direction: FileWalkDirection = FileWalkDirection.TOP_DOWN): FileTreeWalk = FileTreeWalk(this, direction)
// FileWalkDirection 는 파일 순회 방향을 나타내는 열거 클래스이며, FileWalkDirection.TOP_DOWN은 최상위 디렉토리에서 최하위 디렉토리로
// FileWalkDirection.BOTTOM_UP 은 최하위 디렉토리에서 최상위 디렉토리로 순회. direction의 기본값은 TOP_DOWN.
//
//public fun onEnter(function: (File) -> Boolean): FileTreeWalk {
//        return FileTreeWalk(start, direction, onEnter = function, onLeave = onLeave, onFail = onFail, maxDepth = maxDepth)
//    }
import java.io.File

fun main(args: Array<String>)
{
	val fileTree: FileTreeWalk = File("./").walk()	// 현재 디렉토리의 파일 인스턴스를 생성 
			.maxDepth(3)	// maxDepth은 탐색할 하위 디렉토리의 최대 깊이를 지정
			.onEnter { file ->	// onEnter는 새로운 디렉토리로 들어왔을 때 호출될 함수를 지정하는 멤버함수 
				println("새 디렉토리 방문: ${file.name}")
				true
			}

	for (file in fileTree)
		println(file.name)	// for문을 이용하여 fileTree를 순회하며 디렉토리내 모든파일 이름출력
}
