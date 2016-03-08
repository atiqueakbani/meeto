package JavaProject;

import com.teamdev.jxbrowser.chromium.*;
import com.teamdev.jxbrowser.chromium.events.*;
import com.teamdev.jxbrowser.chromium.swing.*;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
 
public final class GoogleMap {
	public void initMap(ArrayList<String> array) throws InterruptedException	{
       final Browser browser = new Browser(BrowserContext.defaultContext());
       BrowserView browserView = new BrowserView(browser);
 
       JFrame frame = new JFrame("file.html");
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frame.add(browserView, BorderLayout.CENTER);
       frame.setSize(900, 500);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
       int i;
       //map api
       String mapKey = "AIzaSyBgCp6i8HrezFB6e-u9y-KSoeSKOK4IhzE";
       String geoCodeAPI = "AIzaSyC4QTwPmYrSISdVjJXw6YXUaWJVp-G6fFw";
       for(i = 0; i < array.size(); i++)	{
    	   //browser.executeJavaScript(document.write(array.get(i)));
    	   //https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&key=AIzaSyBgCp6i8HrezFB6e-u9y-KSoeSKOK4IhzE
       }
       //browser.loadURL("file:///F:/Faisal/Languages/Projects/KludgeTech/Meeto/JavaProject/src/JavaProject/map.html");
       browser.loadHTML("<html>\n"
   			+ "	<head>\n"
   			+ "		<meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\"/>\n"
   			+ "		<style type=\"text/css\">\n"
   			+ "			html { height: 100% }\n"
   			+ "			body { height: 100%; margin: 0; padding: 0 }\n"
   			+ "			#map-canvas { height: 100% }\n"
   			+ "		</style>\n"
   			+ "		<script type=\"text/javascript\"\n"
   			//+ "				src = \"https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&key=AIzaSyC4QTwPmYrSISdVjJXw6YXUaWJVp-G6fFw\">\n"
   			 + "			src = \"https://maps.googleapis.com/maps/api/js?key=" + mapKey + "&sensor=true\">\n"
            + "		</script>\n"
            + "		<script type=\"text/javascript\">\n"
            + "			var map;\n"
            + "			function initialize() {\n"
            + "				var mapOptions = {\n"
            + "					center: new google.maps.LatLng(48.209331, 16.381302),\n"
            + "					zoom: 4\n"
   			+ "				};\n"
   			+ "				map = new google.maps.Map(document.getElementById(\"map-canvas\"), mapOptions);\n"
        	+ "			}\n"
        	+ "			google.maps.event.addDomListener(window, 'load', initialize);\n"
        	+ "		</script>\n"
        	+ "	</head>\n"
   			+ "	<body>\n"
   			+ "		<div id=\"map-canvas\"></div>\n"
   			+ "	</body>\n"
   			+ "</html>");
       while (browser.isLoading()) {
           TimeUnit.MILLISECONDS.wait(50);
       }
	}
	
/*	    public JSValue invoke(JSValue... args) {
	        for (JSValue arg : args) {
	            System.out.println("arg = " + arg);
	        }
	        return JSValue.create("Hello!");
	    }
	});*/
	
}