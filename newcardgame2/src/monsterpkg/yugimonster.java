package monsterpkg;

import java.util.Random;
import java.util.Scanner;

public class yugimonster extends monster {
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

/////////////////////////////���� ���///////////////////////////	
	public void statbuy(int num) {
		if (num == 1) {
			brave = brave + 5;
			System.out.println("�������� �����ǹ̰� ������ �̰�...");
		} else if (num == 2) {
			brain = brain + 5;
			System.out.println("������ ��ų ���ݷ��� ���� ���!");
		} else if (num == 3) {
			lucky = lucky + 5;
			System.out.println("�������� �������� �⺻����ǥ�� �⺻����ǥ�� ��ȭ!");
		}

	}
/////////////////////////////���� ���///////////////////////////	

/////////////////////////////������ ��ų ����///////////////////////////
	public int power(int atk1, int def1, int skillpoint, int randomno, int allitematk, int allitemdef) {

		System.out.println("���ݰ� ������ � ������ �Ͻðڽ��ϱ�.");
		System.out.println("���� ���� ���� Ƚ��" + skillpoint);
		System.out.println("1.���� 2.����� 3.���ǰ���(�����ܰ踸 ���� ����)");
		int num2 = sc.nextInt();
		if (num2 == 1) {
			skillname = "���� ǥ��";
			int randatk = random.nextInt(randomno) + 1;
			skillatk = (((atk1 / randatk) + allitematk) * lucky / 100);
			return skillatk;

		} else if (num2 == 2) {
			skillname = "���� ǥ��";
			int randdef = random.nextInt(randomno - 1) + 1;
			skillatk = (((atk1 / randdef) + allitemdef) * lucky / 100);
			return skillatk;

		}

		else if (num2 == 3) {

			if (skillpoint > 0) {
				System.out.println("1.�ҷ�ź 2.������� 3.��ǳź");
				int num1 = sc.nextInt();
				if (num1 == 1) {
					skillname = "�ҷ�ź";
					sppoint = skillpoint - 1;
					int rand = random.nextInt(4) + 1;
					skillatk = (((atk1 * 3) / rand) * brain) / 100;
					return skillatk;
				} else if (num1 == 2) {
					skillname = "��� ����";
					sppoint = skillpoint - 1;
					skillatk = (int) ((def1 * 1.5)) * brain / 100;
					return skillatk;
				} else if (num1 == 3) {
					skillname = "��ǳź";
					sppoint = skillpoint - 1;
					int rand = random.nextInt(2) + 1;
					skillatk = (((atk1 + def1) / rand) * brain) / 100;
					return skillatk;
				} else
					System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				System.out.println("�߸��� �������� ���ݱ�ȸ�� �Ҿ����ϴ�");
				return 0;
			} else {
				System.out.println("��ų����Ʈ�� �����մϴ�");
				System.out.println("�߸��� �������� ���ݱ�ȸ�� �Ҿ����ϴ�");
				return 0;
			}
		} // ������ ��ų ���� 3����������

		return 0;
	}// ���� ���� ������

	public int randpower(int atk1, int def1, int randomno, int allitematk, int allitemdef)// �������� ��Ʈ
	{
		int rand = random.nextInt(30) % 2;
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
	}// �������� ��Ʈ
}
/////////////////////////////������ ��ų ����///////////////////////////