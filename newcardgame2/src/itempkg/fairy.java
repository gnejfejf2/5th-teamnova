package itempkg;

import thread.Music;

public class fairy extends item {
	public int randomno;

	public void randset(int randomno) {
		this.randomno = randomno;
	}



	public int fairybuy(int mymoney, int num4) {
		Music fairybuy = new Music("fairybuy.mp3", false);
		Thread op = new Thread(fairybuy);
		Music nobuy = new Music("nobuy.mp3", false);
		Thread op1 = new Thread(nobuy);
		if (num4 == 1) {
			if (mymoney >= 1000)// ���زۿ���
			{
				atk = 500;
				def = 500;
				name = "���ز� ����";
				op.start();// ������ ���� ���� ���
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�.");
				refundmoney = mymoney - 1000;
				randomno = 5;// �����ѹ� �Ϲ� ���ݽ� �ѹ� �¿�
				return refundmoney;
			} // ���ø��� ���� �� �����ڵ�
			else {
				op1.start();// ���Ž��� ����
				try {
					Thread.sleep(1300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���� �����մϴ� ���ư��ּ���");
				return 5;
			} // ���زۿ���

		} // 1�� �������� ����

		else if (num4 == 2) {// ��� ī��Ŭ
			if (mymoney >= 10000) {
				atk = 100;
				def = 100;
				name = "������ ��� ī��Ŭ";
				op.start();// ������ ���� ���� ���
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�.");
				refundmoney = mymoney - 10000;
				randomno = 4;// �����ѹ� �Ϲ� ���ݽ� �ѹ� �¿�
				return refundmoney;
			} else {
				op1.start();// ���Ž��� ����
				try {
					Thread.sleep(1300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���� �����մϴ� ���ư��ּ���");
				return 5;
			}
		} // 2�����Ž�����
		else if (num4 == 3) {// �ϴ�ũ����
			if (mymoney >= 30000) {

				atk = 300;
				def = 300;
				name = "�ϴ�ũ����";
			
				op.start();// ������ ���� ���� ���
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�.");
				randomno = 3;// �����ѹ� �Ϲ� ���ݽ� �ѹ� �¿�
				refundmoney = mymoney - 30000;
				return refundmoney;
			} else {
				op1.start();// ���Ž��� ����
				try {
					Thread.sleep(1300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("���� �����մϴ� ���ư��ּ���");
				return 5;
			}
		} else if (num4 == 4) {// ����
			if (mymoney >= 100000) {

				atk = 500;
				def = 500;
				name = "����";
				op.start();// ������ ���� ���� ���
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�.");
				randomno = 2;// �����ѹ� �Ϲ� ���ݽ� �ѹ� �¿�
				refundmoney = mymoney - 100000;
				return refundmoney;
			} else {
				op1.start();// ���Ž��� ����
				try {
					Thread.sleep(1300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("���� �����մϴ� ���ư��ּ���");
				return 5;
			}
		} // 3������ ����
		else {
			return 5;
		}

	}

}
