package cn.sxt.game;
 
import java.awt.Graphics;
import java.awt.Image;
 
/*
 * ±¨’®¿‡
 */
public class Explode {
    double x,y;//±¨’®µƒŒª÷√
    static Image[] imgs = new Image[16];
    static {
    	try {
        for(int i=0;i<16;i++){
            imgs[i] = GameUtil.getImage("images/explode/e"+(i+1)+".gif");
            imgs[i].getWidth(null);
        }
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    }
     
    int count=0;
     
    public void draw(Graphics g){
        if(count<=15){
            g.drawImage(imgs[count], (int)x, (int)y, null);
            count++;
        }
    }
     
    public Explode(double x,double y){
        this.x = x;
        this.y = y;
    }
    public Explode()
    {
    	
    }
}