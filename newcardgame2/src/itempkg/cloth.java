package itempkg;

import thread.Music;

public class cloth extends item{

	public int skipppointup;

public int clothbuy(int mymoney,int num4){
	Music clothbuy=new Music("cloth.mp3",false);
	Thread op=new Thread(clothbuy);
	Music nobuy=new Music("nobuy.mp3",false);
	Thread op1=new Thread(nobuy);
	if(num4==1) 
	{

		if(mymoney>=1000)//���ø��� ���� �� �����ڵ�
		{	
			atk=300;
			def=300;
			name="���ø��� ���� ����";
			op.start();//������ ���� ���� ���
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�.");
			refundmoney=mymoney-1000;
			skipppointup=0;
			return refundmoney;
		}//���ø��� ���� �� �����ڵ�
		else
		{
			op1.start();//������ ���� ���� ���
			try {
				Thread.sleep(1300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���� �����մϴ� ���ư��ּ���");
			return 5;
		}//���ø��� ���� �� �����ڵ�

	}//1�� �������� ����
	
	else if(num4==2) {//���� ���ο� ����ũ ���� �ڵ�
		if(mymoney>=5000)
		{
			atk=500;
			def=500;
			name="���� ���ο� ����";
			op.start();//������ ���� ���� ���
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�.");
			refundmoney=mymoney-5000;
			skipppointup=0;
			return refundmoney;
		}
		else {
			op1.start();//������ ���� ���� ���
			try {
				Thread.sleep(1300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���� �����մϴ� ���ư��ּ���");
			return 5;
		}
	}//2�����Ž�����
	else if(num4==3) {//��������ũ ��� ����ũ ���� �ڵ�
		if(mymoney>=10000)
	{
			
			atk=1000;
			def=1000;
			name="��������ũ ����� ����";
			op.start();//������ ���� ���� ���
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�.");
			skipppointup=0;
			refundmoney=mymoney-10000;
			return refundmoney;
		}
		else {	
			op1.start();//������ ���� ���� ���
			try {
				Thread.sleep(1300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���� �����մϴ� ���ư��ּ���");
			return 5;
		}
	}	
	else if(num4==4) {//������ ��
			if(mymoney>=30000)
			{
				
				atk=1500;
				def=1500;
				name="������ ��";	
				op.start();//������ ���� ���� ���
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�.");
				skipppointup=1;//��ų����Ʈ 1����  ���� ū����
				refundmoney=mymoney-30000;
				return refundmoney;
			}
			else {	
				op1.start();//������ ���� ���� ���
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

