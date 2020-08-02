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





        // float and double
        // float: single precision number (occupies 4 Bytes or 32 bits)
        // double: double precision number (64 bits)
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        // int myIntValue = 5.0; // not accepted
        float aFloatValue = 5; // accepted
        double aDoubleValue = 5; // accepted

        // the following is unacceptable since the default floating point value
        // is assumed to be the double (which is bigger than float and cannot be
        // easily cast into a float like this:
        // float otherFloatValue = 5.2;

        // best practice:
        float newFloatValue = 5.2f;
        double newDoubleValue = 5.2d;


        // challenge: how to fix the abovementioned error without using 'f' or 'd' prefixes?
        float someFloat = (float) 5.2; //5.2 is a double cast into float!


        // int, float, and double behavior:
        int a = 1;
        float b = 1f;
        double c = 1d;
        System.out.println(a/3);
        System.out.println(b/3);
        System.out.println(c/3);
        System.out.println(c/3.0);
        System.out.println(c/3.00);
        System.out.println(c/3d);
        System.out.println(c/3f);


        /*
        Using float and double for very precise floating point operations is not
        a good choice, for that, there is a class BigDecimal. 
         */



        // char and boolean
        //chars are 16 byte in Java to allow for unicode characters to be stored
        char myChar = 'd';
        char myUnicodeChar = '\u0044';
        char myCopyrightchar = '\u00A9';
        System.out.println(myUnicodeChar);
        System.out.println(myCopyrightchar);

        String mySentence = "\u00A9 2020";
        System.out.println(mySentence);



        // Strings are immutable!
        /*
        Therefore, appending operations are inefficient in that they should
        create multiple versions of themselves in the middle of the operation,
        The best way to do this is to use "StringBuffers"
         */



        // Expressions vs Statements
        int myInt = 40; // 'myInt = 40' is an expression, however, the entire line would be an statement
        myInt++; // also a complete statement
        System.out.println("this is a complete statement"); // also a complete statement

        // statements don't have to be in one line
        System.out.println("This is " +
                "another " +
                "Statement");

        // two statements in the same line:
        int newVar; newVar = 20;


    }
}
