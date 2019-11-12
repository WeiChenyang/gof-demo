package singleton;

import java.util.Scanner;

import singleton.hungryModel.HungrySingleton;
import singleton.lazyModel.LazySingleton;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Singleton ���������֣�");
		int num = input.nextInt();
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>����ʽ<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		HungrySingleton hungrySingletonOne = HungrySingleton.getInstance();
		hungrySingletonOne.setHsId(num);
		System.out.println("����ʽ��hungrySingletonOne.getHsId()>>>>>>>" + hungrySingletonOne.getHsId());
		HungrySingleton hungrySingletonTwo = HungrySingleton.getInstance();
		System.out.println("����ʽ��hungrySingletonTwo.getHsId()>>>>>>>" + hungrySingletonTwo.getHsId());
		judge(hungrySingletonOne,hungrySingletonTwo);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>����ʽ<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		LazySingleton lazySingletonOne = LazySingleton.getInstance();
		lazySingletonOne.setLsId(num);
		System.out.println("����ʽ��lazySingletonOne.getHsId()>>>>>>>" + lazySingletonOne.getLsId());
		LazySingleton lazySingletonTwo = LazySingleton.getInstance();
		System.out.println("����ʽ��lazySingletonTwo.getHsId()>>>>>>>" + lazySingletonTwo.getLsId());
		judge(lazySingletonOne,lazySingletonTwo);
	}
	
	/**
	 * @param arg1
	 * @param arg2
	 * �����ж�    �Ƿ�����ͬһ����ַ    ��ַ�ж�
	 */
	public static void judge(Object arg1,Object arg2){
		if (arg1 == arg2) {
			System.out.println(arg1.getClass().getSimpleName() + "  == " + arg2.getClass().getSimpleName());
		} else {
			System.out.println(arg1.getClass().getSimpleName() + "  != " + arg2.getClass().getSimpleName());
		}
	}
}
