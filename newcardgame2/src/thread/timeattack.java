package thread;

public class timeattack implements Runnable{
public boolean isloop=true;

public boolean atkchance=true;
	
	
	@Override
	public void run() {
		int timecount=30;
		while(isloop) {
			try {
				Thread.sleep(1000);
			timecount=timecount-1;
			if(timecount<=3&&timecount>0)
			{
				System.out.println("�����ð��� "+timecount+"���Դϴ� ���ѷ��ּ���!");
			}
			
			
			else if(timecount==0) {
				System.out.println("�ð��� �ٵǾ����ϴ�. �ƹ�Ű�� �Է����ּ���.");
				atkchance=false;
				break;
				
			}
			
			
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
