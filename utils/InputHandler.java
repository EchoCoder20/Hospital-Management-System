package utils;

import java.util.Scanner;

public class InputHandler {
    static Scanner scanner=new Scanner(System.in);
    public static String getStringInput(String prompt){
        System.out.print(prompt + ": ");
        String userInput=scanner.nextLine().trim();
        if(HelperUtils.isValidString(userInput))
            return "Please Enter valid data!";
        return userInput;
    }
    public static Integer getIntInput(String prompt) {
        boolean flag=true;
        Integer userInput = 0;
        while (flag){
            System.out.print(prompt + ": ");
            userInput= scanner.nextInt();
            if(HelperUtils.isPositive(userInput) ) {
                flag=false;
            }
            System.out.println("Invalid Data !");
        }
        return userInput;
    }
    public static Integer getIntInput(String prompt, int min, int max) {
        boolean flag=true;
        Integer userInput = 0;
        while (flag){
            System.out.print(prompt + ": ");
            userInput= scanner.nextInt();
            if(HelperUtils.isValidNumber(userInput,min,max) ) {
                flag=false;
            }
            System.out.println("Invalid Data !");
        }
        return userInput;
    }
    public static Double getDoubleInput(String prompt) {
        boolean flag=true;
        Double userInput = 0.0;
        while (flag){
            System.out.print(prompt + ": ");
            userInput= scanner.nextDouble();
            if(HelperUtils.isPositive(userInput) ) {
                flag=false;
            }
            System.out.println("Invalid Data !");
        }
        return userInput;
    }
    public static Double getDoubleInput(String prompt, int min, int max) {
        boolean flag=true;
        Double userInput = 0.0;
        while (flag){
            System.out.print(prompt + ": ");
            userInput= scanner.nextDouble();
            if(HelperUtils.isValidNumber(userInput,min,max)  ) {
                flag=false;
            }
            System.out.println("Invalid Data !");
        }
        return userInput;
    }
    public static String getConfirmation(String prompt){
        boolean flag=true;
        String userInput="";
        while (flag){
            System.out.print(prompt + ": ");
            userInput= scanner.nextLine();
            if(HelperUtils.isValidString(userInput)  ) {
                flag=false;
            }
            System.out.println("Invalid Data !");
        }
        return userInput;
    }


}
