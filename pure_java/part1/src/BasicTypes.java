public class BasicTypes {
    public static void main(String[] args) {
        /*
        Statement: is doing something => They form a complete unit of execution, just like sentences in natural languages
        Expression: evaluates to a single value
        Literal: A constant value that can be assigned to a variable
         */

        int javaMinInt = Integer.MIN_VALUE; // Integer is the wrapper class for the int's (There are more of these for all of 8 primitive types)
        int javaMaxInt = Integer.MAX_VALUE;
        System.out.println(javaMinInt);
        System.out.println(javaMaxInt);



        // Let's try to overflow/underflow the values:
        int javaOverflowedInt = javaMaxInt + 1;
        System.out.println(javaOverflowedInt);

        int javaOverflowedInt2 = javaMaxInt + 2;
        System.out.println(javaOverflowedInt2);

        int javaUnderflowedInt = javaMinInt - 1;
        System.out.println(javaUnderflowedInt);


        // but what if we assign using the literals:
        /*
        int testOverflowWithLiterals = 2147483648; // Maximum int plus one, this will definitely raise an error in compilation
        System.out.println(testOverflowWithLiterals);

         */


        byte javaMinByte = Byte.MIN_VALUE;
        System.out.println(javaMinByte);
        byte javaMaxByte = Byte.MAX_VALUE;
        System.out.println(javaMaxByte);

        short javaMinShort = Short.MIN_VALUE;
        System.out.println(javaMinShort);
        short javaMaxShort = Short.MAX_VALUE;
        System.out.println(javaMaxShort);

        long exampleLongValue = 20L; // This will force java to treat the number as a long not an integer
        System.out.println(exampleLongValue);

        long javaMinLong = Long.MIN_VALUE;
        System.out.println(javaMinLong);
        long javaMaxLong = Long.MAX_VALUE;
        System.out.println(javaMaxLong);

        long someOtherLongNum = 10_233_888_100L;


        int intNumber = (Integer.MIN_VALUE / 2);
        /*
        This will raise an error, since everything that is inside ()
        is going to be treated as int (which clearly does not fit into byteNumber).
        byte byteNumber = (javaMinByte / 2);
        To avoid the mentioned problem, we need to convert (cast) the number into
        byte:
         */
        byte byteNumber = (byte)(javaMinByte / 2);
        System.out.println(byteNumber);



        byte aByteValue = 10;
        short aShortValue = 20;
        int anIntValue = 30;
        long aLongValue = 70000L + 4L *
                (aByteValue + aShortValue + anIntValue);
        System.out.println(aLongValue);
        /*
        The reason why the above code does not raise any error is that
        long data type works quite well with smaller data types...
         */



    }
}
