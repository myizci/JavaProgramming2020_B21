package day45_Exceptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {

    public static void main(String[] args) {

        try {
            System.out.println(25 / 0);
        } catch (NoSuchElementException e) {
            System.out.println("No Such Element");
        } catch (ClassCastException e) {
            System.out.println("Class Cast Exception");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception");
        }


        System.out.println("================================================");

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("================================================");

        String[] names = {"Walid", "Agalar", "Ayse"};
        try {
            names[10] = "Muhtar";
        } catch (IllegalArgumentException e) {//ArrayIndexOutOfBound
            System.out.println("IllegalArgumentException");
        }catch(NoSuchElementException e){
            System.out.println("NoSuchElementException");
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch(IndexOutOfBoundsException e){ // This is the parent class, this one will handle
            System.out.println("IndexOutOfBoundsException");
        } catch(RuntimeException e){//Must be last catch block
            System.out.println("RuntimeException");
        }
    }
}
