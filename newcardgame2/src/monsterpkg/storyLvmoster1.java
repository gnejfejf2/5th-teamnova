package monsterpkg;

import java.util.Scanner;

import thread.storymodeLv1;

public class storyLvmoster1 extends monster {
	public boolean storyloop = true;
	public int power;
	Scanner sc = new Scanner(System.in);

	public void storyset(int i, int atk1) {
		/////////////////////////////////////////////////

		////////////////////////////////////////////////
		if (i == 0) {
			for (int b = 0; b < 80; b++)
				System.out.println("");
			System.out.println("��ŵ�� ���Ͻø� 0���� �����ּ���");
			storymodeLv1 story = new storymodeLv1();
			Thread op = new Thread(story);
			op.start();
			/////////////////////// 1�ܰ� ���丮 ���
			while (storyloop) {
				int skipnum = sc.nextInt();
				if (skipnum == 0) {
					for (int j = 0; j < 80; j++)
						System.out.println("");
					System.out.println("��ŵ�Ǿ����ϴ�");
					op.stop();
					storyloop = false;
				} else {

				}

			}
			try {//////////////////// ���� �����尡 �����ٸ� �ٷδ��� �����Ű�� ���Ͽ�
				op.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("�� �̸��� ����ũ �������� ������ �� ������ �հ� ������ �����غ���");
			System.out.println("");
			this.atk = 1500;
			this.def = 1500;
			this.name = "�����̹� ������";
			System.out.println("		ī�� �̸� :" + name + "			���ݷ�" + atk + "			�����" + def);

		} // ���丮1�� ���� 1�� ��ȭ

		else if (i == 1) {
			System.out.println("�� �̸��� ����ũ �� �������� ��ٷ��Դ�");
			System.out.println("");
			System.out.println("����� �Ķ���� �����̷� ��ƿ� ������ �����");
			System.out.println("");
			System.out.println("���� ���⼭ �����ϰڴ�.");
			System.out.println("");
			System.out.println("�� ���ʹ� ������ �絵");
			System.out.println("");
			this.atk = 1800 + ((atk1 * 2) / 3);
			this.def = 1900 + ((atk1 * 2) / 3);
			this.name = "������ �絵";
			System.out.println("		ī�� �̸� :" + name + "			���ݷ�" + atk + "			�����" + def);
		} // ���丮1�� ���� 2�� ��ȭ

		else {

		}
	}
	/////////////////////////////// 2�����丮 ����//////////////////////////////

	public int storyatk(int atk1, int def1, int i, int storyLv) {

		Loop1: while (true) {
			int rand = ((random.nextInt(5) + 1) % 3) + 1;// �������� ���� ����� ���� ���� ��ų�� ������ �������� ����
			if (rand == 1) {

				int randatk = random.nextInt(4) + 1;
				System.out.println("");
				System.out.println(name + "�� ���ݷ��� " + ((atk1 / randatk)));
				System.out.println("");
				power = atk1 / randatk;

				return power;

			} else if (rand == 2) {

				int randdef = random.nextInt(3) + 1;
				System.out.println("");
				System.out.println(name + "�� ������� " + ((def1 / randdef)));
				System.out.println("");
				power = def1 / randdef;
				return power;

			}
//////////////////////////���丮����1���� ���� ���� ���//////////////

//////////////////////////��ų����//////////////		

			else if (rand == 3) {

				if (i == storyLv) {
					int rand1 = random.nextInt(3) + 1;
					power = (atk1 * 2) / rand1;
					System.out.println("");
					System.out.println("������ ����" + power);
					System.out.println("");
					return power;
				} else {
					continue Loop1;
				}
			} // ���̹� ��ų

//////////////////////////��ų����//////////////		
			return power;
		}
	}

}
