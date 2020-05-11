package autologin;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JframeTest {

	  public static void main(String[] args) {
	     
		  Frame f = new Frame("정보 입력");
		  f.setLayout(new FlowLayout());
		  f.addWindowListener(new WindowAdapter() {
			  public void windowClosing(WindowEvent e) {
				  System.exit(0);
			  }
		});
		  
		  
		  Label lid = new Label("ID",Label.RIGHT);//라벨 필드
		  Label lpw = new Label("pw",Label.LEFT);
		  
		  TextField id = new TextField(15);//아이디 패스워드 필드
		  TextField pw = new TextField(15);
		  
		  pw.setEchoChar('*');

		  
		  Button submit = new Button("확인");
		  
		  submit.setSize(30,30);
		  // 버튼 옵션
		  
		  // 전체 옵션 .
		  f.add(lid);
		  f.add(id);
		  f.add(lpw);
		  f.add(pw);
		  f.add(submit);		  
		  
		  f.pack();
		  f.setVisible(true);
		  
	    }


	
}
	
