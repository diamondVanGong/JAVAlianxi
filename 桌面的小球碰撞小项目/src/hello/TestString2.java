package hello;
/**
 * 测试数组的拷贝
 * @author Van.G
 *
 */
public class TestString2 {
     public static void main(String[]args) {
    String[]str= {"阿里","京东","尚学堂","百度","亚马逊"};
    removeElment(str,1);
    
     
     
     }
     //测试从数组当中删除某个元素（本质上还是数组的拷贝）
     //删除数组当中指定索引位置的元素，并将原先的数组返回
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
    	 //插入元素，数组扩容也是拷贝：先定义一个更大的数组，然后将原数组的内容原封不动的扩展到新的数组当中
    	 public static void extendRange(String[]s1) {
    		 String[]s1= {"aa","bb","cc"};
    		 String[]s2=new String[s1.length+100];
    		 System.arraycopy(s1,0,s2,0,s1.length);
    		 //将s1当中的内容全部扩展到s2当中
    		 for(String temp:s2) {
    			 System.out.println(temp);
    		 }
    		 return s2;
    		 
    	 }
    	 
    	 
}
