import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        System.out.println("....Wellcome to Calculator....");
        System.out.println("Following operations are supported : \n" +
                "1. Addition (+) \n" +
                "2. Subtraction (-) \n" +
                "3. Multiplication (*) \n" +
                "4. Division (/) \n");;

        Scanner input = new Scanner(System.in);
        System.out.println("Select the operation : ( + , - , * , / )");
        char operation = input.nextLine().charAt(0);

        System.out.println("Enter the first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = input.nextDouble();

        if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
            System.err.println("Invalid Operator. Please use only + or - or * or /");
        }

        if (operation == '/' && num2 == 0.0){
            System.err.println("The second number cannot be 0 in division");
        }

        if (operation == '+'){
            System.out.println("Number 1 + Number 2 equals = " + num1 + num2);
        }else if (operation == '-'){
            System.out.println("Number 1 - Number 2 equals = " + (num1 - num2));
        }else if (operation == '*'){
            System.out.println("Number 1 * Number 2 equals = " + (num1 * num2));
        }else if (operation == '/'){
            System.out.println("Number 1 / Number 2 equals = " + (num1 / num2));
        }else {
            System.out.println("Invalid operator entered!");
        }



    }

}
