package day18.prob2;

import java.util.Arrays;

public class StackTest{
	public static void main(String[] args) {
		
		MyStack stack = new MyStack(10);
		
		if(stack.isEmpty()){
			System.out.println("스택이 비어있습니다.");
		}
		
		for (int i = 1; i <= 15; i++) {
			stack.push(i);
		}
		
		if(stack.isFull()){
			System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if(num != -1)
				System.out.println(num);
		}
	}
}

class MyStack{
	int[] stack;
	int top=0;
	
	public MyStack() {
		stack = new int[10];
	}

	public MyStack(int size) {
		if(size < 0){
			stack = new int[10];			
		}else{
			stack = new int[size];						
		}
	}
	
	public boolean isEmpty() {
		
		return top == 0 ? true:false;
	}
	
	public boolean isFull() {
		/*if(top == stack.length){
			return true;
		}else{
			return false;
		}*/
		return top == stack.length ? true : false;
	}
	
	public int pop(){
		if(isEmpty()){
			return -1;
		}
		return stack[--top]; //top 자체의 값을 감소시킨다.
	}

	public int top(){
		if(isEmpty()){
			return -1;
		}
		return stack[top-1]; //top에서 1을 뺀다.
	}

	public void push(int data) {
		if(isFull()){
			int[] tmpmemory = new int[stack.length*2];
			System.arraycopy(stack,0, tmpmemory, 0, stack.length);
			stack = tmpmemory;
			}
		stack[top] = data;
		top++;
	}	
}



