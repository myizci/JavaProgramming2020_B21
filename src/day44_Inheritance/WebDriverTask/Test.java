package day44_Inheritance.WebDriverTask;

public class Test {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        FireFoxDriver driver2 = new FireFoxDriver();
        CybertekDriver driver3 = new CybertekDriver();

        driver.get("www.google.com");
        driver2.get("www.Apple.com");
        driver3.get("www.zaman.com.tr");
        driver.maximize();
    }
}
