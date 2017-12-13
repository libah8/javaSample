package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

public class P551 {

	public static void main(String[] args) {
		String tableName = "CUST_INFO";
		String fileName = "data4.txt";
		String msg = "INSERT INTO "+ tableName +" VALUES({0},{1},{2},{3});";
		
		try(Scanner  s= new Scanner(new File(fileName))) {
			String pattern = "{0},{1},{2},{3}";
			MessageFormat mf = new MessageFormat(pattern);
			while(s.hasNextLine()){
				String line = s.nextLine();
				System.out.println(line);
				Object[] objs = mf.parse(line);
				System.out.println(MessageFormat.format(msg, objs));
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
