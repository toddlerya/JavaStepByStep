public class Circle {
    public static void main(String[] args) {
        // 测试距离计算方法
        // int[] x = new int[]{3, 0};
        // int[] y = new int[]{0, 4};
        // System.out.print(distance(x, y));
        draw(13);
    }

    /**
     * 根据不同半径打印不同大小的圆
     * @param r 圆形的半径
     */
    public static void draw(int r) {
        double precision = 0.4;
        // 初始化圆心坐标
        int[] centerPoint = new int[]{r, r};
        // 第一象限坐标系，圆的外切正方形
        int width, height;
        width = height = 2 * r;
        // 每一个点
        int[] eachPoint = new int[2];
        // 计算每个点与圆心的距离是否趋近于r, 误差为precision
        for (int w = 0; w <= width; w++) {
            for (int h = 0; h <= height; h++) {
                eachPoint[0] = w;
                eachPoint[1] = h;
                double diffValue = distance(centerPoint, eachPoint) - (double)r;
                if (0 <= diffValue && diffValue <= precision) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /**
     * 计算两点距离
     */
    public static double distance(int[] aPoint, int[] bPoint) {
        double d;
        d = Math.sqrt(Math.pow((aPoint[0] - bPoint[0]), 2) + Math.pow((aPoint[1] - bPoint[1]), 2));
        return d;
    }
}

/*
# evi1 @ evi1nullMacBook-Pro in ~/JavaStepByStep/exercises/04 on git:master x [18:06:05] C:1
$ javac Circle.java
(base)
# evi1 @ evi1nullMacBook-Pro in ~/JavaStepByStep/exercises/04 on git:master x [18:06:33]
$ java Circle
                    * * * * * * *
                *                   *
            *                           *



    *                                           *

  *                                               *

*                                                   *
*                                                   *
*                                                   *
*                                                   *
*                                                   *
*                                                   *
*                                                   *

  *                                               *

    *                                           *



            *                           *
                *                   *
                    * * * * * * *
(base)

*/