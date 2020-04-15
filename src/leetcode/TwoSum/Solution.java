package leetcode.TwoSum;

import java.util.Arrays;

/* 问题描述：
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */

public class Solution {
    public int[] twoSum(int[] nums, int target) {
    	
    	/*
    	 * 求解思路：
    	 * 1.对数组进行排序
    	 * 2.两层循环，外层循环遍历整个数组，内层循环遍历外层循环后面的数
    	 * 3.若两数之和等于目标值，记录两个值
    	 * 4.循环原数组，找到两个数的索引
    	 */
    	
    	//获得原数组的拷贝
        int[] n = Arrays.copyOf(nums,nums.length);
        //进行排序
        Arrays.sort(nums);
        //res用来存储结果的索引
        int[] res = new int[2];
        
        int sum=0; //两数之和
        int i = 0; //外层循环索引
        int j = 0; //内层循环索引
        for(i=nums.length-1;i>0;i--){
            for(j =0;j < i; j++){
                sum=nums[j]+nums[i];
                if(sum>target){
                    break;
                }
                if(sum==target)
                {
                    break;
                }
            }
            if(sum==target){
                break;
            }
        }
        
        boolean find1 = false;  //是否找到第一个数
        boolean find2 = false;  //是否找到第二个数
        //循环原数组找到索引
        for(int k = 0;k<n.length;k++){
            if(!find1){
                if(n[k]==nums[i]){
                    res[0] = k;
                    find1 = true;
                }else if(n[k]==nums[j]){
                    res[0] = k;
                    find1 = true;
                }
            }else{
                if(n[k]==nums[i]){
                    res[1] = k;
                    find2 = true;
                }else if(n[k]==nums[j]){
                    res[1] = k;
                    find2 = true;
                }
            }
            if(find2){
                break;
            }
        }

        return res;
        
    }

}
