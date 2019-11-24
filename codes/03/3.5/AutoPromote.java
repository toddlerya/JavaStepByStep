public class AutoPromote {
    public static void main(String[] args) {
        // 定义一个short类型变量
        // short sValue = 5;
        // 表达式中的sValue将自动提升到int类型，则右边的表达式类型位int
        // 将一个int类型值赋给short类型变量将发生错误
        // sValue = sValue - 2;

        byte b = 40;
        char c = 'a';
        int i = 23;
        double d = .314;
        // 右边表达式中最高等级操作数位d(double类型)
        // 则右边表达式中的类型为double类型，故赋给一个double类型变量
        double result = b + c + i * d;
        // 将输出144.222
        System.out.println(result);

        int val = 3;
        // 右边表达式中两个操作数都是int类型，故右边表达式的类型为int
        // 虽然23/3不能除尽，但依然得到一个int类型整数
        int intResult = 23 / val;
        System.out.println(intResult); // 将输出7

        System.out.println("=======");

        // 输出字符串Hello!a7
        System.out.println("Hello!" + 'a' + 7);
        // 输出字符串104Hello!
        System.out.println('a' + 7 + "Hello!");
    }
}