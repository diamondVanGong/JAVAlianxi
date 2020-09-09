/**
 * 1. 用while循环分别计算100以内的奇数及偶数的和，并输出。
 * @author Van.G
 *
 */
public class oushujishu {
public static void main(String[]args) {
	int sum1=0;
	int sum2=0;
	for(int i=0;i<=100;i++) {
		if(i%2==0)//偶数
		{
			sum1+=i;
		}else {//奇数
			sum2+=i;
		}
	}
}
}
