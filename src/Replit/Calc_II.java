package Replit;

public class Calc_II {

    private int x, y ,result;

    public int getResult(){
        return this.result;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return this.x;
    }

    public void setY(int y){
        this.y=y;

    }

    public int getY(){

        return this.y;
    }

    public void plus(){
        this.result = this.x+this.y;
        getResult();
    }

    public void minus(){
        this.result = this.x-this.y;
        getResult();
    }
}
