package day44_Inheritance.WebDriverTask;

public class WebDriver {
    private String name, version;

    public WebDriver(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void get(String URL){
        System.out.println("opening the "+ URL + " on remote driver");
    }

    public void close(){
        System.out.println("closing the Remote driver");
    }

    public void maximize(){
        System.out.println("Maximizing the Remote driver");
    }

    @Override
    public String toString() {
        return "RemoteDriver{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
