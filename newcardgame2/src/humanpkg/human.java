package humanpkg;



public class human extends nomalchar{
public int storyLv;

public int Lvpoint;


	public void set(String name,int storyLv,int money,int health)
		{
			this.name=name;
			this.storyLv=storyLv;
			this.money=money;
			this.health=health;
		}
	
	public void myhealing(int num3,int health1,int money1,int healing)//�����ڵ�
	{
		if(num3==1)
		{
			if(money>=500)
			{
				health=health1+1;
				money=money1-500;
				
			}//1�� ����
			else
			{
				System.out.println("������ ����");
			}
			
		}//1�� ����
		else if(num3==2)
		{
			if(money>=1500)
			{
				health=health1+3;
				money=money1-1500;
				
			}
			else
			{
				System.out.println("������ ����");
			}
		}//2������
		else if(num3==3) {
			System.out.println("������ ���� ���� ���̽��ϴ�.");
			health=health1+healing;
		}
			
		else
		{
			System.out.println("������ ���� �߸�������!");
		}
		
	}
	
}
