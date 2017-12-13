package util;
/*Account Ŭ����
    ���¹�ȣ  , �ܰ�  , �Ա� , ���, ������ü, �����������

 * */
public class Account {
	String name; 		//������
	String accountnum; 	//���¹�ȣ
	int balance;		//�ܰ�
	
	public Account(){}
	
	public Account(String name, String accountnum, int balance){
		 this.name = name;
		 this.accountnum = accountnum;
		 this.balance = balance;
		 }
	//=====================================================================  �ʱ�ȭ	
	public void accountinfo(){
			System.out.println("������:"+name);
			System.out.println("���¹�ȣ:"+accountnum);
			System.out.println("�ܰ�:"+balance);
			System.out.println("===============================");
		}

	//�Ա�
	public void deposit(int money){
		this.balance += money;
		System.out.println(money+"���� �Ա��ϰ�, �ܰ��"+ balance +"���Դϴ�.");
		System.out.println("======================================");
	}
	//���
	public void withdraw(int money){
		if(balance <money){
			System.out.println("�ܰ� �����մϴ�.");
		}else{
			balance -= money;
			System.out.println("����ݾ�:"+money +", "+"�ܰ�:"+ balance);
		}
		System.out.println("=====================================");
	}
	//��ü
	public void moneyTrans(Account from, Account to, int money){
		if(this.balance < money){
			System.out.println("�ܰ� �����Ͽ� ��ü�� �� �� �����ϴ�.");
		}else{
			System.out.println("��� ���� ����");
			from.infoPrint();
			System.out.println("�Ա� ���� ����");
			to.infoPrint();
			System.out.println("----------������ü������---------");
			from.infoPrint();
			from.withdraw(money);
			to.infoPrint();
			to.deposit(money);
			System.out.println(money+"���� ��ü�Ǿ����ϴ�.");
		}
		System.out.println("====================================");
	}
	
	public void moneyTrans(Account to, int money){
		if(to == null){
			System.out.println("�������� Ȯ���ϼ���");
			return;
		}
		if(this.balance < money){
			System.out.println("�ܰ� �����Ͽ� ��ü�� �� �� �����ϴ�.");
		}else{
			System.out.println("��� ���� ����");
			infoPrint();
			System.out.println("�Ա� ���� ����");
			to.infoPrint();
			System.out.println("----------������ü������---------");
			infoPrint();
			withdraw(money);
			to.infoPrint();
			to.deposit(money);
			System.out.println(money+"���� ��ü�Ǿ����ϴ�.");
		}
		System.out.println("====================================");
	}
	//�ܰ���ȸ
	public void infoPrint(){
		System.out.printf("���� :%s",accountnum);
		System.out.printf("�ܾ� :%d%n",balance);
	}
}
