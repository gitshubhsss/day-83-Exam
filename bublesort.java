package sorting;
import java.util.*;
public class bublesort {

	public static void main(String[] args) 
	{
		// first will create one array
		int i,n,j;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		n=shubham.nextInt();
		System.out.println("Enter "+n+" Elements in Array");
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=shubham.nextInt();//array accept
			
		}
		System.out.println(" Elements :");
		for(i=0;i<n;i++)
		{ 
			
		    {
			System.out.print("\t"+a[i]);//display
	     	}

	    }
		//buble sort
		for(i=0;i<n-1;i++)//for the passes 
		{
			for(j=0;j<n-i-1;j++)//for the iteration 
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.print("\nElements in assending order : ");
		for(i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}

}
}
