package day44_Inheritance.WebDriverTask;

public class CybertekDriver extends WebDriver{

    public CybertekDriver() {
        super("Cybertek Driver","V75.0.1");
    }


    @Override
    public void get(String URL) {
        System.out.println("Opening the "+URL + " on cybertek driver");
    }

    @Override
    public void close() {
        System.out.println("Closing cybertek driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing the cybertek driver");
    }
}
