package day9;

import util.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account a1 = new Account("ȫ�浿","001",3000);
		Account a2 = new Account("���ֿ�","003",2000);
		//a1.deposit(5000); //�Ա�
		//a1.withdraw(2000);	//���
		//Account2 a2 = new Account2("��浿","002",1000);
		//a1.moneyTrans(a1, a2, 3000);
		a1.moneyTrans(null, 3000); //�ڱ��ڽſ��� ��ü.
		a2.moneyTrans(a1,a2,2000);
	}

}
