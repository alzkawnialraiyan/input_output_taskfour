import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //task4 number swapping
        System.out.println("Enter two numbers: ");
        System.out.println("First number: ");
        int s1 = read.nextInt();
        System.out.println("Second number: ");
        int s2 = read.nextInt();

        System.out.println("numbers before swapping   " + s1+ "," + s2);
        int s3;
        s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println("numbers after swapping " + s1+ "," + s2);
    }
}