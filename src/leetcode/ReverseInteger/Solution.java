package leetcode.ReverseInteger;

/*
 * 问题描述：
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转
 * 
 */

public class Solution {
	/*
	 * 通过模运算和除法运算，获得每一位上的数字，可以很容易获得反转之后的数
	 * 
	 * 问题在于如何判断溢出
	 * 已知正数最大值为2147483647
	 * 在求正数反转过程中，发现在进行下一次乘以10加上个位数的值大于2147483647时，即可判断为溢出，返回0
	 * 负数，亦然
	 * 
	 */
	public int reverse(int x) {
		
		
        int res=0;  //存储结果
        int pop=0;  //存储每一次模10的值
    
        while(x!=0){
        	
            pop=x%10;  
            x/=10;  
            
            //判断是否溢出
            if(res>214748364||(res==214748364&&pop>7)){
                return 0;
            }
            if(res<-214748364||(res==-214748364&&pop<-8))
            {
                return 0;
            }
            
            res = res*10+pop;        
        
        }
        return res;
		
		
        
        //利用字符串进行求解
        /*
         * 将整数转换成字符串
         * 反转字符串
         * 再转换成long类型
         * 之后判断是否超过int的范围
         * 返回结果
         * 
         */
        // int res=0;
        // int f = 1;
        // long xl = (long)x;
        // if(xl<0){
        //     xl*=-1;
        //     f=-1;
        // }
        // String res1 = xl+"";
        // // System.out.println(res1);
        // char[] c = res1.toCharArray();
        // for(int i =0 ; i<=(c.length-1)/2;i++){
        //     char tmp = c[i];
        //     c[i]=c[c.length-1-i];
        //     c[c.length-1-i]=tmp;
        // }
        // String res2 = new String(c);
        // long res3 = Long.valueOf(res2)*f;
        

        // if(res3>2147483647L || res3<-2147483648L)
        //     res=0;
        // else
        //     res = (int) res3;
        // return res;

        // System.out.println((-1)%10);
        // int rev = 0;
        // while (x != 0) {
        //     int pop = x % 10;
        //     x /= 10;
        //     if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
        //     if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
        //     rev = rev * 10 + pop;
        // }
        // return rev;

    }

}
