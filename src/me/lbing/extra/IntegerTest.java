package me.lbing.extra;

/**
 * Created by king on 16/5/21.
 */
public class IntegerTest {
    /**
     * int 32位
     * 最大值(max):
     * 机器数:    01111111 11111111 11111111 11111111
     * 真值:      2^32-1
     * 原码:      [01111111 11111111 11111111 11111111]原
     * 反码:      [01111111 11111111 11111111 11111111]反
     * 补码:      [01111111 11111111 11111111 11111111]补
     * <p>
     * max+1:
     * [01111111 11111111 11111111 11111111]补
     * [00000000 00000000 00000000 00000001]补 +
     * -------------------------------------------------------------
     * [10000000 00000000 00000000 00000000]补
     * max+1的补码转变成原码之后真值为:-2^32
     * 注: max+1的补码10000000 00000000 00000000 00000000的真值为-2^32，
     * 超出了32位原码的表示范围，所以无法用32位原码表示。
     */
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("Integer.MAX_VALUE:" + max);
        System.out.println("Integer.MIN_VALUE:" + min);
        //最大值+1之后会溢出，刚好变成最小值
        System.out.println("Integer.MAX_VALUE+1:" + (max + 1));
        System.out.println("Integer.MIN_VALUE-1:" + (max - 1));
    }
}
/* Output
Integer.MAX_VALUE:2147483647
Integer.MIN_VALUE:-2147483648
Integer.MAX_VALUE+1:-2147483648
Integer.MIN_VALUE-1:2147483646
 */
