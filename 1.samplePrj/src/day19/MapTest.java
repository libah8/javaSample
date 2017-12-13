package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		//Map<String, String> map = new HashMap<>();
		Map<String, String> map = new TreeMap<>();
		map.put("java01", "1234");
		map.put("java02", "45521");
		map.put("java03", "459921");
		map.put("java06", "453321");
		map.put("java07", "452641");
		map.put("java04", "452771");
		map.put("java09", "452441");
		map.put("java05", "451521");
		map.put("java08", "452861");
		
		while(true){
			System.out.println("로그인 처리");
			Scanner scanner = new Scanner(System.in);
			System.out.println("ID :_");
			String id = scanner.nextLine();
			System.out.println("\nPW :_");
			String pw = scanner.nextLine();
				
			if(map.containsKey(id)){
				if(map.get(id).equals(pw)){
					System.out.println("로그인에 성공했습니다.");
					break;
				}else{
					System.out.println("비밀 번호를 다시 확인해주세요...");
				}
			}else{
				System.out.println("id가 존재하지 않습니다.");
			}
		}
		System.out.println("------------------서비스 목록----------------");
		
				/*
		System.out.println(map);
		System.out.println(map.get("java01"));
		
		System.out.println(map.keySet());
		*/
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String keyName = (String) it.next();
			map.get(keyName);
			System.out.println("ID : "+keyName+", PW : "+map.get(keyName));
			
		}
		
	}

}
