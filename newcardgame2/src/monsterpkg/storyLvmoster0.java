package monsterpkg;

import java.util.Scanner;

import thread.storymodeLv0;

public class storyLvmoster0 extends monster{
	public boolean storyloop = true;
	public int power;
	Scanner sc = new Scanner(System.in);

	public void storyset(int i,int atk1) 
	{
		if(i==0)
		{
			///////////////////////////////////////////////
			for (int b = 0; b < 80; b++)
				System.out.println("");
			System.out.println("��ŵ�� ���Ͻø� 0���� �����ּ���");
			storymodeLv0 story = new storymodeLv0();
			Thread op = new Thread(story);
			op.start();
	
			while(storyloop) {
			int skipnum=sc.nextInt();
			if(skipnum==0)
			{
				for (int j = 0; j < 80; j++)
				      System.out.println("");
				System.out.println("��ŵ�Ǿ����ϴ�");
				op.stop();
				storyloop=false;
			}
			else {
				
			}	
			///////////////////0�ܰ� ���丮 ���////////////////
			}
			try {
				op.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("������� �� �ö���̾�� ���� ���� �̱�� �Ҿƹ����� ��ȥ�� �����帮��");
			System.out.println("");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���� �������ִ� ���ʹ� ������� ������ ��ũ�����̽� ����� ������ ���ݷ��� �������");
			System.out.println("");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			this.atk=1500+(atk1/2);
				
			this.def=1000+(atk1/2);
				
			this.name="������� ������ ��ũ�����̽�";
			System.out.println("		ī�� �̸� :"+name+"			���ݷ�"+atk+"			�����"+def);
	
				
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//���丮 1��

	}	
		
		
		
		
		
		
		
		
		
		
		
		
	public int storyatk(int atk1,int def1,int i,int storyLv)
	{
		
		Loop1:while(true) {
			int rand=((random.nextInt(5)+1)%3)+1;//�������� ���� ����� ���� ���� ��ų�� ������ �������� ����
		if(rand==1) {
			
			int randatk=random.nextInt(4) + 1;
			System.out.println("");
			System.out.println(name+"�� ���ݷ��� "+((atk1/randatk)));
			System.out.println("");
			power=atk1/randatk;
			
			return power;
			
		}
		else if(rand==2) {
			
			int randdef=random.nextInt(3) + 1;
			System.out.println("");
			System.out.println(name+"�� ������� "+((def1/randdef)));
			System.out.println("");
			power=def1/randdef;
			return power;
			
			
		}
//////////////////////////���丮����1���� ���� ���� ���//////////////
		
		
		
//////////////////////////��ų����//////////////		
		
		else if(rand==3) {
		
			if(i==storyLv) {
					int rand1=random.nextInt(3) + 1;
					power=(atk1*2)/rand1;
					System.out.println("");
					System.out.println("õ���� ��!!!"+power);
					System.out.println("");
					return power;
			}
			else {
				continue Loop1;
			}
		}//���̹� ��ų
		
//////////////////////////��ų����//////////////		
		return power;
	}
	}
}
