package day18.prob;

import java.util.Arrays;

public class StackTest{
	public static void main(String[] args) {
		
		MyStack stack = new MyStack(10);
		
		if(stack.isEmpty()){
			System.out.println("������ ����ֽ��ϴ�.");
		}
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		
		if(stack.isFull()){
			System.out.println("������ ���� á���ϴ�.");
		}
		
		System.out.println("�ֻ��� ���� : " + stack.top());
		System.out.println("�ֻ������� ���� ���� : " + stack.pop());
		System.out.println("�ֻ������� ���� ���� : " + stack.pop());
		System.out.println("");
		System.out.println("== ���� ����Ʈ ==");
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
		//1.MyStackŬ������ �⺻�����ڷ� �����ϸ� int Ÿ���� ������ 10���� �����ϴ� Stack Ŭ�����̴�. 
		memory = new int[10];
		for(int i=0; i<memory.length; i++){
			memory[i] = 0;
		}
	}
	
	public MyStack(int i) {
		//2.��ü ���� �� ������ �Ű������� �迭�� ũ�⸦ ������ �� ������ 
		//������ �Ű������� ���� ���� �⺻������ 10���� ������ �����ϵ��� �Ѵ�. 
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
		//6.top() �޼���� Stack���� �ֻ����� ����� ���ڰ� ���� �� �� �ִ�. 
		//top() �޼��带 ȣ���ߴٰ� �ؼ� ���ڰ� �����Ǵ� ���� �ƴϴ�.
		//���� ���ڰ� ���� ��� -1�� �����Ѵ�.
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
		//7.pop() �޼���� Stack���� �ֻ����� ����� ���ڸ� ���� �� �ִ�. 
		//���ÿ��� ���ڸ� ������ �� ���ڴ� Stack���� �����ȴ�. 
		//���� ���ڰ� ���� ��� -1�� �����Ѵ�.
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



