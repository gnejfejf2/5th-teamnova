package thread;

public class Bossattack implements Runnable {
	public int life;
	public int Lv;
	public boolean isLoop = false;
	public int point;
	public int minushealth;

	public Bossattack(int life, int Lv, boolean isLoop,int point,int minushealth) {
		this.life = life;
		this.Lv = Lv;
		this.isLoop = isLoop;
		this.point=point;
		this.minushealth=minushealth;
	}

	@Override
	public void run() {
		while (isLoop) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			life = life - 1000 * (Lv + 1);
			minushealth=(4000-life)/100;
			System.out.println("							������ �������� ���� ü���� " + life + "���ҽ��ϴ�");
			System.out.println();
			if (life <= 0) {
				System.out.println("							������ �������� ���� Life�� 0�� �Ǿ� �й��Ͽ����ϴ�.");
				break;

			}

		}

	}

}
