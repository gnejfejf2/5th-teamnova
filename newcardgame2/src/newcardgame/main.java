package newcardgame;

import java.util.Scanner;

import humanpkg.human;
import humanpkg.nomalchar;
import itempkg.cloth;
import itempkg.fairy;
import itempkg.item;
import monsterpkg.Rivalmonster;
import monsterpkg.boss0;
import monsterpkg.joymonster;
import monsterpkg.kaimonster;
import monsterpkg.monster;
import monsterpkg.storyLvmoster0;
import monsterpkg.storyLvmoster1;
import monsterpkg.storyLvmoster2;
import monsterpkg.storyLvmoster3;
import monsterpkg.storyLvmoster4;
import monsterpkg.yugimonster;
import thread.Autoheal;
import thread.Bossattack;
import thread.Buffer;
import thread.Event;
import thread.EventMatch;
import thread.Music;
import thread.darkdual;
import thread.endingstory;
import thread.newevent;
import thread.open;
import thread.timeattack;
import thread.weather;

public class main {
	@SuppressWarnings({ "resource", "deprecation" })
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/////////////////////////// ��ü ����//////////////
		human myhuman = new human();
		monster mymonster;
		Rivalmonster rivalmonster = new Rivalmonster();
		item myitem = new item();
		cloth myitem1 = new cloth();
		fairy myitem2 = new fairy();
		nomalchar rival = new nomalchar();
		int Musicselect = 0;
		boolean storyloop = true;
		///////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
		System.out.println("			��ŵ�� ���Ͻø� 0���� �����ּ���");
		Music intromusic = new Music("introMusic.mp3", false);
		intromusic.start();
		open open = new open();
		Thread op = new Thread(open);
		op.start();
/////////////////////////////////////////////////// �������� ���̹� �⺻ ����////////////////////
		while (storyloop) {
			int skipnum = sc.nextInt();
			if (skipnum == 0) {
				for (int j = 0; j < 80; j++)
					System.out.println("");
				intromusic.close();
				op.stop();
				storyloop = false;
			} else {
				intromusic.close();
			}
		}
		///////////// �ε��ϴ� �ð� ���� �����/////////
		try {
			op.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//////////////////////////////////////
		intromusic.close();
		Loop2: while (true) {
			System.out.println("					����� �÷��� �� ĳ���͸� ����ֽð�");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.print("			1.����");
			System.out.print("			2.ī�̹�");
			System.out.print("			3.����");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			int num = sc.nextInt();
			rivalmonster.set(1600, 1200, 0, "�ɾ�ٴϴ�����");
			rival.nomalset("����ũ", 0, 0);
			myitem.itemset(0, 0, "�⺻����ũ");// 0�������� ����ũ
			myitem1.itemset(0, 0, "�⺻��");// 1�������� ��
			myitem2.itemset(0, 0, "������ �Ⱥ��Դϴ�.");// 2������������
			myitem2.randomno = 5;
			/////////////////////////////////////////////

			if (num == 1) { // ĳ���� �����ڵ�//�����ý� �⺻����

				mymonster = new yugimonster();// ��������ȭ

				System.out.println("\r\n" + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#;@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*;;@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;;;;@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@;;#;;=@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@;;*=;;$@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@@$;*.!;;@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@@@@@*;;.-!;;$@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@*@@@@@@@@@;;* @#!;;@@@@@@@@@$#!;$@@\r\n"
						+ "@@@@@@@@@@@@@@@*;@@@@@@@$;;; $@$;;@@@@@@@*;;;=!@@@\r\n"
						+ "@@@@@@@@@@@@@@@**;@@@@@@;;!  $#$;;@@@$$;;;;;,;@@@@\r\n"
						+ "@@@@@@@@@@@@@@@;;;;=@@@@;!$=.$$$;;=@=;;;;;:-;$@@@@\r\n"
						+ "@@@@@@@@@@@@@@@*;=;;;@@!;!= #$$$;;;;;;;;$.~;*@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@;:*;;;=;*$# #$$$*;;!;!$$ ~;;@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@;;$$$;;;#$  $$$$=;$=#$- ;;;$@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@;*.$$@;;$#  $$$$=@$$$: :*;;@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@;! ;#$$;$=  $=#@$$$#  !$;;$@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@!;@  @$$$@; $ ~ $$#= ~$#;!@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@*;$  !.#-.$. *:;!  -$$;;@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@;;#$ .~, $  !-,   $$=;;;;!!;;#@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@*;*@=@ ~ ~# - -~.***;;;;;;;;;;*@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@;;$ @=, ~!=       ==:@@=$#=;#@@\r\n"
						+ "@@@@@@@@@@@@@#$!;;;;;=.. #@-   =.;$$$=,, .$#;*@@@@\r\n"
						+ "@@@@@@@@@@@@@!;*#$=$$ ~ ,    .      ...:@#*!@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@;;$$# #       =    @@@#   .*@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@=;#*~ ;$     ;@!=@==;-$#=~-.@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@!;$.;! @   $.* #. . -@;@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@!$*:.#$    :*;. - .!@=!;@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@$-# # ,   ,  :~.  @##;#@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@  ~. ,        ~-@$#*@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@  #  !       ~#$*$@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@@ ;          # #;@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@*.@@@@@@@@ @ @!    -;=;;*@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@#@$;;;$@@@@@@@@=@.@@$    #    .@@@@@@@@@@@@@\r\n"
						+ "@@@@@@$=;;;;@@@@@@@@@=@~@*@@:!-#     ;@@@@@@@@@@@@\r\n"
						+ "@@@@#;!=;#$;!@@@@@@@@#@@@: :~#-#     ;@@@@@@@@@@@@\r\n"
						+ "@@@$;!@:=@=;=@@@@@@@@@!@:  ;@=-#     ;@@@@@@@@@@@@\r\n"
						+ "@@@:!$=@=#=!=#@@@@@@@@@@#! ~@=-# *$~~@@@@@@@@@@@@@\r\n"
						+ "@$*;$,=;#~=!!=@@@@@@@@@@@~.$@#=,;     :@@@@@@@@@@@\r\n"
						+ "@=;@#,:#@ $;;@@@@@@@@@@.  #;   !   .   !@@@@@@@@@@\r\n"
						+ "-;;@@@ *; !;!*@@@@@@@@@.  @;.    :  .   @@@@@@@@@@\r\n"
						+ "@@*;-*~ :,$@=@@@@@@@@@@# *!$     ~!~ ; #@@@@@@@@@@\r\n"
						+ "@@-#*.@;;   ;@@@@@@@@@@. #;#  , ;.$~-: =@@@@@@@@@@\r\n"
						+ "@@@@~#-;    ~@@@@@@@@@@.:*;$    ;     -@@@@@@@@@@@\r\n"
						+ "@@@@@@! !-~  :@@@@@@@@~ #;!# , *--  ;*-@@@@@@@@@@@\r\n"
						+ "@@@@@@@.#.:   -@@@@@@@@.@#@;   . ~ .   !@@@@@@@@@@\r\n"
						+ "@@@@@@@@,      :-@@@@@~$;@#;   :.~!;:  @@@@@@@@@@@");
				System.out.println("			���� ���� �Ǿ����ϴ�.");
				myhuman.set("����", 0, 0, 100); // ���� ����
				mymonster.set(1400, 1200, 0, "�����˻�");// ���� ����
				((yugimonster) mymonster).stanset(100, 100, 100);/// ���� ����

			} else if (num == 2) {// ī�̹ټ��ý� �⺻����
				mymonster = new kaimonster();
				System.out.println("@@@@@@@@**@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@$==@@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@*==@@$=@@@@@@@@;$~#:=@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@==~*@@=*@@@==@@@@@@@@:!!!!!*@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@*;-~$@##@@@!@@@@@@@@!;;!;!;!$@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "~-!,:~#@#@@@#@@@@@@@@:;;;;;:;*@@@@@@@@@@@@@@@@@@@@\r\n"
						+ ";:  --*#=$@@#@@@@@@ :::::;;!;!!!@@@@@@@@@@@@@@@@@@\r\n"
						+ "!-, ;:=#=!==#@#@@@! !!;*;;!!*;=@@@@@@@@@@@@@@@@@@@\r\n"
						+ ",*;,--!###$*=*#$$* ~!!!!;*!!!==$@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@--  -$######*#*;-:$!*!$*$**=*$@@@@@@@@@@@@@@@@@@\r\n"
						+ "@=:, !:~####@###=!  !==;$===#$ #@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@--,   #@@####$$    :=:##;,.*= @@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@,   $@@@#@$#$.,  ~~,,#-  ~, =@@@ -   =@@@@@@@@\r\n"
						+ "@@@@,,..!-@@@@@@@#* ,--- :. -~,:~.. -  .,@@@@@@@@@\r\n"
						+ "@@@@ - ~-,~ -@@@@;.-   ;-~~,:,,~   *; ~--@@@@@@@@@\r\n"
						+ "@@@@ *.,#@,,,@@@@-,-.  :@-.  ,,      -*~-@@@@@@@@@\r\n"
						+ "@@@@ ,;#@@@@@@@@@@.    ;##@# -,     ,==:,@@@@@@@@@\r\n"
						+ "@@@@ -  @@@@@@@@@@=  ,:===#=;.   - ,==**@@@@==@@@@\r\n"
						+ "@@@@@!-:@@@@@@@@@@@  -!===,;~,   ; ~===#@@!===@@@@\r\n"
						+ "@@@@@@@.*@@@@@@@@@@ -,!$==*.~    ..#==##@#==@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@. ,=====!:!    ~#=$#$##@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@#!;$$#== ~,   .#$#$=;$@@@@*===@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@-*$$$==,   ,,;=$@!$*=@@#$!==@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@ #=##==.; ,*~~-~##$=!=:##;@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@ =~####= : ,,,-~,@##$!=#:@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@=!*$!$$##  ,-,.:@@@##$!$=$@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@;@@@=$=$$==$~ .,,:@@@@@@###$==@@@@@@\r\n");
				System.out.println("			ī�ٰ̹� ���� �Ǿ����ϴ�.");
				myhuman.set("ī�̹�", 0, 0, 100);
				mymonster.set(1900, 1000, 0, "���� �ҽ�");
				((kaimonster) mymonster).stanset(100, 100, 100);

			} else if (num == 3) {// ���̼��ý� �⺻����
				mymonster = new joymonster();
				System.out.println("@@@@@@@@@@@@@@@@~-@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@---=@@@@@@@@#@@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@:,,:,----;!@$.@@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@,.,,--,,--::~ @@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@.-@@*-,,,-,-,,,-,,@@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@--,~,,-,,,,,,,,,:-@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@-,,,,--,,,,,,,,,,,@@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@,.,-,,,,,-,,-,,,,;;@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@.,,,,,,,,-,--,,,,--@@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@--,,,,--,,,.-,-~-.~:@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@-~-,-,,,-,,,,--~-.,~@@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@:,,-,-;~,~,--;,-~~:;-;@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@--~~~-;,,~:~~:.::~-*:::@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@~-;**,~:,--:*;=-;-.#;=@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@.;::~!=*!==!#!*:;*.::-@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@;!*:=:-!=;!~=:**--::~-@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@=;!::~-,----,-,:!;!-@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@*!!;,..: .. .;;::::$:@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@@=- .... ,;;:;;~,@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@@#.;, ..*-#!:==!*~@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@$!.;;...$!@#!;;:=@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@*;,~$...==@@$~=~-@@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@@@@@;!~,! ..!@@@@##:;@@~@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@:::@;#!~.,..,~#@@@*@;==@@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@=@:;*$,..~!!~;*==!****$@@@#!@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@~@~!:::.,!,!;;!****;$@@#$@#$$@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@#@;;::: ,-.~~::*!;::@@=!*$@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@;@#;::::....,~::::::@$;!**#@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@*!##::::;;~ .:!::::;:=;=*#@@@@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@*=;~:::-.   -::::*::*==;!*$*!@@@@@@@@\r\n"
						+ "@@@@@@@@@@@@@@$=::~:~.   ,;~~~:=~:::*$#$*=@@@@@@@@\r\n"
						+ "@@@@@@@@@@@:**@=::-:-    ,!:~~:@#=::~;*#@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@=:@@@*:::-*  ~!!:::~:@@@!-:;*@@@@@@@@@@\r\n"
						+ "@@@@@@@@@@@*:!*$;:::-    -:::::$!##@:~~;*#@@@@@@@@\r\n");
				System.out.println("			���̰� ���� �Ǿ����ϴ�.");
				myhuman.set("����", 0, 0, 100);
				mymonster.set(1200, 700, 0, "���̺� �巡��");
				((joymonster) mymonster).stanset(100, 100, 100);

			} // ĳ���� �����ڵ� ������
			else {

				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();

				continue Loop2;
			}
			break;
		} /// ĳ���� ����â ����
		Loop1: while (true) // ���� �����ڵ�
		{
			Buffer buffer = new Buffer();
			Thread buf = new Thread(buffer);
			buf.start();
			try {
				buf.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			/////////////// ü�� 0�����϶� ����////////////
			if (myhuman.health <= 0) {
				myhuman.health = 10;

				if (myhuman.money >= 500) {
					myhuman.money = myhuman.money - 500;
					System.out.println("�������� 500�� �����Ͻ� ��Ȱ���� �ʰ� ������ ����˴ϴ�.");
				} else if (myhuman.money < 500) {
					System.exit(0);
				}

			}

			//////////////////////////////////// ���� ����
			Music introMusic = new Music("TitleMusic.mp3", false);// ������ false���� �־ �ѹ��� ����ϵ���

			if (Musicselect == 0) {

				introMusic.start();
			} // ������ ���۵��� ���� �����ϴ� �ڵ�

			///////////////////////////////////// ������ �ڵ�
			Autoheal heal = new Autoheal(myhuman.health, true);
			Thread healop = new Thread(heal);

			///////////////////////////////////// �̺�Ʈ��ġ �ڵ�
			EventMatch event = new EventMatch(myhuman.money, true);
			Thread op1 = new Thread(event);
			op1.start();
			////////////////////////////////////////////
			System.out.println("			__   __                _____  _          _____  _      _ \r\n"
					+ "			\\ \\ / /               |  __ \\(_)        |  _  || |    | |\r\n"
					+ "    			 \\ V /  _   _  ______ | |  \\/ _  ______ | | | || |__  | |\r\n"
					+ "   	  		  \\ /  | | | ||______|| | __ | ||______|| | | || '_ \\ | |\r\n"
					+ "   			  | |  | |_| |        | |_\\ \\| |        \\ \\_/ /| | | ||_|\r\n"
					+ "   			  \\_/   \\__,_|         \\____/|_|         \\___/ |_| |_|(_)\r\n");

			/////////////////////////////////////////////////////////////
			int allitematk = myitem.atk + myitem1.atk + myitem2.atk;
			int allitemdef = myitem.def + myitem1.def + myitem2.def;
			System.out.print("****************************************************");
			System.out.print("**********���ӽ���**********");
			System.out.print("****************************************************");
			System.out.println();
			System.out.println();
			System.out.println("		ĳ���� : " + myhuman.name + "     ���丮 ���� : " + myhuman.storyLv + "     ü�� : "
					+ myhuman.health + "     �� : " + myhuman.money);
			System.out.println();
			System.out.println("		ü���� 0���Ϸ� ������ �������� 500�� �����ϰ� ü�� 10���� ��Ȱ�մϴ�.");
			System.out.println();
			System.out.println("		(�������� 500�� ���� �Ͻ� ���ӿ��� �й��ϰԵ˴ϴ�.)");
			System.out.println();
			System.out.println("		ī���̸� : " + mymonster.name + "     ������ ���ݷ�  : " + mymonster.atk
					+ "     ������ ����� : " + mymonster.def + "     Lvpoint : " + myhuman.Lvpoint);
			System.out.println();
			System.out.println(
					"		����ũ : " + myitem.name + "     �� : " + myitem1.name + "     ��� ���� : " + myitem2.name);
			System.out.println();
			System.out.println("		�߰� ���ݷ�  : " + allitematk + "     �߰� ����� : " + allitemdef);
			System.out.println();

			System.out.print("*********************************************************");
			System.out.print("������ �ൿ�� �������ּ���");
			System.out.println("********************************************************");

			System.out.print("		0.�ڵ����");
			System.out.print("			1.���丮 ���");
			System.out.print("		2.�Ϲݴ��");
			System.out.print("			3.���� ���");
			System.out.println();
			System.out.println();
			System.out.print("		4.����");
			System.out.print("			5.�Ƿ� ȸ��");
			System.out.print("		6.Ư�� ���");
			System.out.print("		7.���̵�");
			System.out.println();
			System.out.println();
			System.out.print("		8.�뷡 on/off");
			System.out.println();
			System.out.println();
			healop.start();
			int num1 = sc.nextInt();
			if (num1 == 0) {// 8�� �ڵ����� ����������

				for (int i = 0; i < 80; i++)
					System.out.println("");// �ٶ���
				introMusic.close();// ���� ����
				event.isLoop = false;// �̺�Ʈ���� ����

				int power = 0;// �� ������
				boolean doubleloop = true;
				myhuman.Life = (4000 * mymonster.Lv) + 4000;// �������� ���� ���Ŀ� ���Ҽ�������
				rival.Life = (4000 * mymonster.Lv) + 4000;// ���̹� ������ ����
				rival.rivalset(mymonster.Lv);// ���̹� ����
				System.out.println(rival.name + "���� ����� ���۵˴ϴ�.");
				System.out.println("�ڵ������� ����˴ϴ�.");//

				while (true) {
					if (myhuman.name == "����") {

						power = ((yugimonster) mymonster).randpower(mymonster.atk, mymonster.def, myitem2.randomno,
								allitematk, allitemdef);
					} else if (myhuman.name == "ī�̹�") {
						power = ((kaimonster) mymonster).randpower(mymonster.atk, mymonster.def, myitem2.randomno,
								allitematk, allitemdef);
					} else if (myhuman.name == "����") {
						power = ((joymonster) mymonster).randpower(mymonster.atk, mymonster.def, myitem2.randomno,
								allitematk, allitemdef);
					}

					int rivalatk = rivalmonster.randatk(rivalmonster.atk, rivalmonster.def, myitem2.randomno);
					// ���̹� ���ݷ��� �̾Ƴ��� �ڵ�
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					/////////////////////////////// ���ݷ� �̾Ƴ��� ���ʼ��� ��////////////////////////////////
					Event ev = new Event(power, doubleloop, rival.Life);
					Thread event1 = new Thread(ev);
					newevent ev2 = new newevent(rivalatk, ev.isloop, myhuman.Life);
					Thread event2 = new Thread(ev2);
					event1.start();
					event2.start();

					try {
						event1.join();
						event2.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					rival.Life = ev.rvLife;
					myhuman.Life = ev2.myLife;

					if (doubleloop == true) {
						doubleloop = false;
					} else if (doubleloop == false) {
						doubleloop = true;
					}

					if (myhuman.Life < 0 && rival.Life < 0) {
						System.out.println("���º��Դϴ�.");
						System.out.println("���� ȭ������ ���ư��ϴ�.");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;

					}

					else if (myhuman.Life < 0) {

						System.out.println("�й��Ͽ����ϴ�.");
						System.out.println("����ȹ�濡 �����Ͽ����ϴ�.");
						System.out.println("�й� �г�Ƽ�� ���� ü���� �����մϴ�.");
						myhuman.health = myhuman.health - 3;
						event1.interrupt();
						event2.interrupt();
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;

					} else if (rival.Life < 0) {
						System.out.println("�¸��Ͽ����ϴ�.");
						System.out.println("����ȹ�濡 �����Ͽ����ϴ�.");
						System.out.println("�������� �ҷ��� ���� ȹ�� �Ͽ����ϴ�");
						System.out.println("�й� �г�Ƽ�� ���� ü���� �����մϴ�.");
						myhuman.money = myhuman.money + rival.money;
						myhuman.health = myhuman.health - 1;
						event1.interrupt();
						event2.interrupt();
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;

					}

				}

			} else if (num1 == 1) {
				event.isLoop = false;
				introMusic.close();
				Music storyMusic = new Music("storymodeLv4.mp3", false);
				storyMusic.start();
				int storypower = 0;
				int power = 0;
				int storypoint = 0;
				int temp = mymonster.sppoint;// ������ ��ų����Ʈ�� �ӽ÷� ���� ���Ŀ� �����ֱ�����
				mymonster.sppoint = mymonster.sppoint + myitem1.skipppointup;// ĳ������ ��ų����Ʈ�� �����۽�ų����Ʈ����
				while (true) {
					for (int i = 0; i < myhuman.storyLv + 1; i++) {
						if (myhuman.storyLv == 0) {
							storyLvmoster0 storymonster = new storyLvmoster0();
							storymonster.storyset(i, mymonster.atk);

							if (myhuman.name == "����") {

								power = ((yugimonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
										myitem2.randomno, allitematk, allitemdef);
							} else if (myhuman.name == "ī�̹�") {
								power = ((kaimonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
										myitem2.randomno, allitematk, allitemdef);
							} else if (myhuman.name == "����") {
								power = ((joymonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
										myitem2.randomno, allitematk, allitemdef);
							}
							if (power > 0) {
								System.out.println("���� �� ���ʹ� " + mymonster.skillname + " �������� " + power);

							} else if (power == 0) {
								System.out.println("�߸��� �������� ���ݱ�ȸ�� �Ҿ���Ƚ��ϴ�.");
							}
							storypower = storymonster.storyatk(storymonster.atk, storymonster.def, i, myhuman.storyLv);

							if (power >= storypower) {
								System.out.println("�¸��Ͽ����ϴ�!");

								storypoint = storypoint + 1;
								try {

									Thread.sleep(1000);

								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								continue;

							} else {
								System.out.println("�й��Ͽ����ϴ٤̤�");

								myhuman.health = myhuman.health - 1;

								break;

							}

						}
						////////////////////////////// ���丮 0�ܰ� ����////////////////////////////

						else if (myhuman.storyLv == 1) {
							storyLvmoster1 storymonster = new storyLvmoster1();
							storymonster.storyset(i, mymonster.atk);

							if (myhuman.name == "����") {

								power = ((yugimonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
										myitem2.randomno, allitematk, allitemdef);
							} else if (myhuman.name == "ī�̹�") {
								power = ((kaimonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
										myitem2.randomno, allitematk, allitemdef);
							} else if (myhuman.name == "����") {
								power = ((joymonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
										myitem2.randomno, allitematk, allitemdef);
							}
							if (power > 0) {
								System.out.println("���� �� ���ʹ� " + mymonster.skillname + " �������� " + power);
							} else if (power == 0) {
								System.out.println("�߸��� �������� ���ݱ�ȸ�� �Ҿ���Ƚ��ϴ�.");
							}
							storypower = storymonster.storyatk(storymonster.atk, storymonster.def, i, myhuman.storyLv);

							if (power >= storypower) {
								System.out.println("�¸��Ͽ����ϴ�!");

								storypoint = storypoint + 1;
								continue;

							} else {
								System.out.println("�й��Ͽ����ϴ٤̤�");

								myhuman.health = myhuman.health - 2;

								break;

							}

						}
//////////////////////////////���丮 1�ܰ� ����////////////////////////////

						else if (myhuman.storyLv == 2) {
							storyLvmoster2 storymonster = new storyLvmoster2();
							storymonster.storyset(i, mymonster.atk);

							if (myhuman.name == "����") {

								power = ((yugimonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
										myitem2.randomno, allitematk, allitemdef);
							} else if (myhuman.name == "ī�̹�") {
								power = ((kaimonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
										myitem2.randomno, allitematk, allitemdef);
							} else if (myhuman.name == "����") {
								power = ((joymonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
										myitem2.randomno, allitematk, allitemdef);
							}
							if (power > 0) {
								System.out.println("���� �� ���ʹ� " + mymonster.skillname + " �������� " + power);

							} else if (power == 0) {
								System.out.println("�߸��� �������� ���ݱ�ȸ�� �Ҿ���Ƚ��ϴ�.");
							}
							storypower = storymonster.storyatk(storymonster.atk, storymonster.def, i, myhuman.storyLv);

							if (power >= storypower) {

								System.out.println("�¸��Ͽ����ϴ�!");
								storypoint = storypoint + 1;
								continue;

							} else if (power < storypower) {

								System.out.println("�й��Ͽ����ϴ٤̤�");
								myhuman.health = myhuman.health - 3;
								break;

							}

						}
//////////////////////////////���丮 2�ܰ� ����////////////////////////////

						else if (myhuman.storyLv == 3) {
							storyLvmoster3 storymonster = new storyLvmoster3();
							storymonster.storyset(i, mymonster.atk);

							if (myhuman.name == "����") {
								power = ((yugimonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
										myitem2.randomno, allitematk, allitemdef);
							} else if (myhuman.name == "ī�̹�") {
								power = ((kaimonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
										myitem2.randomno, allitematk, allitemdef);
							} else if (myhuman.name == "����") {
								power = ((joymonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
										myitem2.randomno, allitematk, allitemdef);
							}
							if (power > 0) {
								System.out.println("���� �� ���ʹ� " + mymonster.skillname + " �������� " + power);
							} else if (power == 0) {
								System.out.println("�߸��� �������� ���ݱ�ȸ�� �Ҿ���Ƚ��ϴ�.");
							}
							storypower = storymonster.storyatk(storymonster.atk, storymonster.def, i, myhuman.storyLv);

							if (power >= storypower) {

								System.out.println("�¸��Ͽ����ϴ�!");
								storypoint = storypoint + 1;
								continue;

							} else {

								System.out.println("�й��Ͽ����ϴ٤̤�");
								myhuman.health = myhuman.health - 2;
								break;

							}
						}
//////////////////////////////���丮 3�ܰ� ����////////////////////////////

						else if (myhuman.storyLv == 4) {
							storyLvmoster4 storymonster = new storyLvmoster4();
							storymonster.storyset(i, mymonster.atk);

							if (myhuman.name == "����") {

								power = ((yugimonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
										myitem2.randomno, allitematk, allitemdef);
							} else if (myhuman.name == "ī�̹�") {
								power = ((kaimonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
										myitem2.randomno, allitematk, allitemdef);
							} else if (myhuman.name == "����") {
								power = ((joymonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
										myitem2.randomno, allitematk, allitemdef);
							}
							if (power > 0) {
								System.out.println("���� �� ���ʹ� " + mymonster.skillname + " �������� " + power);
							} else if (power == 0) {
								System.out.println("�߸��� �������� ���ݱ�ȸ�� �Ҿ���Ƚ��ϴ�.");
							}
							storypower = storymonster.storyatk(storymonster.atk, storymonster.def, i, myhuman.storyLv);

							if (power >= storypower) {

								System.out.println("�¸��Ͽ����ϴ�!");
								storypoint = storypoint + 1;
								continue;

							} else {

								System.out.println("�й��Ͽ����ϴ٤̤�");
								myhuman.health = myhuman.health - 2;

								break;

							}

						}

					}

					if (storypoint == myhuman.storyLv + 1) {
						storyMusic.close();
						System.out.println("���ϵ帳�ϴ� �¸��ϼ̽��ϴ�!");
						myhuman.storyLv = myhuman.storyLv + 1;
						myhuman.health = myhuman.health - 1;
						try {

							Thread.sleep(1000);

						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						if (myhuman.storyLv == 5) {

							endingstory end = new endingstory();
							Thread en = new Thread(end);
							en.start();
							try {
								en.join();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.exit(0);
						}
						if (mymonster.Lv == 4) {
							mymonster.sppoint = temp;// ��ų����Ʈ �����ֱ�
						}

						continue Loop1;
					} else if (storypoint < myhuman.storyLv + 1) {
						storyMusic.close();
						System.out.println("���丮��� ������ �����ϼ̽��ϴ�.!");
						myhuman.health = myhuman.health - 3;
						try {

							Thread.sleep(1000);

						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						if (mymonster.Lv == 4) {
							mymonster.sppoint = temp;// ��ų����Ʈ �����ֱ�
						}
						continue Loop1;
					}
					storyMusic.close();
				}

			} // ���丮��� �Ϸ�//////////////////////////////////////

			//////////////////////// ���̹� ��� ����
			else if (num1 == 2) {
				for (int i = 0; i < 80; i++)
					System.out.println("");
				introMusic.close();// ���� ����
				event.isLoop = false;// �̺�Ʈ���� ����
				Music rivalMusic = new Music("rivalMusic.mp3", false);
				rivalMusic.start();
				darkdual dark = new darkdual(myhuman.health, true, 1);
				Thread thread = new Thread(dark);

				int healthtemp = myhuman.health;
				int power = 0;// �� ������

				myhuman.Life = 4000;// �������� ���� ���Ŀ� ���Ҽ�������
				rival.Life = (4000 * mymonster.Lv) + 3000;// ���̹� ������ ����
				rival.rivalset(mymonster.Lv);// ���̹� ����
				System.out.println(rival.name + "���� ����� ���۵˴ϴ�.");
				System.out.println("");
				System.out.println("�� ������ : 4000 " + rival.name + " ������ : " + rival.Life);
				System.out.println("");
				int temp = mymonster.sppoint;// ������ ��ų����Ʈ�� �ӽ÷� ���� ���Ŀ� �����ֱ�����
				mymonster.sppoint = mymonster.sppoint + myitem1.skipppointup;// ĳ������ ��ų����Ʈ�� �����۽�ų����Ʈ����

				System.out.println("1.�Ϲݵ��  2. ����� ���");
				System.out.println("");
				System.out.println("����� ����̶�?");
				System.out.println("");
				System.out.println("����� ������� �����ð����� ü���� �پ��Ե˴ϴ�(ü���� �������� �ٸ��ϴ�.)");
				System.out.println("");
				System.out.println("ü���� 0�� �Ǹ� ���� �������� ������� �й��ϰԵ˴ϴ�.");
				System.out.println("");
				System.out.println("����� ����� ���¿��� �¸��ϰ� �Ǹ� ������ 5�谡 �˴ϴ�.");
				System.out.println("");

				int num2 = sc.nextInt();
				{
					if (num2 == 2) {
						dark.darkdualpoint = 5;
						System.out.println("��� ������ 5�谡 �˴ϴ�.");
						thread.start();

					}
				}

				while (true) {

					if (myhuman.name == "����") {

						power = ((yugimonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
								myitem2.randomno, allitematk, allitemdef);
					} else if (myhuman.name == "ī�̹�") {
						power = ((kaimonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
								myitem2.randomno, allitematk, allitemdef);
					} else if (myhuman.name == "����") {
						power = ((joymonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
								myitem2.randomno, allitematk, allitemdef);
					}

					int rivalatk = rivalmonster.rivalatk(rivalmonster.atk, rivalmonster.def, myitem2.randomno);
					// ���̹� ���ݷ��� �̾Ƴ��� �ڵ�

					myhuman.health = dark.total;

					if (myhuman.health <= 0) {
						dark.close();
						rivalMusic.close();
						System.out.println(dark.isLoop);

						myhuman.health = (healthtemp / 2);
						System.out.println("����� �������� �й��Ͽ����ϴ� ü�� " + myhuman.health + "���� ��Ȱ�մϴ�.");
						try {

							Thread.sleep(1000);

						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						continue Loop1;
					} else {
						if (power > 0) {
							System.out.println("");
							System.out.println("");
							System.out.println("���� �� ���ʹ� " + mymonster.skillname + " �������� " + power);
							System.out.println("");
							System.out.println("���̹����ʹ�  " + rivalmonster.skillname + " ��������" + rivalatk);
							System.out.println("");
						} else if (power == 0) {
							System.out.println("");
							System.out.println("");
							System.out.println("�߸��� �������� ���ݱ�ȸ�� �Ҿ���Ƚ��ϴ�.");
							System.out.println("");
							System.out.println("���̹����ʹ�  " + rivalmonster.skillname + " ��������" + rivalatk);
							System.out.println("");
						}

						if (rivalatk <= power) {
							rival.Life = rival.Life - (power - rivalatk);
							System.out.println("");
							System.out.println("");
							System.out.println("���� ���� ������ ����Ʈ��" + myhuman.Life);
							System.out.println("");
							System.out.println("���̹��� ���� ������ ����Ʈ��" + rival.Life);
							System.out.println("");
						} // �Ŀ��� ���ϰ� ������ ����

						else {
							myhuman.Life = myhuman.Life - (rivalatk - power);
							System.out.println("");
							System.out.println("");
							System.out.println("���� ���� ������ ����Ʈ��" + myhuman.Life);
							System.out.println("");
							System.out.println("���̹��� ���� ������ ����Ʈ��" + rival.Life);
							System.out.println("");
						} // �Ŀ��� ���ϰ� ������ ����

						if (rival.Life <= 0) {
							dark.close();// �����带 �����ֱ����� �ʿ�
							rivalMusic.close();// ������� ���߱�
							System.out.println("");
							System.out.println("");
							System.out.println("");
							System.out.println("���ϵ帳�ϴ� �¸��ϼ̽��ϴ�!");
							myhuman.money = myhuman.money + (rival.money * dark.darkdualpoint);// ���̹��� ���� ������

							myhuman.health = myhuman.health - 1;// �� ĳ������ ü���� ����
							try {

								Thread.sleep(1000);

							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							if (mymonster.Lv == 4) {
								mymonster.sppoint = temp;
							} // ��ų����Ʈ�� ����Ѹ�ŭ �ٽ� ������
							break;
						} else if (myhuman.Life <= 0) {
							dark.close();// ����� ��� ���߱�
							rivalMusic.close();// ����������߱�
							try {

								Thread.sleep(1000);

							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("");
							System.out.println("");
							System.out.println("");
							System.out.println("�й� �Ͽ����ϴ�!");
							myhuman.health = dark.total;
							myhuman.health = myhuman.health - 3;// ������ ü�� ����

							if (mymonster.Lv == 4) {
								mymonster.sppoint = temp;
							} // ��ų����Ʈ�� ����Ѹ�ŭ �ٽ� ������
							break;

						}

					}

				}

			} // �Ϲݴ��

//////////////////////////////�Ϲݴ�� ������/////////////////////	

			else if (num1 == 3) {
				Music bossmusic = new Music("bossMusic.mp3", false);
				Thread bossop = new Thread(bossmusic);
				bossop.start();
				introMusic.close();
				int power = 0;
				myhuman.Life = 4000;

				event.isLoop = false;
				////////////////////////////////

				for (int i = 0; i < 80; i++)
					System.out.println("");
				boss0 boss = new boss0();

				int HP1 = (mymonster.Lv * 3000) + 5000;// �������� ü�� ���� ����ǥ
				boss.set(2000 * mymonster.Lv, 1000 * mymonster.Lv, mymonster.Lv, "�����ǿ� ��Ŀ");
				int temp = mymonster.sppoint;// ������ ��ų����Ʈ�� �ӽ÷� ���� ���Ŀ� �����ֱ�����
				mymonster.sppoint = mymonster.sppoint + myitem1.skipppointup;// ĳ������ ��ų����Ʈ�� �����۽�ų����Ʈ����
				System.out.println("��������� �����մϴ�.");
				System.out.println("");
				System.out.println("");
				System.out.println("���� ������:4000");
				System.out.println("");
				System.out.println("");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				///////////////////////// ��������
				Bossattack bossattack = new Bossattack(myhuman.Life, mymonster.Lv, true, 1, 0);
				Thread op4 = new Thread(bossattack);

				////////////////////////////////////////
				System.out.println("1. �븻��� 2. �ϵ���");
				System.out.println("");
				System.out.println("�ϵ����?");
				System.out.println("");
				System.out.println("�����ð����� ������ �ڽ��� ���͸� �����մϴ�.");
				System.out.println("");
				System.out.println("�������� 0�� �Ǹ� �й��ϰ� �˴ϴ�.");
				System.out.println("");
				System.out.println("�ϵ��忡�� �¸��ϰ� �Ǹ� �븻��庸�� ������ 3�谡 �˴ϴ�.");
				System.out.println("");
				int num2 = sc.nextInt();
				{
					if (num2 == 2) {
						bossattack.point = 3;
						System.out.println("��� ������ 3�谡 �˴ϴ�.");
						op4.start();

					}
				}
				////////////////////////// �������� ������
				for (int i = 0; i < 5; i++) {// ���������� ������ �� 5ȸ
					System.out.println("");
					System.out.println("");
					System.out.println(mymonster.Lv + "�� ������ ������ ���۵˴ϴ�(����ü�� : " + HP1 + ")");
					System.out.println("");
					System.out.println("");
					weather wea = new weather();
					Thread op2 = new Thread(wea);// ���� ������ ����
					op2.start();
					//////////////////////// ����������
					timeattack time = new timeattack();
					Thread op3 = new Thread(time);// �ð���� ������ ����
					op3.start();
					//////////////////////// �ð����� ������

					if (myhuman.name == "����") {
						power = ((yugimonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
								myitem2.randomno, allitematk, allitemdef);
					} else if (myhuman.name == "ī�̹�") {
						power = ((kaimonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
								myitem2.randomno, allitematk, allitemdef);
					} else if (myhuman.name == "����") {
						power = ((joymonster) mymonster).power(mymonster.atk, mymonster.def, mymonster.sppoint,
								myitem2.randomno, allitematk, allitemdef);
					}
					myhuman.Life = bossattack.life;
					if (myhuman.Life <= 0) {
						time.isloop = false;
						wea.isLoop = false;
						bossattack.isLoop = false;
						break;
					}
					HP1 = boss.attack(power, HP1, boss.atk, boss.Lv, wea.weatherpoint, time.atkchance);

					time.isloop = false;
					wea.isLoop = false;
					wea.weatherpoint = 1;

					if (HP1 < 0) {
						time.isloop = false;
						wea.weatherpoint = 1;
						break;
					} // ü���� 0���Ϸ� �ȴٸ� ��

				} // ���ݼ����� ��

				if (HP1 <= 0) {
					System.out.println("���ϵ帳�ϴ� �¸��ϼ̽��ϴ�!");
					myhuman.Lvpoint = (myhuman.Lvpoint + 1);
					myhuman.health = myhuman.health - 1;

					try {

						Thread.sleep(1000);

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (mymonster.Lv == 4) {
						mymonster.sppoint = temp;// ��ų����Ʈ �����ֱ�
					}
					bossattack.isLoop = false;// �������÷�������
					bossmusic.close();
				} // �±ް���ġ�� ��� ü���� ����
				else {
					System.out.println("�й��ϼ̽��ϴ�!");
					myhuman.health = myhuman.health - 3 - bossattack.minushealth;
					bossmusic.close();

					bossattack.isLoop = false;
					try {

						Thread.sleep(1000);

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (mymonster.Lv == 4) {
						mymonster.sppoint = temp;
					} // ��ų����Ʈ �����ֱ�
				} // �±ް���ġ�� ��� ü���� ����
			} // ������� ������

			else if (num1 == 4)// ������ �����ڵ�
			{
				event.isLoop = false;
				for (int i = 0; i < 80; i++)
					System.out.println("");
				introMusic.close();
				System.out.println("������ �Ͻðڽ��ϱ�");
				System.out.println("1.������ ����");
				System.out.println("2.�±� �ϱ�(���� �±޽� lvpoint�� ������ 0���� �ʱ�ȭ �˴ϴ�)");
				int num2 = sc.nextInt();// �����ȿ� Ű�Է¹�
				if (num2 == 1) {
					System.out.println("1.����ũ ���� 2.�� �����ϱ� 3.���ɱ����ϱ�");
					System.out.println("���� ���� �� " + myhuman.money);

					int num3 = sc.nextInt();// ��� �������� ���� �ڵ�

					if (num3 == 1) {

						System.out.println("1. ���ø��� ���� ����ũ ����  1000��");
						System.out.println("2. ���� ���ο� ����ũ ����  5000��");
						System.out.println("3. ��������ũ ��� ����ũ ���� 10000��");
						int num4 = sc.nextInt();
						int temp = myitem.myitembuy(myhuman.money, num4);// ����ũ ���Ű���
						{
							if (temp == 5) {
								continue Loop1;
							} else {
								myhuman.money = temp;// �Ž������� temp�� �������� �� ���� ������
							}
						} // ����ũ ������ �Ž����� �����ڵ�
					} // 1�������� ���� ������

					else if (num3 == 2) {
						System.out.println("1. ���ø��� ������ �ʰ���  1000��");
						System.out.println("2. ���� ���ο� �ʰ���  5000��");
						System.out.println("3. ��������ũ ��� �ʰ��� 10000��");
						System.out.println("4. ������ �ʰ��� 30000��");
						int num4 = sc.nextInt();
						int temp = myitem1.clothbuy(myhuman.money, num4);// �ʱ��Ű���
						{
							if (temp == 5) {
								continue Loop1;
							} else {
								myhuman.money = temp;// �Ž������� temp�� �������� �� ���� ������
							}
						}
					} // �ʱ��� ������

					else if (num3 == 3) {
						System.out.println("1. ���ز� ����  1000��");
						System.out.println("2. ������ ��� ī��Ŭ  10000��");
						System.out.println("3. �ϴ�ũ���� 30000��");
						System.out.println("4. ���� 100000��");
						int num4 = sc.nextInt();
						int temp = myitem2.fairybuy(myhuman.money, num4);// ���ɱ��Ű���
						{
							if (temp == 5) {
								continue Loop1;
							} else {
								myhuman.money = temp;// �Ž������� temp�� �������� �� ���� ������
							}
						}
					} // �ʱ��� ������

				} // �����۱��� if�� ������
				if (num2 == 2)// �±�ó�� if�� ���� �ܺ��� ���� ���� ó�� if���� ���� �´� ���� �ۿ�
				{
					if (myhuman.name == "����") {
						rivalmonster.Rivallevelup(myhuman.Lvpoint, mymonster.Lv);
						mymonster.levelup1(myhuman.Lvpoint, mymonster.Lv);
						myhuman.Lvpoint = 0;// �±޽�
					} else if (myhuman.name == "ī�̹�") {
						rivalmonster.Rivallevelup(myhuman.Lvpoint, mymonster.Lv);
						mymonster.levelup2(myhuman.Lvpoint, mymonster.Lv);
						myhuman.Lvpoint = 0;// �±޽�
					} else if (myhuman.name == "����") {
						rivalmonster.Rivallevelup(myhuman.Lvpoint, mymonster.Lv);
						mymonster.levelup3(myhuman.Lvpoint, mymonster.Lv);
						myhuman.Lvpoint = 0;// �±޽�
					} else {
						System.out.println("�߸��� �����Դϴ�.");
					}
				} // �±���������

			} // �����ڵ� ������
			else if (num1 == 5) {
				event.isLoop = false;
				for (int i = 0; i < 80; i++)
					System.out.println("");
				introMusic.close();
				System.out.println("1.�⺻ �޽� 500�� ü�� +1");
				System.out.println("2.��� �޾��� 1500�� ü�� +5");
				System.out.println("3.������ ��");
				int num3 = sc.nextInt();
				myhuman.myhealing(num3, myhuman.health, myhuman.money, heal.healing);// ü��ȸ���ڵ� ������
				System.out.println("������ ���� ���ð� ü���� " + heal.healing + "�� ü���� ȸ���Ͽ����ϴ�..(�ִ� 50)");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (myhuman.health >= 50) {
					heal.isLoop = false;
				}

			} // ü��ȸ�� ��Ʈ

			else if (num1 == 6) {
				event.isLoop = false;
				for (int i = 0; i < 80; i++)
					System.out.println("");
				introMusic.close();
				System.out.println("ī�̹�-�ֽ��� : ��� - �ν��� : ����");
				System.out.println("���� - �ֽ��� : ���� - �ν��� : ���");
				System.out.println("���� - �ֽ��� : ��� - �ν��� : ���");
				System.out.println("1.��� ��� +5 1000��(ī�̹�)");
				System.out.println("2.���� ��� +5 1000��(����)");
				System.out.println("3.��� ��� +5 1000��(����)");
				int num3 = sc.nextInt();
				if (myhuman.money >= 1000) {// ���� �����ݾ��̻����� ���� Ȯ���� ����
					if (myhuman.name == "����") {
						((yugimonster) mymonster).statbuy(num3);
						myhuman.money = myhuman.money - 1000;
						System.out.println("�� ĳ������ ���� " + ((yugimonster) mymonster).brave);
						System.out.println("�� ĳ������ ������ " + ((yugimonster) mymonster).brain);
						System.out.println("�� ĳ������ ����� " + ((yugimonster) mymonster).lucky);
					} // �������� ���� ������
					else if (myhuman.name == "ī�̹�") {
						((kaimonster) mymonster).statbuy(num3);
						myhuman.money = myhuman.money - 1000;
						System.out.println("�� ĳ������ ���� " + ((kaimonster) mymonster).brave);
						System.out.println("�� ĳ������ ������ " + ((kaimonster) mymonster).brain);
						System.out.println("�� ĳ������ ����� " + ((kaimonster) mymonster).lucky);
					} // ī�̹ٿ����� ���� ������
					else if (myhuman.name == "����") {
						((joymonster) mymonster).statbuy(num3);
						myhuman.money = myhuman.money - 1000;
						System.out.println("�� ĳ������ ���� " + ((joymonster) mymonster).brave);
						System.out.println("�� ĳ������ ������ " + ((joymonster) mymonster).brain);
						System.out.println("�� ĳ������ ����� " + ((joymonster) mymonster).lucky);
					} // ���̿����� ���� ������
				} else
					System.out.println("�������°� ���� ����");
			}

			else if (num1 == 7) {
				event.isLoop = false;
				introMusic.close();
				for (int i = 0; i < 80; i++)
					System.out.println("");
				System.out.println("1.���丮 ��� -> �Ϲݸ��Ϳ� ������Ʈ�� ���Ľ� StoryLv��� �ְ��� �޼��� ���� Ŭ����");
				System.out.println(
						"2.���̹� ��� -> ���̹����� ���� ����� �������� ���� 0���� ����� ����� �¸� �¸��� ���� ��Ե� ����� ���� ���������� ü�°��� ������ ������ 2��");
				System.out.println("3.�������̵�  -> 5���� �������� ���������� ü���� 0���� ����ٸ� �¸� �¸��� Lvpoint�� ��Ե� Lvpoint�� �±� ���� ����");

				System.out.println("4.���� -> ����ũ : ���ø��� ���� ���� 500 ���� ���ο� ���� 1000 ��������ũ ��� ���� 1500 (Ư��ȿ�� X)");
				System.out.println(
						"     -> ��             : ���ø��� ���� ���� 300 ���� ���ο� ���� 500 ��������ũ ��� ���� 1000 ������ �� 1500 1500 (Ư��ȿ�� Sppoint+1");
				System.out.println(
						"     -> ����          : ���ز� ���� ���� 500 ������ : 5 ��� ī��Ŭ ���� 100 ������ : 4 �ϴ�ũ���� ���� 300 ������ : 3 ���� ���� 500 ������ : 2");
				System.out.println("4.���� -> �±� : ��������Ʈ 10�� ���̸� ���� �ܰ�� �±��� ���� �±޽� Lvpoint�� ������ 0���� �ʱ�ȭ (����)");
				System.out.println("5.�޽� : �������� �Ҹ��Ͽ� ü���� ȸ��");
				System.out.println("  �޽� : �����ð����� ü���� ȸ���Ȱ��� ü������ ��ȯ ����");
				System.out.println("6.���ݻ��� : �������� ������ ���� �ڽſ��� �´� ������ ���Ž� ���� ��ų������, �⺻ ���� ������ ����");
				System.out.println("���ݷ� ������ : (( ������ ���ݷ� / ������ ���� ������ (ex 5�Ͻ� 1~5))+�������� ���ݷ�)*(ĳ���� �ν���/100)");
				System.out.println("����� ������ : (( ������ ���ݷ� / ������ ���� ������ -1 (ex 5�Ͻ� 1~4))+�������� �����)*(ĳ���� �ν���/100)");
				System.out.println("��ų ���ݷ�      : (( ? )+�������� ���ݷ�)*(ĳ���� �ֽ���/100)");
				System.out.println("����ȭ������ ���ư��Ƿ��� �ƹ� ���ڸ� �Է����ּ���");
				int num2 = sc.nextInt();

			}

			else if (num1 == 8) {
				event.isLoop = false;
				introMusic.close();
				for (int i = 0; i < 80; i++)
					System.out.println("");
				if (Musicselect == 0) {
					Musicselect++;
				} else {
					Musicselect = 0;
				}

			} else if (num1 == 9) {
				event.isLoop = false;
				introMusic.close();
				for (int i = 0; i < 80; i++)
					System.out.println("");
				myhuman.money = myhuman.money + 150000;
				myhuman.Lvpoint = myhuman.Lvpoint + 10;
				myhuman.storyLv = 4;

			} else if (num1 == 10) {
				event.isLoop = false;
				introMusic.close();
				endingstory end = new endingstory();
				Thread en = new Thread(end);
				en.start();
				try {
					en.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			} else if (num1 == event.rand1 && num1 == event.rand) {

				introMusic.close();

				event.isLoop = false;

				System.out.println("			ī�带 �ֿ����ϴ�");
				System.out.println();
				System.out.println("			ī�弥�� ���� �ֿ� ī�带 �Ǹ��ϰ� �ֽ��ϴ�");
				System.out.println();
				System.out.println("			ī�尡���� �� ������ ���ϰ� �ֽ��ϴ�");
				System.out.println();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("			ī�尡���� " + event.eventmoney);
				System.out.println();
				System.out.println("			ī�带 �Ⱦ� ���� �������� �������� ���� ü���� �����մϴ�");
				System.out.println();
				myhuman.money = myhuman.money + event.eventmoney;
				myhuman.health = myhuman.health - 3;
				System.out.println("			�̺�Ʈ�� ���� �������� �����Ͽ����ϴ� + " + event.eventmoney);
				System.out.println();
				System.out.println("			�̺�Ʈ�� ���� ü���� �����Ͽ����ϴ� - 3 ");
				System.out.println();
				try {

					Thread.sleep(3000);

				}

				catch (InterruptedException e) {
					e.printStackTrace();

				}

			}

			else {

				event.isLoop = false;

				introMusic.close();

				System.out.println("�߸� ���� �ϼ̽��ϴ�");

				continue Loop1;

			}

		} // ���� ��������

	}// �ۺ� ����ƽ ���̵� ����

}// ����Ŭ���� ����