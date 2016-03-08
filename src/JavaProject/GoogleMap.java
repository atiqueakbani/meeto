package JavaProject;

import com.teamdev.jxbrowser.chromium.*;
import com.teamdev.jxbrowser.chromium.swing.*;

import javax.swing.*;

import java.awt.*;
import java.util.concurrent.TimeUnit;
 
public final class GoogleMap {
   //public static void main(String[] args) throws InterruptedException {
	public void initMap() throws InterruptedException	{
       final Browser browser = new Browser(BrowserContext.defaultContext());
       BrowserView browserView = new BrowserView(browser);
 
       JFrame frame = new JFrame("file.html");
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frame.add(browserView, BorderLayout.CENTER);
       frame.setSize(900, 500);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
       browser.loadURL("file:///F:/Faisal/Languages/Projects/KludgeTech/Meeto/JavaProject/src/JavaProject/map.html");
       while (browser.isLoading()) {
           TimeUnit.MILLISECONDS.wait(50);
       }
   }
}