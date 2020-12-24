package Replit;

public class Db {

    private String data;
    private int yint;

    public void setData(String data){
        this.data = data;
    }

    public String getData(){
        return this.data;
    }

    public void setYint(int yint){
        this.yint = yint;
    }

    public int getYint(){
        return this.yint;
    }

    public void insertData(String data, int yint){

        this.data = data;
        this.yint = yint;
    }
}
