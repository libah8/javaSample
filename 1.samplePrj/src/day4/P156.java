package day4;

import java.util.Scanner;

public class P156 {

	public static void main(String[] args) {
		String command;
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			
			System.out.println("******* ��ɼ��� *******");
			System.out.println("       	    ");
			System.out.println("1. insert(���)\n");
			System.out.println("2. delete(����)\n");
			System.out.println("3. update(����)\n");
			System.out.println("4. quit(����)	\n");
			System.out.println("*********************\n\n");
			System.out.println("������ ����� �����ϼ���!");
			System.out.print("1 2 3 4  �� �ϳ��� �����ϼ���_");
			
			command = scanner.nextLine(); //ScannerŬ���� ���� �Ŀ� ���ڿ� �� ���� �Է¹��� �� ���� ��ٸ���. �Է��� �� ����Ű�� ġ�� �Է��� �Ϸ�ȴ�.
						
			switch(command){
			case "1":
				System.out.println("��� �۾��� ���� �մϴ�.");
				break;
			case "2":
				System.out.println("���� �۾� ���� �մϴ�.");
				break;
			case "3":
				System.out.println("���� �۾��� ���� �մϴ�.");
				break;
			case "4":
				System.out.println("���α׷� ���� �մϴ�.");
				System.exit(0); //���ø����̼��� �����Ų��.
			default:
				System.out.println("1 2 3 4  �� �ϳ��� �����ϼ���.");
			}
			
		}
		
		
	}
	
	}


