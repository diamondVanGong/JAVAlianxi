package hello;
public class diyiti1 {
      public static void main(String[]args) {
    	 System.out.println(fiboN(40));
  }
      static long fiboN(int n) {
    	  if(n==0) {
    		  return 0;
    	  }else if(n==1) {
    		  return 1;
    	  }else {
    		  return fiboN(n-1)+fiboN(n-2);
    	  }
      }
}
