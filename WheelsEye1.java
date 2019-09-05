import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WheelsEye1 
{
	public static int getsum(int index,int arr[])
	{
		int sum=0;
		if(index%2==0)
		{
			for(int i=0;i<arr.length;i=i+2)
			{
					sum=sum+arr[i];
			}
		}
		else
		{
			for(int i=1;i<arr.length;i=i+2)
			{
					sum=sum+arr[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		List <Integer> list = new ArrayList <Integer> ();
		int arr[]={5, 5, 10, 100, 10, 5};
		for(int i=0;i<arr.length;i++)
		{
			list.add(getsum(i,arr));
		}
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.get(0));
	}

}
