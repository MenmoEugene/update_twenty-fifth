class WrapperDemo2 
{
	public static void main(String[] args) 
	{
		int num =4;//i = new Integer(4);�Զ�װ�䣬����д
		Integer i =4;//i = new Integer(i.intValue() + 6);//i.intValue() �Զ����䡣

		Integer a = new Integer(128);//false
		Integer b = new Integer(128);//true

		System.out.println(a==b);//JDK1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ���ô�����ݻᱻ���������¿��ٿռ䡣
		System.out.println(a.equals(b));

//		show(66);

		Integer x = 129;
		Integer y = 129;
		System.out.println(x==y);//false
		System.out.println(x.equals(y));//true
	}

	public static void show(Object a)//Object a = new Integer(66);
	{
		System.out.println("a="+a);
	}
}
