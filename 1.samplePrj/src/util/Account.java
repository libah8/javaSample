package util;
/*Account 클래스
    계좌번호  , 잔고  , 입금 , 출금, 계좌이체, 통장정보출력

 * */
public class Account {
	String name; 		//예금주
	String accountnum; 	//계좌번호
	int balance;		//잔고
	
	public Account(){}
	
	public Account(String name, String accountnum, int balance){
		 this.name = name;
		 this.accountnum = accountnum;
		 this.balance = balance;
		 }
	//=====================================================================  초기화	
	public void accountinfo(){
			System.out.println("예금주:"+name);
			System.out.println("계좌번호:"+accountnum);
			System.out.println("잔고:"+balance);
			System.out.println("===============================");
		}

	//입금
	public void deposit(int money){
		this.balance += money;
		System.out.println(money+"원을 입금하고, 잔고는"+ balance +"원입니다.");
		System.out.println("======================================");
	}
	//출금
	public void withdraw(int money){
		if(balance <money){
			System.out.println("잔고가 부족합니다.");
		}else{
			balance -= money;
			System.out.println("인출금액:"+money +", "+"잔고:"+ balance);
		}
		System.out.println("=====================================");
	}
	//이체
	public void moneyTrans(Account from, Account to, int money){
		if(this.balance < money){
			System.out.println("잔고가 부족하여 이체를 할 수 없습니다.");
		}else{
			System.out.println("출금 계좌 정보");
			from.infoPrint();
			System.out.println("입금 계좌 정보");
			to.infoPrint();
			System.out.println("----------계좌이체수행중---------");
			from.infoPrint();
			from.withdraw(money);
			to.infoPrint();
			to.deposit(money);
			System.out.println(money+"원이 이체되었습니다.");
		}
		System.out.println("====================================");
	}
	
	public void moneyTrans(Account to, int money){
		if(to == null){
			System.out.println("계좌정보 확인하세요");
			return;
		}
		if(this.balance < money){
			System.out.println("잔고가 부족하여 이체를 할 수 없습니다.");
		}else{
			System.out.println("출금 계좌 정보");
			infoPrint();
			System.out.println("입금 계좌 정보");
			to.infoPrint();
			System.out.println("----------계좌이체수행중---------");
			infoPrint();
			withdraw(money);
			to.infoPrint();
			to.deposit(money);
			System.out.println(money+"원이 이체되었습니다.");
		}
		System.out.println("====================================");
	}
	//잔고조회
	public void infoPrint(){
		System.out.printf("계좌 :%s",accountnum);
		System.out.printf("잔액 :%d%n",balance);
	}
}
