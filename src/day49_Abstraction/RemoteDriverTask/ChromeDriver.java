package day49_Abstraction.RemoteDriverTask;

public class ChromeDriver extends RemoteDriver{

    @Override
    public void executeScript(String script) {
        System.out.println("Executing script "+script+ " on Chrome");
    }

    @Override
    public void takeScreenShot(String name) {
        System.out.println("Taking screenshot on Chrome");
    }

    @Override
    public void get(String URL) {
        System.out.println("Visiting the url "+ URL+ " on Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing the browser");
    }

    @Override
    public void quit() {

    }

    @Override
    public void findElement() {

    }
}
