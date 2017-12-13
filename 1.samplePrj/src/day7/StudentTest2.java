package day7;

public class StudentTest2 {

	public static void main(String[] args) {
//		Student[] s = new Student[5];//배열의 생성 선언
		Student[] s = {
				new Student(), 
				new Student(),
				new Student(),
				new Student(),
				new Student()
		}; //배열의 생성과 선언과 초기화
		
		s[4].name ="최씨";
		s[4].score = new int[]{99,99,99};
		
		for(int i=0; i<s.length; i++){
			s[i].process();
			s[i].display();
		}

	}

}
