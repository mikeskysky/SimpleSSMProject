package com.soecode.lyf.sort;

public class QuickSortTest 
{
	public static void main(String[] args) {
		int[] arr={75,77, 71, 70, 43, 47, 10, 3, 47, 46};
		show(arr);
		sort(arr, 0, arr.length-1);
		show(arr);
	}
	
	public static int getMiddlePoint(int[] arr,int left,int right,int point)
	{
		int leftPtr=left-1;
		int rightPtr=right;
		while(true)
		{
			while(leftPtr<rightPtr&&arr[++leftPtr]<point);
			while(leftPtr<rightPtr&&arr[--rightPtr]>point);
			if(leftPtr>=rightPtr)break;
			int temp=arr[leftPtr];
			arr[leftPtr]=arr[rightPtr];
			arr[rightPtr]=temp;
		}
		int temp=arr[leftPtr];
		arr[leftPtr]=arr[right];
		arr[right]=temp;
		return leftPtr;
	}
	
	public static void show(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void sort(int[] arr,int left,int right)
	{
		if(right-left<=0)return;
		int point=arr[right];
		int middlePoint=getMiddlePoint(arr,left, right, point);
		sort(arr, left, middlePoint-1);
		sort(arr, middlePoint+1, right);
	}
}
