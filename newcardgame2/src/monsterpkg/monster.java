package monsterpkg;

import java.util.Random;



public class monster{

	public String name;
	public int def;
	public int atk;
	public int Lv;
	public int sppoint;
	public String skillname;
public void set(int atk,int def,int lv,String name)//�⺻����
	{
		this.atk=atk;
		this.def=def;
		this.Lv=lv;
		this.name=name;
	}

Random random = new Random();






public int storyatk(int atk)//���� ����,���� ����ڵ� �����ѹ� �� �޾Ƽ� ���
{
	int randatk=random.nextInt(5) + 1;
	System.out.println("�� ������ ���ݷ��� "+atk/randatk);
	return (atk/randatk);
}//�⺻����

public int storydef(int def)
{
	int randdef=random.nextInt(4) + 1;
	System.out.println("�� ������ ������� "+def/randdef);
	return (def/randdef);
}//�⺻���




public int monsteratk(int atk,int randomno,int allitematk)//���� ����,���� ����ڵ� �����ѹ� �� �޾Ƽ� ���
{
	int randatk=random.nextInt(randomno) + 1;
	System.out.println("�� ������ ���ݷ��� "+((atk/randatk)+allitematk));
	return (atk/randatk);
}//�⺻����

public int monsterdef(int def,int randomno,int allitemdef)
{
	int randdef=random.nextInt(randomno-1) + 1;
	System.out.println("�� ������ ������� "+((def/randdef)+allitemdef));
	return (def/randdef);
}//�⺻���
//////////////////���� ����////////////////////////////
///////////////////////////////����//////////////////////////////
public void levelup1(int lvpoint,int Lv) {

	if(Lv==0)
	{
		if(lvpoint>=10)
		{
			this.atk=1900;
			this.def=1200;
			this.name="�������� �극��Ŀ";
			this.Lv=1;
			System.out.println("���Ͷ� �������� �߽���!!");
		}
	else
		{
			System.out.println("����ġ�� �����մϴ� ���ư��ּ���");
		}
	}//1-1�� ��ȭ



	else if(Lv==1){
	if(lvpoint>=10)
	{
		this.atk=2000;
		this.def=1200;
		this.name="�� �����ǰ�";
		this.Lv=2;
		System.out.println("���Ͷ� �������� ����!");
	}
	else
	{
		System.out.println("����ġ�� �����մϴ� ���ư��ּ���");
	}
	}//1-2�� ��ȭ

	else if(Lv==2){
	if(lvpoint>=10)
	{
		this.atk=2500;
		this.def=2000;
		this.name="��������";
		this.Lv=3;
		System.out.println("�ְ��� ������ �� ������!");
	}
	else
	{
		System.out.println("����ġ�� �����մϴ� ���ư��ּ���");
	}
	}//1-3�� ��ȭ

	else if(Lv==3){
	if(lvpoint>=10)
	{
		this.atk=9000;
		this.def=9000;
		this.name="���ø����� õ����(�� 9��)";
		this.sppoint=1;
		this.Lv=4;
		System.out.println("�ҷ�ź!");
	}
	else
	{
		System.out.println("����ġ�� �����մϴ� ���ư��ּ���");
	}
}//1-4�� ��ȭ
	else
	{
		System.out.println("�ְ�ܰ��Դϴ�.");
	}
}	//���� ������ ��
///////////////////////////////����//////////////////////////////

//////////////////////////////ī�̹�//////////////////////////////
public void levelup2(int lvpoint,int Lv) {
	if(Lv==0) {

	if(lvpoint>=10)
	{
		this.atk=2800;
		this.def=1000;
		this.name="xyz�ɳ�";
		this.Lv=1;
		System.out.println("xyz�� ���� ��ü ���Ͷ� xyz�ɳ�");
	}
	else
	{
		System.out.println("����ġ�� �����մϴ� ���ư��ּ���");
	}
}//2-1�� ��ȭ

	if(Lv==1) {
	if(lvpoint>=10)
	{
		this.atk=3000;
		this.def=2500;
		this.name="Ǫ������ ���";
		this.Lv=2;
		System.out.println("�� �ְ��� ī�� Ǫ������ ���!");
	}
	else
	{
		System.out.println("����ġ�� �����մϴ� ���ư��ּ���");
	}
	}//2-2����ȭ ������

	if(Lv==2) { 
	if(lvpoint>=10)
	{
		this.atk=4500;
		this.def=4500;
		this.name="���Ͷ� �ñ��� Ǫ������ ���";
		this.Lv=3;
		System.out.println("���Ͷ� �ñ��� Ǫ������ ���!!!");
	}
	else
	{
		System.out.println("����ġ�� �����մϴ� ���ư��ּ���");
	}
}//2-3�� ��ȭ
	if(Lv==3) {
		if(lvpoint>=10)
		{
			this.atk=5000;
			this.def=5000;
			this.name="��������ũ�� �Žź�(���ڵ� ũ����)";
			this.sppoint=1;
			this.Lv=4;
			System.out.println("���� �ָ��� �޾ƶ�");
		}
		else
		{
		System.out.println("����ġ�� �����մϴ� ���ư��ּ���");
		}
	}//2-4�� ��ȭ
	else
	{
		System.out.println("�ְ�ܰ��Դϴ�.");
	}
}//ī�̹� ��
//////////////////////////////ī�̹�//////////////////////////////


///////////////////////////////����//////////////////////////////
public void levelup3(int lvpoint,int Lv) {
	
	if(Lv==0) {
	if(lvpoint>=10)
	{
		this.atk=1800;
		this.def=1000;
		this.name="ö�Ǳ�� ���������";
		this.Lv=1;
		System.out.println("���� ��ö�� ��� ���������!");
	}
	else
	{
		System.out.println("����ġ�� �����մϴ� ���ư��ּ���");
	}
}//3-1�� ��ȭ

	if(Lv==1){
	if(lvpoint>=10)
	{
		this.atk=2400;
		this.def=2000;
		this.name="õ���";
		this.Lv=2;
		System.out.println("���̺� �巡���� õ���� �ð��� ���� ������!");
	}
	else
	{
		System.out.println("����ġ�� �����մϴ� ���ư��ּ���");
	}
}//3-2�� ��ȭ

	if(Lv==2){
	if(lvpoint>=10)
	{
		this.atk=3300;
		this.def=2400;
		this.name="�������� ��Ż �巡��";
		this.Lv=3;
		System.out.println("�������� ��Żȭ�� �Ǿ� �� ��������!");
	}
	else
	{
		System.out.println("����ġ�� �����մϴ� ���ư��ּ���");
	}
}//3-3�� ��ȭ

	if(Lv==3){
	if(lvpoint>=10)
	{
		this.atk=6000;
		this.def=6000;
		this.name="���� �ͽŷ�-�� �Ǵн�";
		this.sppoint=1;
		this.Lv=4;
		System.out.println("���߿����� ���� �����ѽ� ���� �ͽŷ�");
	}
	else
	{
		System.out.println("����ġ�� �����մϴ� ���ư��ּ���");
	}
}//3-4�� ��ȭ
	else
	{
		
	}
}//���� ��

///////////////////////////////����//////////////////////////////

///////////////////////////////���̹�//////////////////////////////
public void Rivallevelup(int lvpoint,int Lv) {

	if(Lv==0)
	{
	
			this.atk=1600;
			this.def=1000;
			this.name="�� ��������";
			
			
	
	}//���̹�1�� ��ȭ



	else if(Lv==1){
	
		this.atk=2000;
		this.def=1200;
		this.sppoint=0;
		this.name="����";
	
	
	}//���̹�2�� ��ȭ

	else if(Lv==2){
	
		this.atk=2800;
		this.def=2500;
		this.sppoint=0;
		this.name="����Ʈ ��ȣ��";
		
	
	}//���̹�3�� ��ȭ

	else if(Lv==3){
	
		this.atk=3200;
		this.def=3800;
		this.sppoint=0;
		this.name="����� ������ ��ũ";
		
	
	}//���̹�4�� ��ȭ
	else if(Lv==4){
		
		this.atk=4000;
		this.def=4000;
		this.name="ȣ����ũƼ";
		this.sppoint=1;
		
	
	}//���̹�5�� ��ȭ
	else
	{
	
	}
}	
///////////////////////////////���̹�//////////////////////////////





}


