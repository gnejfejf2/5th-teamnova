package thread;

public class darkdual implements Runnable {

	public int total;
	public boolean isLoop = false;
	public int darkdualpoint;
	public darkdual(int total, boolean isLoop,int darkdualpoint) {
		this.total = total;
		this.isLoop=isLoop;
		this.darkdualpoint=darkdualpoint;
	}

	public void close() {
		isLoop = false;
		
	}

	@Override
	public void run() {
		while (isLoop) {
			
			try {
				
				if(total>0) {
					System.out.println("");
					System.out.println("					����� ���� ���� ü���� ������ �پ��ϴ�");
					System.out.println("");
					System.out.println("						                   ���� ���� ü���� " + total);
					System.out.println("");
				Thread.sleep(5000);
				total = total - 10;
				
				
				

				if (total <= 50&&total>0) {
					System.out.println("					ü���� 50�����Դϴ� ���ǰ� �ʿ��մϴ�");
				}
				else if(total<=0) {
					System.out.println("				����� ���� ���� ü���� 0�� �Ǿ� ����Ͽ����ϴ�.");
					System.out.println("				�ƹ� ���ڳ� �Է����ּ���.");
				}
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}