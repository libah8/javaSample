package day15.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {

	public static void main(String[] args) {
		System.out.println("start");
		FileInputStream fis = null;
		
		try{
			fis = new FileInputStream("sample2.txt");
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		finally{
			try {
				if(fis != null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("END");
	}
}
