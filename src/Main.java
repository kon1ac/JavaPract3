import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сторону a:");
        int a = scanner.nextInt();

        System.out.println("Введите сторону b:");
        int b = scanner.nextInt();

        System.out.println("Введите сторону c:");
        int c = scanner.nextInt();

        if (isRightTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами прямоугольного треугольника");
        } else if (isEquilateralTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равностороннего треугольника");
        } else if (isIsoscelesTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равнобедренного треугольника");
        } else if (isValidTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " не являются сторонами треугольника");
        } else {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами обычного треугольника");
        }
    }
    public static boolean isRightTriangle(int a, int b, int c) {
        return (a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b);
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        return (a == b) || (b == c) || (c == a);
    }
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        return (a == b) && (b == c);
    }
    public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b <= c) || (b + c <= a) || (c + a <= b);
    }
}