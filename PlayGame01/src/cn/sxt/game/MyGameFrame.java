package cn.sxt.game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
/**
 * 飞机游戏的主窗口
 * @author Van.G
 *
 */

public class MyGameFrame extends Frame {
	Image bgImg=GameUtil.getImage("images/bg.jpg");
	Image planeImg=GameUtil.getImage("images/plane.png");
	//int planeX=250,planeY=250;
	Plane plane= new Plane(planeImg,250,250);
	//Shell shell=new Shell();
	//数组
	Shell[] shells=new Shell[50];
	Explode bao;
	Date startTime=new Date();
	Date endTime;
	int period;//游戏持续的时间
	//Plane plane2=new Plane(planeImg,350,250);
	//Plane plane3=new Plane(planeImg,450,250);
	@Override
	public void paint(Graphics g) {
	Color c=g.getColor();
		g.drawImage(bgImg, 0, 0, null);
		//g.drawImage(planeImg, planeX,planeY, null);
	//	planeX++;飞机向右移动了
		plane.drawSelf(g);//画飞机
	//	plane2.drawSelf(g);
		//plane3.drawSelf(g);
		//画出所有的炮弹
		for(int i=0;i<shells.length;i++) {
			shells[i].draw(g);
			boolean peng=shells[i].getRect().intersects(plane.getRect());
			if(peng) {
				//System.out.println("相撞了！！");
				plane.live=false;
				if(bao==null) {
				bao=new Explode(plane.x,plane.y);
				endTime=new Date();
				period=(int)((endTime.getTime()-startTime.getTime())/1000);
				}
			
				bao.draw(g);
			}
			if(!plane.live) {
			g.setColor(Color.red);
			Font f=new Font("宋体",Font.BOLD,50);
			g.setFont(f);
			g.drawString("时间："+period+"秒",(int)plane.x,(int)plane.y);
			}
		}
		
		g.setColor(c);
		
	}
	//这个线程帮助我们反复的重画窗口
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true) {
				System.out.println("窗口重新画了一次！！");
				repaint();//重画
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//1s=1000ms
			}
		}
	}
	//定义键盘监听的内部类
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}
		
	}
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 初始化我们的窗口
	 */
	public void launchFrame() {
		this.setTitle("尚学堂成员Van.G的作品");
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//设置窗口的大小
		this.setLocation(300,300);//设置窗口在屏幕上的位置
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}
				);
		new PaintThread().start();//启动重画的线程
		addKeyListener(new KeyMonitor());//给窗口增加键盘的监听
	//初始化50个炮弹
		for(int i=0;i<shells.length;i++) {
			shells[i]=new Shell();
		
		
		
		}
	
	
	}
	public static void main(String[]args) {
		MyGameFrame f=new  MyGameFrame();
		f.launchFrame();
	}
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}  
	
}
