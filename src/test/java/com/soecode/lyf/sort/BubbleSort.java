package com.soecode.lyf.sort;

public class BubbleSort 
{
	public static void main(String[] args) {
		int[] arr= {1,2,4,6,12,8,10,110,45};
//		bubbleSort(arr);
		insertSort2(arr);
		printArr(arr);
	}
	
	private static void bubbleSort(int[] arr)
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
	
	public static void insertSort(int[] number) {
        int temp, i ,j;
        for(i = 1; i< number.length; i++) {
            temp = number[i];
            for(j = i; j>0 && number[j-1] > temp; j--) {
                number[j] = number[j-1];
            }
            number[j] = temp;
        }
    }
	
	public static void insertSort2(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];
			int j=i;
			while(j>0&&arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
	}
	
	
	
	
	
	private static void printArr(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
