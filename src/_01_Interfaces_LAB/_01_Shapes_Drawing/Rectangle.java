package _01_Interfaces_LAB._01_Shapes_Drawing;

public class Rectangle implements Drawable {
    private int height;
    private int width;

    Rectangle(int height, int width) {
        this.setHeight(height);
        this.setWidth(width);
    }

    private void setHeight(int height) {
        this.height = height;
    }

    private void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            System.out.print("*");
            for (int k = 1; k < width; k++) {
                System.out.print(" ");
                if (i == 0 || i == (height - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" *\n");
        }
    }
}
