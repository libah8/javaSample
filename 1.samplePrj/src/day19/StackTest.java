package day19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>(); //리사이징가능. 다른 타입들도 핸들링 가능.
		for(int i=1; i<=100; i++){
			stack.push(""+i);	//자동으로 기본형을 객체화시킨다. 
								//만약 int형 자료를 핸들링 한다고 가정할 때Integer.parseInt(i)기능을 해준다.
		}
		
		System.out.println(stack.pop());	//마지막에 들어간 값을 꺼낸다.
		
		Queue<Integer> queue = new LinkedList<Integer>();//Queue는 인터페이스이다.
		for(int i=1; i<=100; i++){
			queue.offer(i);
		}
		System.out.println(queue.poll()); //처음에 들어간 값을 꺼낸다.
	}

}
