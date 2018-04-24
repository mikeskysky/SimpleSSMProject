package com.soecode.lyf.sort;

import java.util.ArrayList;

class Solution {
	
	public static void main(String[] args) {
		int[] arr= {1,1,2};
		Solution sl=new Solution();
		ArrayList<ArrayList<Integer>> permuteUnique = sl.permuteUnique(arr);
		
	}
	
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(nums ==null || nums.length ==0)
            return res;
        boolean[] used = new boolean[nums.length];
        helper(nums,list,res,used);
        return res;
    }
    public void helper(int[] nums,ArrayList<Integer> list,
    ArrayList<ArrayList<Integer>> res,boolean[] used){
        if(nums.length == list.size()){
            ArrayList<Integer> list2 =new ArrayList<Integer>(list);
            if(!res.contains(list2))
                res.add(list2);
            return;
        }
        for(int i=0;i< nums.length;i++){
            if(!used[i]){
                used[i] = true;
                list.add(nums[i]);
                helper(nums,list,res,used);
                list.remove(list.size()-1);
                used[i]= false;
            }
        }
    }
}

