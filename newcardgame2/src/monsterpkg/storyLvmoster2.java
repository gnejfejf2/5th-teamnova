package monsterpkg;

import java.util.Scanner;

import thread.storymodeLv2;

public class storyLvmoster2 extends monster {
	public boolean storyloop = true;
	public int power;
	Scanner sc = new Scanner(System.in);

	public void storyset(int i, int atk1) {

		if (i == 0) {
			for (int b = 0; b < 80; b++)
				System.out.println("");
			System.out.println("��ŵ�� ���Ͻø� 0���� �����ּ���");
			storymodeLv2 story = new storymodeLv2();
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
			//////////////////////////// ���丮 ���/////////////
			System.out.println("���� ���� ī�带 �븮������ ������� �Դ�!");
			System.out.println("");
			this.atk = 1200;
			this.def = 1800;
			this.name = "�׸��ӿ� �����ִ���";
			System.out.println("		ī�� �̸� :"+name+"			���ݷ�"+atk+"			�����"+def);

		} // ���丮2�� ���� 1�� ��ȭ

		else if (i == 1) {
			System.out.println("����������");
			System.out.println("");
			System.out.println("�� �������� �����Ŵ�!!");
			System.out.println("");
			System.out.println("�� ����Ʈ ī�忡�� ����� ����");
			System.out.println("");
			System.out.println("��ũ��ũ���Ǿ� ��ȯ!");
			System.out.println("");
			this.atk = 2200;
			this.def = 2800;
			this.name = "��ũ��ũ���Ǿ�";
			System.out.println("		ī�� �̸� :"+name+"			���ݷ�"+atk+"			�����"+def);
		} // ���丮2�� ���� 2�� ��ȭ
		else if (i == 2) {
			System.out.println("�̰͸��� �����ϴٴ� �� ������ �����̴�...");
			System.out.println("");
			System.out.println("������ ��ȭ");
			System.out.println("");
			System.out.println("��ϸ��� ��ٰ��� ��ȯ!");
			System.out.println("");
			System.out.println("�� ������ �����̴�!");
			System.out.println("");
			System.out.println("�������� ������� ���� ���ݷ¸�ŭ����ذ���");
			System.out.println("");
			this.atk = 3000 + (atk1 / 2);
			this.def = 2500 + (atk1);
			this.name = "��ϸ��� ��ٰ�";
			System.out.println("		ī�� �̸� :"+name+"			���ݷ�"+atk+"			�����"+def);
		} // ���丮2�� ���� 3�� ��ȭ

	}
	/////////////////////////////// 2�����丮 ����//////////////////////////////

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
//////////////////////////���丮����2���� ���� ���� ���//////////////

//////////////////////////��ų����//////////////		

			else if (rand == 3) {

				if (i == storyLv) {
					int rand1 = random.nextInt(3) + 1;
					power = (atk1 * 2) / rand1;
					System.out.println("��ũ ��ũ���Ǿ�" + power);
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
