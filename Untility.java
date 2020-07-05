/* 

这个包是为 家庭记账小工具的项目提供一些工具类方法

*/

import java.util.Scanner;
public class Untility {
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

}
