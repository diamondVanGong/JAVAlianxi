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
 * �ɻ���Ϸ��������
 * @author Van.G
 *
 */

public class MyGameFrame extends Frame {
	Image bgImg=GameUtil.getImage("images/bg.jpg");
	Image planeImg=GameUtil.getImage("images/plane.png");
	//int planeX=250,planeY=250;
	Plane plane= new Plane(planeImg,250,250);
	//Shell shell=new Shell();
	//����
	Shell[] shells=new Shell[50];
	Explode bao;
	Date startTime=new Date();
	Date endTime;
	int period;//��Ϸ������ʱ��
	//Plane plane2=new Plane(planeImg,350,250);
	//Plane plane3=new Plane(planeImg,450,250);
	@Override
	public void paint(Graphics g) {
	Color c=g.getColor();
		g.drawImage(bgImg, 0, 0, null);
		//g.drawImage(planeImg, planeX,planeY, null);
	//	planeX++;�ɻ������ƶ���
		plane.drawSelf(g);//���ɻ�
	//	plane2.drawSelf(g);
		//plane3.drawSelf(g);
		//�������е��ڵ�
		for(int i=0;i<shells.length;i++) {
			shells[i].draw(g);
			boolean peng=shells[i].getRect().intersects(plane.getRect());
			if(peng) {
				//System.out.println("��ײ�ˣ���");
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
			Font f=new Font("����",Font.BOLD,50);
			g.setFont(f);
			g.drawString("ʱ�䣺"+period+"��",(int)plane.x,(int)plane.y);
			}
		}
		
		g.setColor(c);
		
	}
	//����̰߳������Ƿ������ػ�����
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true) {
				System.out.println("�������»���һ�Σ���");
				repaint();//�ػ�
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//1s=1000ms
			}
		}
	}
	//������̼������ڲ���
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
	 * ��ʼ�����ǵĴ���
	 */
	public void launchFrame() {
		this.setTitle("��ѧ�ó�ԱVan.G����Ʒ");
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//���ô��ڵĴ�С
		this.setLocation(300,300);//���ô�������Ļ�ϵ�λ��
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}
				);
		new PaintThread().start();//�����ػ����߳�
		addKeyListener(new KeyMonitor());//���������Ӽ��̵ļ���
	//��ʼ��50���ڵ�
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
	        offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//������Ϸ���ڵĿ�Ⱥ͸߶�
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}  
	
}
