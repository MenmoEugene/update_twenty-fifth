/*
��һ���ַ����е���ֵ���д�С���������
"20 78 9 -7 88 36 29"

˼·��
	1������
	2�������ȡ������ַ����е���Щ��Ҫ�������ֵ��
		��������ַ�����ʵ���ǿո�������ֵ���зָ��ġ�
		���Ծ��뵽���ַ���������и�����󴮱�ɶ��С����
	3����ֵ���ձ��С�ַ�������ô���һ��int���أ�
		�ַ���-->�������Ϳ���ʹ�ð�װ�ࡣ
*/
import java.util.Arrays;
public class WrapperTest 
{
	private static final String SPACE_SEPARTOR = " ";

	public static void main(String[] args) 
	{
		String numStr = "20 78 9 -7 88 36 29";

		sop(numStr);
		numStr = sortStringNumber(numStr);
		sop(numStr);

	}
	public static  String sortStringNumber(String numStr)
	{
		//1�����ַ�������ַ������顣
		String[] str_arr = numStr.split(" ");
		//2�����ַ���������int���顣
		int[] num_arr = toIntArray(str_arr);
		//3����int��������.
		mySortArray(num_arr);
		//4����������int�������ַ���
		String temp = arrayToString(num_arr);
		return temp;
	}
	public static String arrayToString(int[] num_arr)
	{
		StringBuilder sb = new StringBuilder();
		for(int x = 0; x<num_arr.length; x++)
		{
			if(x!=num_arr.length-1)
				sb.append(num_arr[x]+" ");
			else
				sb.append(num_arr[x]);
		}
		return sb.toString();
	}

	public static void mySortArray(int[] num_arr)
	{
		Arrays.sort(num_arr);
	}

	public static int[] toIntArray(String[] str_arr)
	{
		int[] arr = new int[str_arr.length];
		for (int i=0; i<arr.length; i++)
		{
			arr[i] =Integer.parseInt(str_arr[i]);
		}
		return arr;
	}
	public static String[] stringToArray(String numStr)
	{
		String[] str_arr = numStr.split(SPACE_SEPARTOR+"+");

		return str_arr;
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
