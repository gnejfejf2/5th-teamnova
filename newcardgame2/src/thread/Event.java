package thread;

import java.util.Random;
import thread.newevent;

public class Event implements Runnable {
	public int power;
	public boolean isloop;
	public int rvLife;
	Random random = new Random();
	

	public Event(int power, boolean isloop, int rvLife) {
		super();
		this.power = power;
		this.isloop = isloop;
		this.rvLife = rvLife;
	}

	@Override
	public void run() {
		while (isloop) {
			
			battle();
	
			isloop=false;
			
			
		}

	}

	public void battle() {
		System.out.println();
		System.out.println();
		System.out.println("==========�� ������ ���� �����Դϴ�.==========");
		System.out.println();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�� ������ �������� "+power+"�Դϴ�!");
		System.out.println();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���濡�� ���� ����!");
		System.out.println();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		rvLife = rvLife - power;
		System.out.println();
		System.out.println("������ ���� ������ ����Ʈ�� "+rvLife+" �Դϴ�.");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
