package hello;
/**
 *  2. ��whileѭ��������ѭ�����1-1000֮���ܱ�5������������ÿ�����5����
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
