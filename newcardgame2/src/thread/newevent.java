package thread;

import java.util.Random;

public class newevent implements Runnable {

	public int power;
	public boolean isloop2;
	public int myLife;
	Random random = new Random();



	public newevent(int power,boolean isloop2,int myLife) {

		super();
		this.power = power;
		this.isloop2 = isloop2;
		this.myLife = myLife;
	}

	@Override
	public void run() {
		while(isloop2==false) {
			battle();
			
			isloop2=true;
			
		}
	}
	
	
	public void battle() {
		System.out.println();
		System.out.println();
		System.out.println("==========���� ������ ���� �����Դϴ�.==========");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.print("                              ");
		System.out.println("���� ������ �������� "+power+"�Դϴ�!");
		System.out.println();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("                              ");
		System.out.println("���� ���Ͱ�  �÷��̾ ���� ����!");
		System.out.println();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		myLife = myLife - power;
		System.out.print("                              ");
		System.out.println("�� ���� ������ ����Ʈ�� "+myLife+" �Դϴ�.");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
