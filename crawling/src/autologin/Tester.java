package autologin;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Tester {
   public Tester(){

	   try {
         URL url = new URL("http://www.google.com");
         URLConnection connection = url.openConnection();
         connection.connect();
         System.out.println("Internet is connected");
      } catch (MalformedURLException e) {
         System.out.println("Internet is not connected");
      } catch (IOException e) {
         System.out.println("Internet is not connected");
      }
   }
}