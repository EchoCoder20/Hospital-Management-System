package utils;

import java.time.LocalDate;
import java.util.Scanner;

public class InputHandler {
    static Scanner scanner=new Scanner(System.in);
    public static String getStringInput(String prompt){
        System.out.println(prompt);
        String userInput;
        userInput=scanner.nextLine().trim();
        while(!HelperUtils.isValidString(userInput)) {
            System.out.println("Please Enter valid data!");
            userInput=scanner.nextLine().trim();
        }
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
        Integer userInput = 0;
            System.out.print(prompt + ": ");
            userInput= scanner.nextInt();
            while(!HelperUtils.isValidNumber(userInput,min,max) ) {
                userInput= scanner.nextInt();
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
    public static LocalDate getDateInput(String prompt) {
        System.out.println(prompt);
        LocalDate date;
        date= LocalDate.parse(scanner.nextLine());
        LocalDate today = LocalDate.now();
        while (date == null || date.isAfter(today) || date.isBefore(today)) return LocalDate.parse("Invalid Date");
        return date;
    }


}
