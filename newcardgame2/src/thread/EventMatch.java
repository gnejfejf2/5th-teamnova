package thread;

import humanpkg.*;

import java.util.Random;
import java.util.Scanner;

public class EventMatch implements Runnable {
	public int rand;
	public int rand1;
	public int eventmoney;
	public boolean isLoop;
	Random random = new Random();

	@Override

	public void run() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (isLoop) {

			try {
				rand = random.nextInt(50) + 12;
				rand1 = random.nextInt(70) + 11;
				if (rand1 == rand) {

					System.out.println();
					System.out.println("			��Ȳ�ϴ��� �ٴڿ� ������ ī�� ������ �߰��Ͽ����ϴ�");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println();
					System.out.println("			���� ���̴� ī�� ������ �ֿ�ðڽ��ϱ�?");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println();
					System.out.println("			ī�带 �ֿ�Ƿ��� " + rand + "Ű�� �Է����ּ���");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					eventmoney = (100 * rand);
					
					break;
				}
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public EventMatch(int eventmoney, boolean isLoop) {
		super();
		this.eventmoney = eventmoney;
		this.isLoop = isLoop;

	}

}
