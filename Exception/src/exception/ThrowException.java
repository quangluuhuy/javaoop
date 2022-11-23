

//Unchecked Exception
public class ThrowException {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Person is not eligible to vote");
        }else{
            System.out.println("Person is eligible to vote");
        }
    }
    
    public static void main(String[] args){
        validate(13);
    }
}

//Checked Exception
import java.io.*;
public class ThrowException {
    public static void method() throws FileNotFoundException{
        FileReader file = new FileReader("C:\\Users\\Admin\\Desktop\\abc.txt");
        BufferedReader fileInput = new BufferedReader(file);
        
        throw new FileNotFoundException();
    }
    
    public static void main(String[] args){
        try{
            method();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

//User-defined Exception
class UserDefinedException extends Exception{
    public UserDefinedException(String str){
        super(str);
    }
}

public class ThrowException {
    public static void main(String[] args){
        try{
            //throw an object of user defined exception
            throw new UserDefinedException("This is user-defined exception");
        }catch(UserDefinedException ude){
            System.out.println("Caught the exception");
            
            //Print the message from MyException
            System.out.println(ude.getMessage());
        }
    }
}
