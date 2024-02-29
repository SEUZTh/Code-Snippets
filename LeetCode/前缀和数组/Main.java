/*
 * @Auther: zth
 * @Date: 2024-02-28 20:01:58
 * @LastEditTime: 2024-02-28 20:03:35
 * @Description: 303. 区域和检索 - 数组不可变
 */
public class Main {
    public static void main(String[] args) {
        String[] commands = { "NumArray", "sumRange", "sumRange", "sumRange" };
        int[][][] params = { { { -2, 0, 3, -5, 2, -1 } }, { { 0, 2 } }, { { 2, 5 } }, { { 0, 5 } } };

        NumArray numArray = null; // 初始化为null，稍后创建实例

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "NumArray":
                    numArray = new NumArray(params[i][0]); // 创建NumArray实例
                    break;
                case "sumRange":
                    int left = params[i][0][0];
                    int right = params[i][0][1];
                    System.out.println(numArray.sumRange(left, right)); // 调用sumRange并打印结果
                    break;
                default:
                    System.out.println("Unknown command.");
                    break;
            }
        }
    }
}

class NumArray {

    private int[] preSum; // [0, -2, -2, 1, -4, -2, -3]

    public NumArray(int[] nums) {
        preSum = new int[nums.length + 1];
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return preSum[right + 1] - preSum[left];
    }
}
