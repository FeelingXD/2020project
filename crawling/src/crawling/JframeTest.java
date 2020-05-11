package crawling;

import java.awt.FlowLayout;
import java.awt.Frame;
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
		  
	    }


	
}
	
