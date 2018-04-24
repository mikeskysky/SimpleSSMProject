package com.soecode.lyf.sort;

public class ShellSort 
{
	public static void main(String[] args) {
		int[] arr= {242,65,47,99,21,1,2,13,25,46};
		sort2(arr);
		show(arr);
	}
	
	public static void sort(int[] arr)
	{
		//计算间隔
		int h=1;
		while(h<arr.length)
		{
			h=h*3+1;
		}
		h=(h-1)/3;
		while(h>0)
		{
			//1.进行插入排序
			for(int i=h;i<arr.length;i++)
			{
				int temp=arr[i]; 
				int j=i;
				while(j>h-1&&arr[j-h]>temp)
				{
					arr[j]=arr[j-h];
					j-=h;
				}
				arr[j]=temp;
			}
			//2.减小间隔
			h=(h-1)/3;
		}
	}
	
	
	public static void sort2(int arr[])
	{
		//计算间隔
		int h=1;
		while(h>arr.length)
		{
			h=h*3+1;
		}
		h=(h-1)/3;
		while(h>0)
		{
			//1.排序
			for(int i=h;i<arr.length;i++)
			{
				int temp=arr[i];
				int j=i;
				while(j>h-1&&arr[j-h]>temp)
				{
					arr[j]=arr[j-h];
					j-=h;
				}
				arr[j]=temp;
			}
			//2.减小间隔
			h=(h-1)/3;
		}
	}
	
	public static void show(int[] arr)
	{
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
