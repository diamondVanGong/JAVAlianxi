/**
 * 测试if的选择与结构
 * @author Van.G
 *
 */
public class TestIf {
	public static void main(String[]args) {
		double d=Math.random();//返回的是左闭右开区间
		System.out.println(d);
		//int i=(int)(6*Math.random()+1);
		//System.out.println(d);
		//int i=(int)(6*Math.random()+1);
		//if(i<=3) {
			//System.out.println("小");
			
		//}
		int i=(int)(6*Math.random())+1;
		int  j=(int)(6*Math.random())+1;
		int k=(int)(6*Math,random())+1;
		int count=i+j+k;
		//如果三个骰子纸盒大于15则手气不错
		if(count>15) {
			Sustem.out.println("今天的手气不错");}
		if(count>=10&&count <=15) {
			System.out.println("今天的手气很一般的");}
		if(count<10) {
			System.out.println("今天的手气不怎么样！！");}
		System.out.println("得了"+count+"分");
	}
}
