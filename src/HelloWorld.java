import javax.naming.spi.DirObjectFactory;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Hello, ");
        System.out.println("World!");

        int myFavoriteNumber = 7;
        String myString = "this is my string";
        
        System.out.println(myString);
//        myString = 'c';
//        myString = 3.14159;
        float myNumber = 3.14f;
        System.out.println(myString);
//        long myNumber = 3.14;
//        long myNumber = 123L;
        System.out.println("myNumber = " + myNumber);
        myNumber = 123;

//        int y = 5;
//        System.out.println(y++);
//        System.out.println(y);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String class = "hello";
        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int)o;

        int x = 4;
        System.out.println("x = " + x);
        x += 5;
        System.out.println("value of x = x+5 is " + x);
        x = 3;
        int y = 4;
        System.out.println("y = " + y);
        System.out.println("value of y = " + y);
        y *= x;
        System.out.println("value of y = y * x is " + y);
        x = 10;
        System.out.println("x = " + x);
        y = 2;
        System.out.println("y = " + y);
        x /= y;
        System.out.println("value of x = x/y is " + x);
        y -= x;
        System.out.println("value of y = y-x is " + y);

        int maxVal = Integer.MAX_VALUE;
        int maxedOut = maxVal + 1;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(maxVal);
        System.out.println(maxedOut);

        int num = 'A';
        System.out.println(num);
        
    }

    
}
