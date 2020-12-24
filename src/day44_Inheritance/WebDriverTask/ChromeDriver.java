package day44_Inheritance.WebDriverTask;

public class ChromeDriver extends WebDriver {

    public ChromeDriver() {
        super("Chrome Browser","V84.0.1");
    }

    @Override
    public void close() {
        System.out.println("Closing the chrome driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing the chrome driver");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening the " +URL + " on chrome driver");
    }
}
