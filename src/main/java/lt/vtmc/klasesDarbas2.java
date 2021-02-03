package main.java.lt.vtmc;

public class klasesDarbas2 {
    public static void main(String[] args) {
        // Bitwise operators
        int int1 = 5;
        int int2 = 2;
        int result1 = int1 & int2; // IR, logine konjukcija, ^
        // 5 = 101 (binarinis)
        // 2 = 010
        // &
        // 0 = 000
        System.out.println(result1);

        int result2 = int1 | int2; // ARBA, logine disjukcija, v
        // 5 = 101 2^2x1 + 2^1x0 + 2^0x1
        // 2 = 010
        // |
        // 7 = 111
        System.out.println(result2);

        int result3 = ~5; // NE, inversija, -
        // 5 = 101 2^2x1 + 2^1x0 + 2^0x1 = 00000000 00000000 00000000 00000101
        // ~
        // -6 = 010
        System.out.println(result3);
        System.out.println(Integer.toBinaryString(result3));

        int result4 = int1 ^ int2; // Isskirtinis ARBA 1 + 1 = 0
        // 5 = 101 (binarinis)
        // 2 = 010
        // ^
        // 7 = 111
        System.out.println(result4);

        int result5 = int1 << 1; // shift to left
        // 5 = 101 <-- 1bit
        // <<
        // 10 = 1010
        System.out.println(result5);

        int result6 = int1 >> 1; // shift to right
        // 5 = 101 --> 1bit
        // >>
        // 2 = 010
        System.out.println(result6);

        int result7 = int1 >>> 1; // shift to right
        // 5 = 101 --> 1bit
        // >>>
        // 2 = 010
        System.out.println(result7);
        System.out.println(Integer.toBinaryString(result7));

        boolean bl1 = false;
        boolean bl2 = true;
        boolean res1 = bl1 && bl2; // boolean method1() && boolean method2
        System.out.println(res1);

        boolean res2 = bl2 || bl1; // boolean method1() || boolean method2
        System.out.println(res2);

        boolean res3 = !bl1; // neigimas
        System.out.println(res3);

        // Assignment
        int number1 = 10;
        int number2 = 1;
        System.out.println(number2 += number1);

        System.out.println(1 + 2 / 3 * 5 % 2);
    }
}
