package day15.exception;

public class Test02 {

	public static void main(String[] args) {
		try{
		Thread.sleep(5000) ;
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("START");
		String name = null;
		if(name != null)	System.out.println(name.toString());
		
		System.out.println("END");
	}

}


