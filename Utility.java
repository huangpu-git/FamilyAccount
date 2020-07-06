/* 

�������Ϊ ��ͥ����С���ߵ���Ŀ�ṩһЩ�����෽��

*/

import java.util.Scanner;
public class Utility {
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

	/**
	
	���������֧���������롣�÷����Ӽ��̶�ȡһ��������4λ���ȵ���������������Ϊ�����ķ���ֵ��

	*/

	public static int readNumber()
	{
		int n;
		for (; ; )
		{
			String str = readKeyBoard(4);
			try
			{
				n = Integer.parseInt(str);
				break;
			}
			catch (NumberFormatException e)
			{
				System.out.println("���������������������룺");
			}
		}
		return n;
	}

	/**
	���������֧��˵�������롣�÷����Ӽ��̶�ȡһ��������8λ���ȵ��ַ�������������Ϊ�����ķ���ֵ��
	*/

	public static String readString() 
	{
		String str = readKeyBoard(8);
		return str;

	}

	/**
	����ȷ��ѡ������롣�÷����Ӽ��̶�ȡ��Y����N������������Ϊ�����ķ���ֵ��
	*/

	public static char readConfirmSelection() {
		char c;
		for (; ; )
		{
			String str = readKeyBoard(1).toUpperCase();
			c = str.charAt(0);
			if (c == 'Y' || c == 'N')
			{
				break;
			}else{
				System.out.println("�����������������룺");
			}
		}
		return c;
	}

	/**

	���ڶ�ȡ�������������

	*/

	public static String readKeyBoard(int limit){
		String line = "";

		while (scanner.hasNext())
		{
			line = scanner.nextLine();
			if (line.length() < 1 || line.length() > limit) 
			{
				System.out.println("���볤�ȣ�������" + limit + ") �������������룺" );
				continue;
			}
			break;
		}

		return line;
	}
}