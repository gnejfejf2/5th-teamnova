package itempkg;

import thread.Music;

public class item{
	public String name;
	public int def;
	public int atk;
	public int refundmoney;
	public void itemset(int atk,int def,String name)//�� ���� �ڵ�
{
	this.atk=atk;
	this.def=def;
	this.name=name;
}
	
	public int myitembuy(int mymoney,int num3) {//����ũ ���� �ڵ�
		Music buy=new Music("buy.mp3",false);
		Thread op=new Thread(buy);
		Music nobuy=new Music("nobuy.mp3",false);
		Thread op1=new Thread(nobuy);
	
		if(num3==1) 
		{
		if(mymoney>=1000)//���ø��� ���� ����ũ ���� �ڵ�
		{
			
			atk=500;
			def=500;
			name="���ø��� ���� ����ũ";
			System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�.");
			op.start();//������ ���� ���� ���
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�.");
			refundmoney=mymoney-1000;
			return refundmoney;
		}
		else
		{
			op1.start();//���Ž��� ����
			try {
				Thread.sleep(1300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���� �����մϴ� ���ư��ּ���");
			return 5;
		}

		}
		//1�� �������� ����
		if(num3==2) {//���� ���ο� ����ũ ���� �ڵ�
			if(mymoney>=5000)
			{
				atk=1000;
				def=1000;
				name="���� ���ο� ����ũ";
				refundmoney=mymoney-5000;
				op.start();//������ ���� ���� ���
				try {
					Thread.sleep(1300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�.");
				return refundmoney;
			}
			else {
				op1.start();//���Ž��� ����
				try {
					Thread.sleep(1300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���� �����մϴ� ���ư��ּ���");
				return 5;
			}
		}//2�����Ž�����
		if(num3==3) {//��������ũ ��� ����ũ ���� �ڵ�
			if(mymoney>=10000)
			{
				
				atk=1500;
				def=1500;
				name="��������ũ ����� ����ũ";	
				refundmoney=mymoney-10000;
				op.start();//������ ���� ���� ���
				try {
					Thread.sleep(1300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�.");
				return refundmoney;
			}
			else {	
				op1.start();//���Ž��� ����
				try {
					Thread.sleep(1300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���� �����մϴ� ���ư��ּ���");
				return 5;
			}
		}//3������ ����
		else {
			return 5;
		}
	}
	
}
