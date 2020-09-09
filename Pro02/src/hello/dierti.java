package hello;
/**
 *  2. 用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个。
 * @author Van.G
 *
 */
public class dierti {
	public static void main(String[]args) {
		int j=1;
		for(int i=1;i<=1000;i++) {
			
			if(i%5==0) {
				System.out.print(i+"\t");
				j++;
			}
			if(j%5==0) {
				System.out.println();
			}
		}
	}

}
