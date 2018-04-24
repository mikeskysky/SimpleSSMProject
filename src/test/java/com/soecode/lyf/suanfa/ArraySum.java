package com.soecode.lyf.suanfa;

public class ArraySum 
{
	public static void main(String[] args) {
		int[] arr= {1,-2,3,10,-4,7,2,-5};
		System.out.println(MaxSubArray3(arr));
	}
	
	private static int MaxSubArray(int[] arr,int n)
	{
		int maxSum=arr[0];
		int currSum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				currSum=0;
				for(int k=i;k<=j;k++)
				{
					currSum+=arr[k];
				}
				if(currSum>maxSum)
				{
					maxSum=currSum;
				}
			}
		}
		return maxSum;
	}
	private static int MaxSubArray2(int[] arr)
	{
		int maxSum=arr[0];
		int currSum=0;
		for(int i=0;i<arr.length;i++)
		{
			currSum=0;
			for(int j=i;j<arr.length;j++)
			{
				currSum+=arr[j];
				if(currSum>maxSum)
				{
					maxSum=currSum;
				}
			}
		}
		return maxSum;
	}
	
	private static int MaxSubArray3(int[] arr)
	{
		int result=arr[0];
		int sum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(sum>0) sum+=arr[i];
			else sum=arr[i];
			if(sum>result) result=sum;
		}
		return result;
	}
	
}
