import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        int resultAdd = add(num1, num2);
        int resultSub = sub(num1, num2);
        int resultMul = mul(num1, num2);
        int resultDiv = div(num1, num2);
        int resultMod = mod(num1, num2);

        System.out.print("Task 3 result: " + "\n" + num1 + " + " + num2 + " = " + resultAdd);
        System.out.print("\n" + num1 + " - " + num2 + " = " + resultSub);
        System.out.print("\n" + num1 + " * " + num2 + " = " + resultMul);
        System.out.print("\n" + num1 + " / " + num2 + " = " + resultDiv);
        System.out.print("\n" + num1 + " mod " + num2 + " = " + resultMod);

    }

    public static int add(int num1, int num2) {
        int resultAdd = num1 + num2;
        return resultAdd;
    }

    public static int sub(int num1, int num2) {
        int resultSub = num1 - num2;
        return resultSub;
    }

    public static int div(int num1, int num2) {
        int resultDiv = num1 / num2;
        return resultDiv;
    }

    public static int mul(int num1, int num2) {
        int resultMul = num1 * num2;
        return resultMul;
    }

    public static int mod(int num1, int num2) {
        int resultMod = num1 % num2;
        return resultMod;
    }

}