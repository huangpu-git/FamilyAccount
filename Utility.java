/* 

这个包是为 家庭记账小工具的项目提供一些工具类方法

*/

import java.util.Scanner;
public class Utility {
	private static Scanner scanner = new Scanner(System.in);

	/**
	用户界面菜单的选择，用户输入字符，返回输入的字符
	*/
	public static char readMenuSelection(){
		char c;
		for (; ; ){
			String str = readKeyBoard(1);
			c = str.charAt(0);
			if (c != '1' && c != '2' && c != '3' && c != '4')
			{
				System.out.println("选择的输入有误，请重新输入：");
			}else break;
		}
		return c;	
		}

	/**
	
	用于收入和支出金额的输入。该方法从键盘读取一个不超过4位长度的整数，并将其作为方法的返回值。

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
				System.out.println("数字输入有误，请重新输入：");
			}
		}
		return n;
	}

	/**
	用于收入和支出说明的输入。该方法从键盘读取一个不超过8位长度的字符串，并将其作为方法的返回值。
	*/

	public static String readString() 
	{
		String str = readKeyBoard(8);
		return str;

	}

	/**
	用于确认选择的输入。该方法从键盘读取‘Y’或’N’，并将其作为方法的返回值。
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
				System.out.println("输入有误，请重新输入：");
			}
		}
		return c;
	}

	/**

	用于读取键盘输入的内容

	*/

	public static String readKeyBoard(int limit){
		String line = "";

		while (scanner.hasNext())
		{
			line = scanner.nextLine();
			if (line.length() < 1 || line.length() > limit) 
			{
				System.out.println("输入长度（不大于" + limit + ") 错误，请重新输入：" );
				continue;
			}
			break;
		}

		return line;
	}
}