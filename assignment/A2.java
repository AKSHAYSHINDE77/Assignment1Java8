//WAP to print distinct marks from the list of given marks 

package com.yash.assignment;

public class A2 {

	static void Distinct(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int j;
			for(j=0;j<i;j++)
				if(arr[i] == arr[j])
					break;
			
			if(i == j)
				System.out.println(arr[i]+ " ");
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {55 , 88 , 22 , 55 , 99 , 11 , 33 , 22};
		int n=arr.length;
		Distinct(arr,n);
	}

}
