package thread;

public class Autoheal implements Runnable {
	public int total;
	public boolean isLoop = false;
	public int healing=0;

	public Autoheal(int total, boolean isLoop) {
		this.total = total;
		this.isLoop = isLoop;
		
	}

	@Override
	public void run() {
		if (total < 50 && total >= 0) {
			System.out.println();
			System.out.println("������ ���� ü���� 50�̸��϶� �������ϴ�.");
			System.out.println();
			System.out.println("������ ü���� "+total+"�̹Ƿ� ������ ���� ���� ä������ �ֽ��ϴ�");
			System.out.println();
			System.out.println("������ ���� �ִ� 10������ �������ϴ�.");
			System.out.println();
			System.out.println("(����)������ ���� ���� �ٸ����� �ٳ���� ä���� ���� ������Ե˴ϴ�.");
			System.out.println();
			while (isLoop) {

				try {

					if (total < 50 && total >= 0) {

						Thread.sleep(5000);
						healing = healing+ 1;

					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}
}
