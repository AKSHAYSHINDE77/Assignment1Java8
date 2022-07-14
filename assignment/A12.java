//WAP to find maxium of 5 no , pass array to lambda expression , and return the maximum using lambda expression. dont use nested if else.

package com.yash.assignment;

interface A
{
	void max(int a[]);
}
public class A12 
{
	public static void main(String[] args) {
		A aa = (a) -> {
			int n = a.length;
			for(int i = 0 ; i < n ; i++)
			{
			for(int j = i + 1 ; j < n ; j++)
			{
			if(a[i] > a[j])
			{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp ;
			}
			}
			}
			System.out.println("Maximum NO : "+a[n - 1]);
			for(int k = 1 ; k <= 5 ; k++)
			{
			System.out.println("Largest : "+k+" "+a[n-k]);
			}
			};

			int a[] = {23, 46, 78, 17, 86};
			aa.max(a);
	}

}
