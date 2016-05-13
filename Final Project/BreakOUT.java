import java.awt.Canvas;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;

public class BreakOUT extends Canvas
	{
		private static final long	serialVersionUID	= 1L;
		int velX = 0, velY = 0;
		public static void main(String[] args)
			{
				BreakOUT canvas = new BreakOUT();
		        JFrame frame = new JFrame();
		        frame.setSize(600, 600);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.black);
		        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		        frame.setResizable(false);
		        frame.setVisible(true);

			}
		public void paint (Graphics graphics)
		{
			int mx = 1;
			int x = 0;
			int y = 200;
			int my = 1;
		while(true)
			{
				x = x + mx;
				y = y + my;
			graphics.setColor(Color.blue);
			graphics.fillOval(x, y, 25, 25);
			 
			delay();
		        
		    graphics.setColor(Color.black);
		    graphics.fillOval(x, y, 25, 25);
		    if(x == 575 || x == 0)
		    	{
		    		mx =-mx;
		    	}
		    if(y == 550 || y == 0)
		    	{
		    		my =-my;
		    	}
		    graphics.setColor(Color.gray);
		    graphics.fillRect(250, 560, 100, 10);
			}
		}
		
		public void delay()
			{
	        try
	        	{
				Thread.sleep(10);
				} catch (InterruptedException e)
	        	{
				e.printStackTrace();
				}
			}
	}

	
