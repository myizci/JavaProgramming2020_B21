package day49_Abstraction.RemoteDriverTask;

public class TestCases {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();



        FireFoxDriver driver2 = new FireFoxDriver();
        driver2.get("https://www.google.com");
        driver2.takeScreenShot("photo1");
        driver2.close();
    }


    WebDriver driver3 = new ChromeDriver();


}
