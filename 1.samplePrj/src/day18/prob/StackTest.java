package day18.prob;

import java.util.Arrays;

public class StackTest{
	public static void main(String[] args) {
		
		MyStack stack = new MyStack(10);
		
		if(stack.isEmpty()){
			System.out.println("스택이 비어있습니다.");
		}
		
		for (int i = 1; i <= 10; i++) {
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
	
	int count;
	int[] memory;
	int[] erase = {0};
	
	public MyStack(){
		//1.MyStack클래스는 기본생성자로 생성하면 int 타입의 정수를 10개만 저장하는 Stack 클래스이다. 
		memory = new int[10];
		for(int i=0; i<memory.length; i++){
			memory[i] = 0;
		}
	}
	
	public MyStack(int i) {
		//2.객체 생성 시 생성자 매개변수로 배열의 크기를 지정할 수 있으나 
		//음수가 매개변수로 들어올 경우는 기본적으로 10개의 정수를 저장하도록 한다. 
		if(i<0){
			memory = new int[10];	
			for(int j=0; j<memory.length; j++){
				memory[j] = 0;
			}
		}else{
			memory = new int[i];
			for(int j=0; j<memory.length; j++){
				memory[j] = 0;
			}
		}
		
	}
	
	public void push(int i){
		memory[count] = i;
		count++;
	}
	
	public boolean isFull(){
		
		int counter = 0;
		for(int i=0; i<memory.length; i++){
			if(memory[i] == 0)	counter++;
		}
		if(counter == memory.length){
			return false;
		}else{
			return true;
		}
	}
	
	public boolean isEmpty(){
		
		int counter = 0;
		for(int i=0; i<memory.length; i++){
			if(memory[i] == 0)	counter++;
		}
		if(counter == memory.length){
			return true;
		}else{
			return false;
		}
	}
	
	public int top(){
		//6.top() 메서드로 Stack에서 최상위에 저장된 숫자가 뭔지 알 수 있다. 
		//top() 메서드를 호출했다고 해서 숫자가 삭제되는 것은 아니다.
		//꺼낼 숫자가 없는 경우 -1을 리턴한다.
		int counter = 0;
		for(int i=0; i<memory.length; i++){
			if(memory[i]!=0){
				counter++;
			}else if(counter == 0){
				return -1;
			}
		}
		return memory[counter-1];
	}
	
	public int pop(){
		//7.pop() 메서드로 Stack에서 최상위에 저장된 숫자를 꺼낼 수 있다. 
		//스택에서 숫자를 꺼내면 그 숫자는 Stack에서 삭제된다. 
		//꺼낼 숫자가 없는 경우 -1을 리턴한다.
		int counter = 0;
		for(int i=0; i<memory.length; i++){
			if(memory[i]!=0){
				counter++;
			}else if(counter == 0){
				return -1;
			}
		}
		int nResult = memory[counter-1];
		System.arraycopy(erase,0,memory,counter-1,1);
		return nResult;
	}
}



