package exceptionExamples;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionExample {

    public static void main(String[] args) {
    	
//    	  try {
//            
//              int result = 10 / 0;
//              System.out.println("Result: " + result);
//          } catch (ArithmeticException e) {
//              
//              System.out.println("Error: Division by zero");
//          }
    	
    	  
//    	  Scanner scanner = new Scanner(System.in);
//          try {
//              System.out.print("Enter a number: ");
//              int num = scanner.nextInt();
//              int result = 10 / num;
//              System.out.println("Result: " + result);
//          } catch (ArithmeticException e) {
//              System.out.println("Error: Division by zero");
//          } catch (InputMismatchException e) {
//              System.out.println("Error: Invalid input, please enter a number");
//          } finally {
//              scanner.close();
//          }
    	
    	
//    	  try {
//              // Simulating a custom exception
//              throw new MyException("This is a MyException");
//          } catch (MyException e) {
//              System.out.println("MyException: " + e.getMessage());
//          }
    	
    	
    	ThrowsExample example = new ThrowsExample();

        try {
          
            example.readFile();
        } catch (IOException e) {
            
            System.out.println("IOException: " + e.getMessage());
        }
    	
    	
    	
//        try {
//            
//            validateNumber(-5);
//        } catch (CustomValidationException e) {
//           
//            System.err.println("Validation error: " + e.getMessage());
//        } finally {
//           
//            System.out.println("Finally block executed.");
//        }
//
//        System.out.println("Program continues after exception handling.");
    }

    // Method that throws a custom exception
    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number must be non-negative");
        }
        System.out.println("Valid number: " + number);
    }
}

// Custom exception class
class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}


class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}


class ThrowsExample {
    public void readFile() throws IOException {
        throw new IOException("Error reading file");
    }
}
