import java.util.Arrays;

public class ArraysTest2 {
    public static void main(String[] args) {
        final int[] arr1 = new int[]{3, -4, 25, 16, 30, 18};
        // 对数组arr1进行并发排序
        Arrays.parallelSort(arr1);
        System.out.println(Arrays.toString(arr1));
        final int[] arr2 = new int[]{3, -4, 25, 16, 30, 18};
        Arrays.parallelPrefix(arr2, (left, right) ->{
            // left代表数组中前一个索引处对元素，计算第一个元素时，left为1
            // right代表数组中当前索引处对元素
            return left * right;
        });
        System.out.println(Arrays.toString(arr2));


        // ============= 无法编译通过 ============
        // int[] arr3 = new int[5];
        // Arrays.parallelSetAll(arr3, new IntUnaryOperator() {
        //     // operand 代表正在进行计算对元素索引
        //     public int applyAsInt(int operand) {
        //         return operand * 5;
        //     }
        // });
    }
}