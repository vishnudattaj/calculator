import java.util.Scanner;  
class HelloWorld {
    public static void main(String[] args)
    {
        calc();
    }
    public static void calc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Operation?");
        String operation = scan.nextLine();
        if (operation.equals("add")) {
            System.out.println("What's your first number? ");
            int num1 = scan.nextInt();
            System.out.println("What's your second number? ");
            int num2 = scan.nextInt();
            System.out.println("Your answer is " + String.valueOf(num1 + num2));
            calc();
        }
        else if (operation.equals("subtract")) {
            System.out.println("What's your first number? ");
            int num1 = scan.nextInt();
            System.out.println("What's your second number? ");
            int num2 = scan.nextInt();
            System.out.println("Your answer is " + String.valueOf(num1 - num2));
            calc();
        }
        else if (operation.equals("multiply")) {
            System.out.println("What's your first number? ");
            int num1 = scan.nextInt();
            System.out.println("What's your second number? ");
            int num2 = scan.nextInt();
            System.out.println("Your answer is " + String.valueOf(num1 * num2));
            calc();
        }
        else if (operation.equals("divide")) {
            System.out.println("What's your first number? ");
            int num1 = scan.nextInt();
            System.out.println("What's your second number? ");
            int num2 = scan.nextInt();
            System.out.println("Your answer is " + String.valueOf(num1 / num2));
            calc();
        }
        else
        {
            System.out.println("Input a valid operation");
            calc();
        }
    }
}
