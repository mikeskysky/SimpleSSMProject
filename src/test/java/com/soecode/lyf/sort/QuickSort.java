package com.soecode.lyf.sort;

public class QuickSort 
{
	public static void main(String[] args) {
		long[] arr=new long[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=(long) (Math.random()*99);
		}
		show(arr);
		sort(arr, 0, arr.length-1);
		show(arr);
	}
	public static int quickSortArr(long[] arr,int left,int right,long point)
	{
		int leftPtr=left-1;
		int rightPtr=right;
		while(true)
		{
			while(leftPtr<rightPtr&&arr[++leftPtr]<point);
			while(leftPtr<rightPtr&&arr[--rightPtr]>point);
			if(leftPtr>=rightPtr) break;
			else
			{
				long temp=arr[leftPtr];
				arr[leftPtr]=arr[rightPtr];
				arr[rightPtr]=temp;
			}
		}
		long temp=arr[leftPtr];
		arr[leftPtr]=arr[right];
		arr[right]=temp;
		return leftPtr;
	}
	
	public static void show(long[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void sort(long[] arr,int left,int right)
	{
		if(right-left<=0) return;
		long point=arr[right];
		int middlePoint=quickSortArr(arr, left, right, point);
		sort(arr, left, middlePoint-1);
		sort(arr, middlePoint+1, right);
		
	}
}
