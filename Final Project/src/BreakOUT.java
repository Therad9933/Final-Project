import java.awt.Canvas;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;

public class BreakOUT extends Canvas
	{
		private static final long	serialVersionUID	= 1L;
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
		    graphics.setColor(Color.red);
		    graphics.fillRect(150, 125, 300, 300);
		    if(x == 130 && y > 125 && y < 400)
		    	{
		    		mx =-mx;
		    	}
		    if(y == 420 && x > 125 && x < 400)
		    	{
		    		my =-my;
		    	}
		    if(x == 445 && y > 125 && y < 400)
		    	{
		    		mx =-mx;
		    	}
		    if(y == 111 && x > 125 && x < 400)
		    	{
		    		my =-my;
		    	}
			}
		}
		public void delay()
			{
	        try
	        	{
				Thread.sleep((int)(Math.random()*15));
				} catch (InterruptedException e)
	        	{
				e.printStackTrace();
				}
			}
	}

	
