package monsterpkg;

import java.util.Random;

public class Rivalmonster extends monster {
	public int power;
	Random random = new Random();

//////////////////////////���̹����� ���� ���� ���//////////////
	public int rivalatk(int atk1, int def1, int randomno) {
		int rand = ((random.nextInt(5) + 1) % 3) + 1;// �������� ���� ����� ���� ���� ��ų�� ������ �������� ����
		if (rand == 1) {
			skillname = "���� ǥ��";
			int randatk = random.nextInt(randomno + 3) + 1;
			power = atk1 / randatk;

			return power;

		} else if (rand == 2) {
			skillname = "���� ǥ��";
			int randdef = random.nextInt(randomno + 1) + 1;
			power = def1 / randdef;
			return power;

		}
//////////////////////////���̹����� ���� ���� ���//////////////

//////////////////////////��ų����//////////////		

		else if (rand == 3) {
			int rand2 = random.nextInt(3) + 1;
			// �������� ���� ����� � Ư�� ������ �Ұ����� ����
			if (rand2 == 1) {
				skillname = "Ư������";
				int rand1 = random.nextInt(10) + 1;
				power = (atk1 * 2) / rand1;

				return power;
			} else if (rand2 == 2) {
				skillname = "Ư������";
				power = (atk1 + def1) / 3;

				return power;
			} else if (rand2 == 3) {
				skillname = "Ư������";
				int rand1 = random.nextInt(8) + 1;
				power = (atk1 + def1) / rand1;

				return power;
			} else
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");

		} // ���̹� ��ų ���ù�

//////////////////////////��ų����//////////////		
		return power;
	}
	public int randatk(int atk1, int def1, int randomno) {
		int rand = random.nextInt(30) % 2;
		if (rand == 0) {
			skillname = "���� ǥ��";
			int randatk = random.nextInt(randomno + 3) + 1;
			power = atk1 / randatk;

			return power;

		} else if (rand == 1) {
			skillname = "���� ǥ��";
			int randdef = random.nextInt(randomno + 1) + 1;
			power = def1 / randdef;
			return power;

		}
		return 0;
	}
}
