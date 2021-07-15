package javanew;import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Test {
	
	static final int NO_OF_THREADS = 5;

	public static void main(String[] args) throws Exception {

		for (int i = 0; i < NO_OF_THREADS; i++) {
			new ClickTask().start();
		}

	}
}

class ClickTask3 extends Thread {

	///String urlString = "https://www.slideshare.net/sunilos/java-variables-and-operators-55602182";
	String urlString = "https://www.slideshare.net/sunilos/exception-handking";

	static final int THREAD_RUN = 10000;
	static int count = 0;
	
	public void run() {
		InputStream in = null;
		URL u = null;
		for (int i = 0; i < 10000; i++) {
			try {
				count++;
				u = new URL(urlString);
				in = u.openStream();
				in.close();
				System.out.print(count + ",");
				if (count % 50 == 0) {
					System.out.println();
				}
			} catch (Exception e) {
				System.out.println("Error" + e.getMessage());
			}

		}

	}

}

