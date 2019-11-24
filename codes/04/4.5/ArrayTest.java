public class ArrayTest {
    public static void main(String[] args) {
        int[] intArr;
        intArr = new int[]{5, 6, 8, 20};

        Object[] objArr;
        objArr = new String[]{"Java", "手动挡"};

        Object[] objArr2;
        objArr2 = new Object[]{"Golang", "兜兜风"};

        System.out.println(objArr[1]);
        objArr2[0] = "Rust";
        System.out.println(objArr2[1]);
    }
}