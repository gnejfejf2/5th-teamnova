package monsterpkg;

import java.util.Scanner;

import thread.storymodeLv4;

public class storyLvmoster4 extends monster{
	public boolean storyloop = true;
	public int power;
	Scanner sc = new Scanner(System.in);

	public void storyset(int i,int atk1) {

		if(i==0)
		{
			/////////////////////////////////////////////////
			for (int b = 0; b < 80; b++)
				System.out.println("");
			System.out.println("��ŵ�� ���Ͻø� 0���� �����ּ���");
			storymodeLv4 story = new storymodeLv4();
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
			try {////////////////////���� �����尡 �����ٸ� �ٷδ��� �����Ű�� ���Ͽ�
				op.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			////////////////////////////////////////////////
			System.out.println("��Ʈ�� �� ������ �޾Ƶ鿩�༭ ����..");
			System.out.println("");
			System.out.println("�� ��󸮽�Ʈ ���������ؼ� ����ϰھ� �װԳ� �����̵��");
			System.out.println("");
			System.out.println("The Ʈ��Ű");
			System.out.println("");
				this.atk=4000;
				this.def=4000;
				this.name="The Ʈ��Ű";
				System.out.println("		ī�� �̸� :"+name+"			���ݷ�"+atk+"			�����"+def);
				
		
		}//���丮4�� ���� 1�� ��ȭ



		else if(i==1){
			System.out.println("�ƴ�...");
			System.out.println("");
			System.out.println("������ ");
			System.out.println("");
			System.out.println("��Ʈ��");
			System.out.println("");
			System.out.println("������ The Ʈ��Ű�� ������ ���Ͷ�");
			System.out.println("");
			System.out.println("��������ũ�� �Žź�");
			System.out.println("");
			this.atk=4000;
			this.def=4000;
			this.name="��������ũ�� �Žź�";
			System.out.println("		ī�� �̸� :"+name+"			���ݷ�"+atk+"			�����"+def);
		}//���丮4�� ����  2�� ��ȭ

		else if(i==2){
			System.out.println("��Ʈ��");
			System.out.println("");
			System.out.println("���� ������ ���� ����ϰھ�");
			System.out.println("");
			System.out.println("������ �ʰ� ���� �̰�����");
			System.out.println("");
			System.out.println("���� ��ȥ�� ��������  �� ȥ�� ����� ");
			System.out.println("");
			System.out.println("�������� ��ȯ �ű⿡ ");
			System.out.println("");
			System.out.println("������ī�� ���� �������� �� �ſ�����");
			System.out.println("");
			this.atk=2500+atk1;
			this.def=2000+atk1;
			this.name="��������(�̷�����)";
			System.out.println("		ī�� �̸� :"+name+"			���ݷ�"+atk+"			�����"+def);
		}//���丮4�� ����  3�� ��ȭ
		else if(i==3){
			System.out.println("������ ���ʹ� ���� �����д� ���徿");
			System.out.println("");
			System.out.println("���� �������ǰ��� Ư����ȯ");
			System.out.println("");
			System.out.println("����ī�� �������� ũ�ν� �ߵ�");
			System.out.println("");
			System.out.println("�������ǰ� �������ǰ��� �յ������� �Ѵ� ");
			System.out.println("");
			this.atk=5500+(atk1/2);
			this.def=4000+(atk1/2);
			this.name="�������� ũ�ν�";
			System.out.println("		ī�� �̸� :"+name+"			���ݷ�"+atk+"			�����"+def);
		}//���丮4�� ����  4�� ��ȭ
		else if(i==4){
			System.out.println("�̰� ���� �ߵ����ٴ� ��Ʈ�� ����Ѱ�");
			System.out.println("");
			System.out.println("������ �� ����������");
			System.out.println("");
			System.out.println("����ī�� �������� �һ� �ߵ�");
			System.out.println("");
			System.out.println("���ø����� õ������ Ư����ȯ");
			System.out.println("");
			this.atk=4000+atk1;
			this.def=4000+atk1;
			this.name="���ø����� õ����";
			System.out.println("		ī�� �̸� :"+name+"			���ݷ�"+atk+"			�����"+def);
		}//���丮4�� ����  5�� ��ȭ
		
		
	}	
	///////////////////////////////4�����丮 ����//////////////////////////////
	
	public int storyatk(int atk1,int def1,int i,int storyLv)
	{
		
		Loop1:while(true) {
			int rand=((random.nextInt(5)+1)%3)+1;//�������� ���� ����� ���� ���� ��ų�� ������ �������� ����
		if(rand==1) {
			
			int randatk=random.nextInt(4) + 1;
			System.out.println(name+"�� ���ݷ��� "+((atk1/randatk)));
			power=atk1/randatk;
			
			return power;
			
		}
		else if(rand==2) {
			
			int randdef=random.nextInt(3) + 1;
			System.out.println(name+"�� ������� "+((def1/randdef)));
			power=def1/randdef;
			return power;
			
			
		}
//////////////////////////���丮����4���� ���� ���� ���//////////////
		
		
		
//////////////////////////��ų����//////////////		
		
		else if(rand==3) {
		
			if(i==storyLv) {
					int rand1=random.nextInt(2) + 1;
					power=(atk1*3)/rand1;
					System.out.println("�ҷ�ź!"+power);
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
	//////////////////////�����ڵ� ������
}
