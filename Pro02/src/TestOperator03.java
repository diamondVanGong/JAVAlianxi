/**
 * l逻辑运算符
 * @author Van.G
 *
 */
public class TestOperator03 {
 public static void main(String[]args) {
	 boolean b1=true;
	 boolean b2=false;
	 System.out.println(b1&b2);//false
	 System.out.println(b1|b2);//true
	 System.out.println(b1^b2);//true
	 System.out.println(!b2);//true
	 //测试短路
	 int c=3/0;//ArithmeticEXception
	 boolean b3=1>2&2<(3/0);//后面其实还是计算了
	 boolean b4=1>2&&2<(3/0);//结果是false,没有计算
	 //短路与，第一个操作数的值为false则不需要再计算机后面的操作数了
	 
	 
	 
 }
}
