package day14.lab2;

public class TvTest02 {

	public static void main(String[] args) {
			TV user = null;
			
			if(args[0].equals("p")){
				user = new PTV();
			}else if(args[0].equals("s")){
				user = new STV();
			}else{
				user = new LTV();
			}
					
			user.poweron();
			user.poweroff();
	}
}

interface TV{	//-->사용자는 TV를 사용한다. 즉, 사용자는 interface를 보고 TV를 사용하는 것이 된다.
	void poweron();
	void poweroff();
}

class LTV implements TV{

	@Override
	public void poweron() {
		System.out.println(getClass().getSimpleName()+" poweron()");		
	}

	@Override
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+" poweroff()");		
		
	}
	
}

class STV implements TV{

	@Override
	public void poweron() {
		System.out.println(getClass().getSimpleName()+" poweron()");		
		
	}

	@Override
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+" poweroff()");		
		
	}
	
}

class PTV implements TV {
	
	public void poweron() {
		System.out.println(getClass().getSimpleName()+" poweron()");		
		
	}
	
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+" poweroff()");		
		
	}
	
}
