package org.even;

import java.util.Scanner;

public class AscendingUsingArray {
	public static void main(String[] args) 
	{
		
		//Assigned values
		int temp;
		int a[]= {5,9,3,6,8};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}}}
			System.out.println("decending order");
			for(int i=a.length-1;i>0;i--)
			{
				System.out.println(a[i]);
			}
			System.out.println(a[0]);
		}
	}
	
	
	
		/*
		//assigned values
		int temp;
		int a[]= {9,5,34,67,1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}}}
		System.out.println("ascending order");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(a[a.length-1]);
			}
		}
*/

		/*
	//decending order user input
		System.out.println("how many elements using array");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp;
		int a[]=new int[n];
		System.out.println("enter values");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}}}
		System.out.println("decscending order");
		for(int i=n-1;i>0;i--)
		{
			System.out.println(a[i]);
			}
		System.out.println(a[0]);
		}
}
*/

/*
//ascending order user input
  
System.out.println("how many elements using array");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int temp;
int a[]=new int[n];
System.out.println("enter values");
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
	}
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}}}
System.out.println("ascending order");
for(int i=0;i<n-1;i++)
{
	System.out.println(a[i]);
}
System.out.println(a[n-1]);
*/