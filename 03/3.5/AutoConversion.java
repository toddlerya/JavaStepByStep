public class AutoConversion {
    public static void main(String[] args) {
        int a = 6;
        // int类型可以自动转为float类型
        float f = a;
        // 下面将输出6.0
        System.out.println(f);
        // 定义一个byte类型的整数变量
        byte b = 9;
        // 下面代码将出错, byte类型不能自动转换为char类型
        // char c = b; //损失精度
        // byte类型变量可以自动转换为double类型
        double d = b;
        System.out.println(d);
    }
}