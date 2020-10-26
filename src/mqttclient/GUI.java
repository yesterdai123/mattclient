package mqttclient;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GUI {
	
	JFrame f=new JFrame("MQTT测试");
	Icon okIcon=new ImageIcon("res/EXE.png");
	JButton ConBtn=new JButton("连接",okIcon);
	MyButtonListener MyListener=new MyButtonListener();
	
	public void init() {
		JPanel bottom=new JPanel();
		bottom.add(ConBtn);
		ConBtn.addActionListener(MyListener);
		f.setLocation(660,300);
		f.setSize(400, 300);
		System.out.println(f.getSize());
		f.add(bottom,BorderLayout.SOUTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.pack();
		f.setVisible(true);
	}
	
	public class MyButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			MyClient.Connect();
			System.out.println("连接成功");
			
		}
		
	}

}
