/*
�����������Ͷ����װ�ࡣ
Ϊ�˷������������������ֵ�������װ���˶����ڶ����ж��������Ժ���Ϊ���ḻ�˸����ݵĲ�����
���������ö������ͳ�Ϊ�����������Ͷ����װ�ࡣ

�ð�װ������Ҫ�û������ͺ��ַ���֮���ת����

��������---->�ַ���
	1������������ֵ+""
	2����String���еľ�̬����valueOf(����������ֵ);
	3����Integer�ľ�̬����valueOf(����������ֵ);

�ַ���---->��������
	1��ʹ�ð�װ���еľ�̬���� xxx parseXxx ("xxx���͵��ַ���");
		eg: long parseLong("longstring");
			boolean parseBoolean(booleanstring);
			ֻ��Characterû��parse������
	2������ַ�����Integer���ж���ķ�װ��
		��ʹ����һ���Ǿ�̬�ķ�����intValue();
		��һ��Integer����ת�ɻ�����������ֵ��

	�����߱���ͬ�Ľ������֡�

	ʮ����-->�������ơ�
		toBinaryString
		toOctalString
		toHexString

	��������-->ʮ���ơ�
		parseInt("string",radix);
*/
class WrapperDemo 
{
	public static void main(String[] args) 
	{
//		int num;
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.toBinaryString(6)); 

//		������������new ����
//		int num = 4;
//		Integer i = new Integer(5);
//
//		int x = Integer.parseInt("123");
//		System.out.println(Integer.parseInt("123")+1);

//		Integer i = new Integer("123");

//		System.out.println(i.intValue());

//		ʮ����-->�������ơ�

		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));

//		System.out.println(Integer.toString(60,16));
//
////			��������-->ʮ���ơ�
//		System.out.println(Integer.parseInt("110",2));

		Integer a = new Integer("3");
		Integer b = new Integer(3);

		System.out.println(a==b);
//		System.out.println(a.equals(b));
		System.out.println(a.compareTo(b));
	}
}
 