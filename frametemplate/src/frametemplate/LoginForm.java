package frametemplate;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener{
	 JLabel l1, l2, l3;// 라벨 태그
	 JTextField tf1;// id 버튼 
	 JButton btn1;//Submit 버튼
	 JPasswordField p1;//pw 필드 id 필드와 다르게 *로 표기
	
	 LoginForm(){
		JFrame f = new JFrame("");
		l1 =new JLabel("LoginForm");
		l1.setForeground(Color.blue);
		l1.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 20));
		
		l2= new JLabel("UserName");
		l3= new JLabel("PassWord");
		tf1 = new JTextField();
		p1 = new JPasswordField();
		btn1 =new JButton("Login");
		
		l1.setBounds(100, 30, 400, 30);// x ,y width ,height 절대좌표값 
		l2.setBounds(80, 70, 200, 30);
		l3.setBounds(80, 110, 200, 30);
		tf1.setBounds(300, 70, 200, 30);
		p1.setBounds(300, 110, 200, 30);
		btn1.setBounds(150, 160, 100, 30);
		
		 f.add(l1);
		 f.add(l2);
		 f.add(tf1);
		 f.add(l3);
		 f.add(p1);
		 f.add(btn1);

		 f.setSize(600, 300);
		 f.setLayout(null);
		 f.setVisible(true);
		 
	}
	 public void actionPerformed(ActionEvent ae)
	 {
	   String uname = tf1.getText();
	   char[] pass = p1.getPassword();
	 }
	 public static void main(String[] args) 
	 {
		 new LoginForm();
	 }
}