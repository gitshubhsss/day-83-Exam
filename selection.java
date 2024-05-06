package sorting;
import java.util.*;
public class selection {

	public static void main(String[] args)
	{
		int i,j,n,temp;
		Scanner shubham=new Scanner (System.in);
		System.out.println("Enter the size of the array");
		n=shubham.nextInt();
		System.out.println("Enter "+n+" Elements in array");
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=shubham.nextInt();//array accept
			
		}
		System.out.println("\nElements in the arrays are");
		for(i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}
		//selection sort 
		for(i=0;i<n-1;i++)//for the passes 
		{
			for(j=i+1;j<n;j++)//for sorting the elements in the array
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nSelection sort :");
		for(i=0;i<n;i++)
		{
			System.out.print(" \t"+a[i]);
		}

	}

}
