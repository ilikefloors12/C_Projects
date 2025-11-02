import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

Scanner sc = new Scanner(System.in);

double num1, num2;
char op;

System.out.print("Enter a number: ");
num1 = sc.nextDouble();

System.out.print("Enter another number: ");
num2 = sc.nextDouble();

double sum = num1 + num2;
double diff = num1 - num2;
double prod = num1 * num2;
double quo = num1 / num2;


System.out.println(" ");

System.out.println("'+'");
System.out.println("'-'");
System.out.println("'*'");
System.out.println("'/'");
System.out.println(" ");
System.out.print("Enter operator: ");

op = sc.next().charAt(0);

switch (op) {

    case '+':
    System.out.print(num1 + " + " + num2 + " = " + sum);
    break;

    case '-':
    System.out.print(num1 + " - " + num2 + " = " + diff);
    break;

    case '*':
    System.out.print(num1 + " * " + num2 + " = " + prod);
    break;

    case '/':
        if (num2 == 0) {
            System.out.print("Error. Division by zero is not possible.");
        }
        else {
    System.out.print(num1 + " / " + num2 + " = " + quo);
             }
    break;

    default:
    System.out.print("Invalid input.");
    break;
            }

sc.close();



        }
}
