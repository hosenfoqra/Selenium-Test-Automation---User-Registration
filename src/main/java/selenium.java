import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class selenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\Desktop\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        ///driver.manage().window().minimize();
        //driver.get("https://www.google.com/");
        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.id("email_create")).sendKeys("test799900@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
        Thread.sleep(10000); //6sec sleep
        driver.findElement(By.id("id_gender1")).click();    //the title
        driver.findElement(By.id("customer_firstname")).sendKeys("testt");  //the first name
        driver.findElement(By.id("customer_lastname")).sendKeys("test");// the last name
        driver.findElement(By.id("passwd")).sendKeys("TEST123");// the Password
        driver.findElement(By.xpath("//*[@id=\"days\"]/option[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"months\"]/option[10]")).click();
        driver.findElement(By.xpath("//*[@id=\"years\"]/option[61]")).click();//Date of Birth (years)
        driver.findElement(By.id("company")).sendKeys("cocaCola");//the company
        driver.findElement(By.id("address1")).sendKeys("cocacola25");//Address
        driver.findElement(By.id("address2")).sendKeys("34");//Address (Line 2)
        driver.findElement(By.id("city")).sendKeys("naura");//the city
        driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[6]")).click();//the State *
        driver.findElement(By.id("postcode")).sendKeys("00001");//Zip/Postal Code *
        driver.findElement(By.id("other")).sendKeys("coca cola company");//Additional information
        driver.findElement(By.id("phone")).sendKeys("123456789");//Home phone
        driver.findElement(By.id("phone_mobile")).sendKeys("0545678910");//Mobile phone
        //driver.findElement(By.id("alias")).sendKeys("shfaram");//Assign an address alias for future reference.
        Thread.sleep(3000);//3sec sleep
        driver.findElement(By.id("submitAccount")).click();//button Register
        //driver.close();

    }
}