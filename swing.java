package MYframe;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;









class Myframe extends JFrame implements ActionListener{
	Container c;
	JLabel label1,label2;
	JTextField user;
	JPasswordField pass;
	
	
	JButton btn;
	
	Myframe(){
		
		JLabel background;
		setSize(1200,700);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon img=new ImageIcon("Background.251-2514687_4k-city-wallpaper.jpg");
		background=new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,1200,700);
		add(background);
		
		setTitle("LOGIN FORM");
		setSize(400,300);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		label1=new JLabel("Username");
		label2=new JLabel("Password");
		
		label1.setBounds(10,50,100,20);
		label2.setBounds(10,100,100,20);
	
		c.add(label1);
		c.add(label2);
		
		user=new JTextField();
		user.setBounds(120,50,120,20);
		c.add(user);
		pass=new JPasswordField();
		pass.setBounds(120,100,120,20);	
		c.add(pass);
		
		
		btn=new JButton("Login");
		btn.setBounds(100,150,70,30);
		c.add(btn);
		btn.addActionListener(this);
	    setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Username:"+user.getText());
		System.out.println("Password:"+pass.getText());
	}
	
}

public final class LoginForm {

	public static void main(String[] args) {
		Myframe frame=new Myframe();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
