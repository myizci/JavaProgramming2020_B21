package Replit;

public class Value {

    public int val;
    public boolean modified;

    public Value() {

    }


    public Value(int val) {
        this.val = val;
    }


    public int getVal() {
        return val;
    }

    public boolean isModified() {
        return modified;
    }

    public void setVal(int val) {
        this.val = val;
    }

}
