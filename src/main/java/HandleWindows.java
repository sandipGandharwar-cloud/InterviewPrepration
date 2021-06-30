import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandleWindows {
    public static void main(String[] args){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println("chrome browser launched");
        driver.get("https://www.naukri.com/");
        String parent = driver.getWindowHandle();
        System.out.println("Parent window is : "+parent);
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Total windows count : "+allWindows.size());
        for(String child:allWindows){
            if(!parent.equalsIgnoreCase(child)){
                driver.switchTo().window(child);
                if(driver.getTitle().equalsIgnoreCase("Cognizant")){
                    System.out.println("child window is : "+child);
                    System.out.println("child window title is : "+driver.getTitle());
                }
            }

        }
        driver.switchTo().window(parent);
        System.out.println("parent window is : "+parent);
        System.out.println("parent window title is : "+driver.getTitle());

        driver.quit();
    }
}
