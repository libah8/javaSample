package day16.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		Scanner scanner = null;
		
		try{
			fis = new FileInputStream("sample3.txt");
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			System.out.println("sample2.txt 문서를 준비하세요");
		}catch(Exception e){
			
		}finally{
			System.out.println(fis);
			try {
				if(fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main End");
	}
}
