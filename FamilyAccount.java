class FamilyAccount
{
	public static void main(String[] args) 
	{
		Boolean isFlag = true;
		while (isFlag)
		{
			System.out.println("\n-----------------��ͥ��֧�������-----------------\n");
            System.out.println("                   1 ��֧��ϸ");
            System.out.println("                   2 �Ǽ�����");
            System.out.println("                   3 �Ǽ�֧��");
            System.out.println("                   4 ��    ��\n");
            System.out.print("                   ��ѡ��(1-4)��");

			char key = Utility.readMenuSelection();
			System.out.println(key);
			switch (key)
			{
			case '1':
				System.out.println("��֧��ϸ");
				break;
			case '2':
				System.out.println("�Ǽ�����");
				break;
			case '3':
				System.out.println("�Ǽ�֧��");
				break;
			case '4':
				System.out.println("��  ��");
				break;
			}
		}
	}
}
