package leetcode.CountingBits;
/**
 * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 * 
 */
public class Solution {
	public int[] countBits(int num) {
		int[] res = new int[num+1];
		res[0] = 0;
		for(int i = 1; i <= num; i++) {
			if(i%2==0) 
				res[i]=res[i/2];
			else
				res[i]=res[i-1]+1;
		}
		
		return res;

    }

}
