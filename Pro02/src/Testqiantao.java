/**
 * 测试嵌套循环
 * @author Van.G
 *
 */
public class Testqiantao {
	public static void main(String[]args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++) {
				System.out.print(i);//不换行
			}
			
			System.out.println();//换行
		}
		System.out.println("######################3");
		for(int n=1;n<=9;n++) {
		for(int m=1;m<=n;m++) {
			System.out.print(m+"*"+n+"="+(m*n)+"\t");
		}
		System.out.println();
		}
			
	}
}
