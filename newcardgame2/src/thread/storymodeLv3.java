package thread;

public class storymodeLv3 implements Runnable{

	@Override
	public void run() {
		System.out.println("����� : ������� �տ��� ���ض� �� �������� ������ ����� �������Դٰ�");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("����� : �� �̸��� ��� ���� ����ģ ��ũ����ī���� �Ƕ�̵忡�� ������ ���̴�.");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("����� : ���Ҿ� �����ִ� �� �̶� ������ ����");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�Ű��� : ������ ���� ���� ������");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�Ű���  : �������� �ʰڴ�");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("����� : �ʳ������� �Ƿ��� ������ ���� ��� �� ������");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
