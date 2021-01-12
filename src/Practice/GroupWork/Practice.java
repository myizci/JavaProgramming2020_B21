package Practice.GroupWork;

class Practice {

protected void method(){
    System.out.println("A");
}
private void method(int a){
    System.out.println("B");
}


    }

class test extends Practice{
    public void method (int a){
        System.out.println("C");


    }

    public static void main(String[] args) {
        test obj = new test();
        obj.method();
    }
}

