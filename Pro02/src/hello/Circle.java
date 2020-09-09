package hello;

public class Circle {
      int r;
      public Circle(int r) {
    	  this.r=r;
      }
      void getArea() {
    	  System.out.println("我的面积是:"+r*r*3.14);
      }
      void getPerimeter() {
    	  System.out.println("我的周长是"+2*3.14*r);
      }
      public static void main(String[]args) {
    	  Circle a=new Circle(4);
    	  a.getArea();
    	  a.getPerimeter();
      }
}
