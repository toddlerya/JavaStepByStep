public class IsoscelesTriangle {
    public static void main(String[] args) {
        draw(4);
    }

    public static void draw(int row) {
        int colNum = 2 * row - 1;
        for (int i = 1; i <= row; i++) {
                int starNum = 2 * i - 1;
                int blankNum = (colNum - starNum) / 2;
                for (int b = 0; b < blankNum; b++) {
                    System.out.print(" ");
                }
                for (int s = 0; s < starNum; s++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}