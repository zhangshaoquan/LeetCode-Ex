package leetcode.GreatestCommonDivisorOfStrings;

/*
 * 问题描述：
 * 对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
 * 返回最长字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。
 */

class Solution {
	//辗转相除法解决
	public String gcdOfStrings(String str1, String str2) {

		if(str1.length()<str2.length())
			return gcdOfStrings(str2,str1);
		if("".equals(str2))
			return str1;
		if(!str1.startsWith(str2)){
			return "";
		}

		return gcdOfStrings(str2,str1.substring(str2.length()));

	}
}
