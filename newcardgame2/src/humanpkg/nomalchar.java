package humanpkg;

public class nomalchar {
	public int health;
	public int money;
	public String name;
	public int Life;

		public void nomalset(String name,int money,int health)
		{
			this.name=name;
			this.money=money;
			this.health=health;
			
		}


	

		public void rivalset(int Lv) {//���̹��� ��ȭ�ڵ�

			if(Lv==0)
			{
				
					health=30;
					money=100;
					name="�䰡����";
					
					
			}//1-1�� ��ȭ



			else if(Lv==1){
			
				health=50;
				money=200;
				name="����� ";
				
			
			}//1-2�� ��ȭ

			else if(Lv==2){
			health=70;
				money=300;
				name="����ũ ";
		
			}

			else if(Lv==3){
				health=90;
				money=400;
				name="���� ��ũ";
		
			}
		
			else if(Lv==4)
			{
				health=150;
				money=500;
				name="����";
		
			}
		}	//���̹� ���� ��





}
