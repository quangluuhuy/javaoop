package throwable;

import java.util.jar.JarException;

public class initCause {
    public static void main(String[] args) throws Throwable{
        try {
            function1();
        } catch (Exception e){
            System.out.println("Cause: "+ e.getCause());
        }
    }

    public static void function1() throws javaException {
        try {
            function2();
        } catch (newException n) {
            javaException j1 = new JarException();
            j1.initCause(n);
            throw j1;
        }
    }

    class javaException extends Throwable{
        javaException(){
            super("This is new java Exception!");
        }
    }

    class newException extends Throwable{
        newException(){
            super("This is another new exception!");
        }
    }

}
