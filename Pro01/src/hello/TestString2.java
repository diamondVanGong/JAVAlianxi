package hello;
/**
 * ��������Ŀ���
 * @author Van.G
 *
 */
public class TestString2 {
     public static void main(String[]args) {
    String[]str= {"����","����","��ѧ��","�ٶ�","����ѷ"};
    removeElment(str,1);
    
     
     
     }
     //���Դ����鵱��ɾ��ĳ��Ԫ�أ������ϻ�������Ŀ�����
     //ɾ�����鵱��ָ������λ�õ�Ԫ�أ�����ԭ�ȵ����鷵��
//     public static void testBasicCopy() {
//		 String[] s1= {"aa","bb","cc","dd","ee"};
//    	 String[]s2=new String[10];
//    	 System.arraycopy(s1, 3, s1, 2,s1.length-3);
//    	 for(int i=0;i<s2.length;i++) {
//    		 System.out.println(i+"--"+s1[i]);
//    	 }
    	 
    	 public static void removeElment() {
    		 String[] s1= {"aa","bb","cc","dd","ee"};
        	 String[]s2=new String[10];
        	 System.arraycopy(s, index+1, s, index,s.length-index-1);
        	 s[s.length-1]=null;
        	 for(int i=0;i<s2.length;i++) {
        		 System.out.println(i+"--"+s1[i]);
        	 }
        	 return s;
        	 
    	 
     }
    	 //����Ԫ�أ���������Ҳ�ǿ������ȶ���һ����������飬Ȼ��ԭ���������ԭ�ⲻ������չ���µ����鵱��
    	 public static void extendRange(String[]s1) {
    		 String[]s1= {"aa","bb","cc"};
    		 String[]s2=new String[s1.length+100];
    		 System.arraycopy(s1,0,s2,0,s1.length);
    		 //��s1���е�����ȫ����չ��s2����
    		 for(String temp:s2) {
    			 System.out.println(temp);
    		 }
    		 return s2;
    		 
    	 }
    	 
    	 
}
