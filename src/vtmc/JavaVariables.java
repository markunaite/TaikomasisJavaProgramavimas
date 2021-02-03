package vtmc;

public class JavaVariables {
    public static void main(String[] args) {
        byte byteNumber = 127;
        byte otherNumber =2;
        byte result = (byte) (byteNumber + otherNumber); //perpildymas
        System.out.println(result);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
// int (stack) --> Object (Integer) --> Integer
        int intNumber = 1024;
        Integer otherIntNumber = intNumber;
        System.out.println(otherIntNumber.hashCode());
        int manoNr = otherIntNumber;

        int numeris = 25;
        System.out.println(Integer.toBinaryString(numeris));
        if (byteNumber != 0) {
            System.out.println(numeris / byteNumber);
        }
        System.out.println(numeris * 4);
        System.out.println(numeris / 6);
        System.out.println(numeris++); //numeris = numeris + 1
        System.out.println(numeris-- + ++numeris); // (26 - 1 + 1 + 26)
        int a = 10;
       // int b = 12;
        //int rs = a++ + b++;
        //System.out.println(rs);
        a = a + 1;
        System.out.println(a);

        int c = 5;
        int d = 2;

        System.out.println(c & d); // c^ d konjukcija (IR, &)
          /* & 0 ir 0 = 0, 1 ir 0 = 0, 0 ir 1 = 0, 1 ir 1 = 1
        5 = 101
        2 = 010

        ----
        + 000
         */
        System.out.println(c | d); //cvd disjunkcija (ARBA, |)
          /* & 0 ir 0 = 0, 1 ir 0 = 1, 0 ir 1 = 1, 1 ir 1 = 1
        5 = 101
        2 = 010

        ----
        + 111
         */
        System.out.println(c ^ d); // isskirtinis ARBA
          /* & 0 ir 0 = 0, 1 ir 0 = 0, 0 ir 1 = 0, 1 ir 1 = 0
        5 = 101
        3 = 011

        ----
        + 110
         */
        System.out.println(~c);
        System.out.println(1>>c);
    }
}
