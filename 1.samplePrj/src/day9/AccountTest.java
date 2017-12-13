package day9;

import util.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account a1 = new Account("홍길동","001",3000);
		Account a2 = new Account("김주영","003",2000);
		//a1.deposit(5000); //입금
		//a1.withdraw(2000);	//출금
		//Account2 a2 = new Account2("김길동","002",1000);
		//a1.moneyTrans(a1, a2, 3000);
		a1.moneyTrans(null, 3000); //자기자신에서 이체.
		a2.moneyTrans(a1,a2,2000);
	}

}
