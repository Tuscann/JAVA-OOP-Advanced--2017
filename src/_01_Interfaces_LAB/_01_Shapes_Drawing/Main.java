package _01_Interfaces_LAB._01_Shapes_Drawing;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int radius = Integer.parseInt(in.nextLine());;
        int centerX = Integer.parseInt(in.nextLine());
        int centerY = Integer.parseInt(in.nextLine());
        int height = Integer.parseInt(in.nextLine());
        int width = Integer.parseInt(in.nextLine());

        Drawable circle = new Circle(radius);
        Drawable rectangle = new Rectangle(height, width);

        circle.draw();
        rectangle.draw();
    }
}
