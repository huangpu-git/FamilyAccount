/* 

�������Ϊ ��ͥ����С���ߵ���Ŀ�ṩһЩ�����෽��

*/

import java.util.Scanner;
public class Untility {
	private static Scanner scanner = new Scanner(System.in);
	/**
	�û�����˵���ѡ���û������ַ�������������ַ�
	*/
	public static char readMenuSelection(){
		char c;
		for (; ; ){
			String str = readKeyBoard(1);
			c = str.charAt(0);
			if (c != '1' && c != '2' && c != '3' && c != '4')
			{
				System.out.println("ѡ��������������������룺");
			}else break;
		}
		return c;	
	}

}
