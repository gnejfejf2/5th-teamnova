package monsterpkg;

import java.util.Random;

import thread.timeattack;

public class boss0 extends monster {
	public int HP;

	Random rd = new Random();

	public int attack(int power, int HP1, int atk, int Lv, double weatherpoint,boolean atkchance) {

		if (atkchance == true) {

			if (HP >= 0) {

				int rand = random.nextInt(8) + 1;// �������� �������� ��ų����ϰ� �������
				if (rand == 10)// ���尪�ϰ� �������� ��ų �ߵ�
				{

					HP = (Lv * 3000) + 5000;
					System.out.println("������  ������ ��ȿ�� �ϰ� �����̴�");

					return HP;
				} else if (rand == 1)// ���尪�ϰ� �������� ��ų �ߵ�
				{

					HP = HP1 - ((int) (power * weatherpoint) / 2);
					System.out.println("������ ���� ��ȭ!");
					System.out.println("�� ���� �������� " + power);
					System.out.println("������ ������ ��ų�� ���� �������� "+(power/2)+"�� �پ������ϴ�.");
					if (weatherpoint == 0.5 || weatherpoint == 2) {
						System.out.println("������ ������ �������� " + ((int) (power * weatherpoint)/2) + "������ ��ŭ ����˴ϴ�.");
					}
					System.out.println("������ ����ü���� " + HP + "�Դϴ�");


					return HP;
				} else {

					HP = HP1 - (int) (power * weatherpoint);
					System.out.println("�� �������� " + power);
					if (weatherpoint == 0.5 || weatherpoint == 2) {
						System.out.println("������ ������ �������� " + (int) (power * weatherpoint) + "������ ��ŭ ����˴ϴ�.");
					}
					System.out.println("������ ����ü���� " + HP + "�Դϴ�");
					return HP;
				}
			} else {
				
				return HP1;
			}
		}
		
		else if(atkchance == false){
			System.out.println("�ð��� ���� ���ݱ�ȸ�� ����Ͽ����ϴ� .");
		
			return HP1;
		}
		else
			return HP1;
	}

}
