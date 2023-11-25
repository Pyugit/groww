package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class EdgeBrwser{
   public static void main(String[] args) {
      //set path of msedgedriver.exe path
      System.setProperty("webdriver.edge.driver",
    		  "C:\\Users\\piyush\\Desktop\\New folder (2)\\msedgedriver.exe");
      //instance of EdgeDriver
      WebDriver driver = new EdgeDriver();
      //URL launch
      driver.get("https://www.geeksforgeeks.org/how-to-open-microsoft-edge-browser-using-selenium-in-java/");
   }
}