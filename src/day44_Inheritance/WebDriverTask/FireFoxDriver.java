package day44_Inheritance.WebDriverTask;

public class FireFoxDriver extends WebDriver{
    public FireFoxDriver() {
        super("FireFox Browser","v*3.0.0");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening the "+ URL+" on firefox driver");
    }

    @Override
    public void close() {
        System.out.println("Closing the firefox driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing the firefox driver");
    }
}
