package day49_Abstraction.RemoteDriverTask;

public class FireFoxDriver extends RemoteDriver{

    @Override
    public void executeScript(String script) {
        System.out.println("Executing script "+script+ " on FireFox");
    }

    @Override
    public void takeScreenShot(String name) {
        System.out.println("Taking screenshot on Firefox");
    }

    @Override
    public void get(String URL) {
        System.out.println("Visiting the url "+ URL+ " on Firefox");
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
