public class BooleanTest {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        // 使用boolean类型的值和字符串进行连接运算，boolean类型的值会自动转换成字符串
        String str = true + "";
        System.out.println(str);
    }
}