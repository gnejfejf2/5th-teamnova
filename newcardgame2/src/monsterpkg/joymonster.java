package monsterpkg;

import java.util.Random;
import java.util.Scanner;

public class joymonster extends monster {
	public int skillatk;
	public int brave;
	public int brain;
	public int lucky;

	Scanner sc = new Scanner(System.in);

	Random random = new Random();

	public void stanset(int brave, int brain, int lucky) {
		this.brave = brave;
		this.brain = brain;
		this.lucky = lucky;

	}

	public void statbuy(int num) {// ���̽����ڵ� �� �����ְ� �������º� �ǹ̰�����
		if (num == 1) {
			brave = brave + 5;
			System.out.println("�밨������ �����ϴ� ����ǥ�� ����ǥ�� ������ ���");
		} else if (num == 2) {
			brain = brain + 5;
			System.out.println("0+1�� 1�ϻ��̴�");
		} else if (num == 3) {
			lucky = lucky + 5;
			System.out.println("Ÿ�� ���ڻ� ���� ����...!");
		}

	}

	public int power(int atk1, int def1, int skillpoint, int randomno, int allitematk, int allitemdef)// ���� ��ų ����
	{
		System.out.println("���ݰ� ������ � ������ �Ͻðڽ��ϱ�.");
		System.out.println("���� ���� ���� Ƚ��" + skillpoint);
		System.out.println("1.���� 2.����� 3.���ǰ���(�����ܰ踸 ���� ����)");
		int num2 = sc.nextInt();
		if (num2 == 1) {
			skillname = "����ǥ��";
			int randatk = random.nextInt(randomno) + 1;
			skillatk = (((atk1 / randatk) + allitematk) * brave / 100);

			return skillatk;

		} else if (num2 == 2) {
			skillname = "����ǥ��";
			int randdef = random.nextInt(randomno - 1) + 1;
			skillatk = (((atk1 / randdef) + allitemdef) * brave / 100);
			return skillatk;

		} else if (num2 == 3) {

			if (skillpoint > 0) {
				System.out.println("1.���Ǵн� 2.���� ȭ�� 3.�����Ӽ�");
				int num1 = sc.nextInt();
				if (num1 == 1) {
					skillname = "���Ǵн�";
					sppoint = skillpoint - 1;
					int rand = random.nextInt(8) + 1;
					skillatk = (((atk1 * 4) / rand) * lucky) / 100;

					return skillatk;
				} else if (num1 == 2) {
					skillname = "���� ȭ��";
					sppoint = skillpoint - 1;
					skillatk = (int) ((atk1 + (atk1 * (0.5))) * lucky) / 100;

					return skillatk;
				} else if (num1 == 3) {
					skillname = "�����Ӽ�";
					int rand = random.nextInt(2) + 1;
					sppoint = skillpoint - 1;
					skillatk = (((atk1 + def1) / rand) * lucky / 100);

					return skillatk;
				} else
					System.out.println("�߸� �Է� �ϼ̽��ϴ�.");

			} else {
				System.out.println("��ų����Ʈ�� �����մϴ�");
				System.out.println("");
				return 0;
			}
		} // ������ ��ų ���� 3����������

		return 0;
	}// ���� ���ݷ�Ʈ

	public int randpower(int atk1, int def1, int randomno, int allitematk, int allitemdef)//�������� ��Ʈ
	{
		int rand=random.nextInt(30)%2;
		if (rand == 0) {
			skillname = "����ǥ��";
			int randatk = random.nextInt(randomno) + 1;
			skillatk = (((atk1 / randatk) + allitematk) * brave / 100);

			return skillatk;

		} else if (rand == 1) {
			skillname = "����ǥ��";
			int randdef = random.nextInt(randomno - 1) + 1;
			skillatk = (((atk1 / randdef) + allitemdef) * brave / 100);
			return skillatk;

		}

		return 0;
	}// ���� ���ݷ�Ʈ

}
