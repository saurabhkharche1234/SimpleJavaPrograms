package Array_Programs;

public class Find_Element_No {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int count = 0, i = 0, n;
		try
		{
			while(a[i]!= 'a')
			{
				count++;
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println("Number of elements in array:"+count);
		}
		n = a.length;
		System.out.println("Number of elements(using inbuilt method named length):"+n);
	}

}
