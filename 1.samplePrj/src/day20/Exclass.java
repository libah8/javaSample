package day20;

import java.util.Iterator;
import java.util.Vector;

import day13.Student;

public class Exclass extends Object {
	Student s1;
	Vector<Integer> nums;

	public Exclass() {
		super();
	}
	
	public Exclass(Vector<Integer> nums) {
		super();
		this.nums = nums;
	}

	public Exclass(Student s1, Vector<Integer> nums) {
		super();
		this.s1 = s1;
		this.nums = nums;
	}

	public void print(){
		if(s1!=null){
			System.out.println(s1);
		}
		if(nums!=null){
			System.out.println(nums);
		}
		return;
	}
	
	/**
	 * 
	 * @return
	 */
	public int sum(){
		int sum=0;
		
		Iterator<Integer> it = nums.iterator();
		while (it.hasNext()) {
			Integer d = (Integer) it.next();
			sum += d;
		}
		
		return sum;
	}

	@Override
	public String toString() {
		return "Exclass [s1=" + s1 + ", nums=" + nums + "]";
	}
	
}
