package day7;

public class StudentTest2 {

	public static void main(String[] args) {
//		Student[] s = new Student[5];//�迭�� ���� ����
		Student[] s = {
				new Student(), 
				new Student(),
				new Student(),
				new Student(),
				new Student()
		}; //�迭�� ������ ����� �ʱ�ȭ
		
		s[4].name ="�־�";
		s[4].score = new int[]{99,99,99};
		
		for(int i=0; i<s.length; i++){
			s[i].process();
			s[i].display();
		}

	}

}
