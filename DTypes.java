public class DTypes {
    public static void main(String[] args) {
        // primitive datatypes

        // boolean data tye
        // this is not 0 or 1 this is only tru or false
        boolean bo = true;
        System.out.println(bo);

        // number data types

        // allocates one byte memory
        // numeric literals
        byte b = 12;
        System.out.println(b);

        // allocates 2 bytes of memory
        short sh = 130;
        System.out.println(sh);

        // allocates 4 bytes of memory
        // int is the default type for numbers in java
        int i = 465465456;
        System.out.println(i);
        System.out.println(34534534);

        // allocates 8 bytes of memory
        long l = 465465456945l;
        System.out.println(l);

        // numbers with decimol point data types
        // numeric literals with decimol point
        // allocates 4 bytes of memory
        float fl = 123.45f;
        System.out.println(fl);

        // allocates 8 bytes of memory
        // double is the default data type for decimol point numbers in java
        double db = 21344.45345;
        System.out.println(db);

        // textual data types
        // allocates 2 bytes of memory
        // textual literals
        char c = 'a';
        System.out.println(c);

        // String is derived Datatype implemented by java
        // it takes memomy based on the String length
        String str = "This is a String!";
        System.out.println(str);

        // by default numeric literals are base 10 numbersystem
        // we can also use different base system
        // below exacmple shows binary base system - prefix with 0b
        // it prints output as 5
        int binaryNum = 0b101;
        System.out.println(binaryNum);

        // for hexadecimol base system we need to prefix 0x
        // prints 4095 in console
        int hexaDecimolNumber = 0xFFF;
        System.out.println(hexaDecimolNumber);

        // for the benifit of developers java we can add _ in betwwen numbers but in
        // memory it will store only number
        // print 1000000
        int num1 = 1_00_000_0;
        System.out.println(num1);

        // print 123456
        int num2 = 1_23_456;
        System.out.println(num2);

        // epsilon numbers
        double num3 = 12e10;
        System.out.println(num3);

        c++;
        System.out.println(c);
    }
}
