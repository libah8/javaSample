package day19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>(); //������¡����. �ٸ� Ÿ�Ե鵵 �ڵ鸵 ����.
		for(int i=1; i<=100; i++){
			stack.push(""+i);	//�ڵ����� �⺻���� ��üȭ��Ų��. 
								//���� int�� �ڷḦ �ڵ鸵 �Ѵٰ� ������ ��Integer.parseInt(i)����� ���ش�.
		}
		
		System.out.println(stack.pop());	//�������� �� ���� ������.
		
		Queue<Integer> queue = new LinkedList<Integer>();//Queue�� �������̽��̴�.
		for(int i=1; i<=100; i++){
			queue.offer(i);
		}
		System.out.println(queue.poll()); //ó���� �� ���� ������.
	}

}
