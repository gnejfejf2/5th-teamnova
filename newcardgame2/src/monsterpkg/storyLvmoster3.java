package monsterpkg;

import java.util.Scanner;

import thread.storymodeLv3;

public class storyLvmoster3 extends monster {
	public boolean storyloop = true;
	public int power;
	Scanner sc = new Scanner(System.in);

	public void storyset(int i, int atk1) {

		if (i == 0) {
			/////////////////////////////////////////////////
			for (int b = 0; b < 80; b++)
				System.out.println("");
			System.out.println("��ŵ�� ���Ͻø� 0���� �����ּ���");
			storymodeLv3 story = new storymodeLv3();
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
			////////////////////////////////////////////////
			System.out.println("�� �̸��� �뵵 ����� õ�� �������� ������ ���� ��Ÿ����");
			System.out.println("");
			this.atk = 1900;
			this.def = 1200;
			this.name = "������� ����� ��ȥ";
			System.out.println("		ī�� �̸� :"+name+"			���ݷ�"+atk+"			�����"+def);

		} // ���丮3�� ���� 1�� ��ȭ

		else if (i == 1) {
			System.out.println("����������");
			System.out.println("");
			System.out.println("�� ������ �ܿ�");
			System.out.println("");
			System.out.println("�� ��ȥ�� ���������� ���̾ƴϴ�");
			System.out.println("");
			System.out.println("���Ͷ� ����� ���� ��ũ");
			System.out.println("");
			this.atk = 2900;
			this.def = 3500;
			this.name = "��ũ";
			System.out.println("		ī�� �̸� :"+name+"			���ݷ�"+atk+"			�����"+def);
		} // ���丮3�� ���� 2�� ��ȭ

		else if (i == 2) {
			System.out.println("ũ��.... ���س�������..");
			System.out.println("");
			System.out.println("�� �Ҹ���...");
			System.out.println("");
			System.out.println("�� �̸��� ��� ��ũ �� ���� ����� ������");
			System.out.println("");
			System.out.println("�����λ�� ��Ÿ���� ");
			System.out.println("");
			System.out.println("�Ķ���� ���� ��ȯ���� �η����ʴ�");
			System.out.println("");
			this.atk = 3000 + (atk1 / 3);
			this.def = 2500 + (atk1 / 2);
			this.name = "��� ��ũ";
			System.out.println("		ī�� �̸� :"+name+"			���ݷ�"+atk+"			�����"+def);
		} // ���丮3�� ���� 3�� ��ȭ
		else if (i == 3) {
			System.out.println("ũ��....");
			System.out.println("");
			System.out.println("�����̳� �� ����");
			System.out.println("");
			System.out.println("�������� ��������!!");
			System.out.println("");
			System.out.println("�����ũ =>���� ��ũ ��ũ���ĵ��� ");
			System.out.println("");
			this.atk = 4000 + (atk1 / 2);
			this.def = 4000 + (atk1 / 2);
			this.name = "���� ��ũ ��ũ���ĵ���";
			System.out.println("		ī�� �̸� :"+name+"			���ݷ�"+atk+"			�����"+def);
		} // ���丮3�� ���� 4�� ��ȭ

	}
	/////////////////////////////// 3�����丮 ����//////////////////////////////

	public int storyatk(int atk1, int def1, int i, int storyLv) {

		Loop1: while (true) {
			int rand = ((random.nextInt(5) + 1) % 3) + 1;// �������� ���� ����� ���� ���� ��ų�� ������ �������� ����
			if (rand == 1) {

				int randatk = random.nextInt(4) + 1;
				System.out.println(name + "�� ���ݷ��� " + ((atk1 / randatk)));
				power = atk1 / randatk;

				return power;

			} else if (rand == 2) {

				int randdef = random.nextInt(3) + 1;
				System.out.println(name + "�� ������� " + ((def1 / randdef)));
				power = def1 / randdef;
				return power;

			}
//////////////////////////���丮����3���� ���� ���� ���//////////////

//////////////////////////��ų����//////////////		

			else if (rand == 3) {

				if (i == storyLv) {
					int rand1 = random.nextInt(2) + 1;
					power = (atk1 * 3) / rand1;
					System.out.println("����� ���" + power);
					return power;
				} else {
					continue Loop1;
				}
			} // ���̹� ��ų

//////////////////////////��ų����//////////////		
			return power;
		}
	}

	///////////////////////// �����ڵ峡
}
