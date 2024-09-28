// package BitwiseOperator;
// convert string to binary 



// new java 101  created 

public class BinaryString { 
        public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(Integer.toBinaryString(a ^ b));
        System.out.println(Integer.toBinaryString(~a));
        System.out.println(Integer.toBinaryString(a << 2));
        System.out.println(Integer.toBinaryString(a >> 2));
        System.out.println(Integer.toBinaryString(a >>> 2));
    }
}
