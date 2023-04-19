public class HelloWorld {
    public static void main(String[] args){
        System.out.print("Hello World!");
        System.out.print("Hello World!");
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);
        String myString = "3.14159";
        System.out.println(myString);
        double myNumber = 3.14;
        System.out.println(myNumber);
        int x = 5;
//        System.out.println(x++);//adds +1 after this output prints
//        System.out.println(x);
        System.out.println(++x);//adds +1 before this output prints
        System.out.println(x);
        //class myClass = "hello";
        int y = 4;
        //x = x + 5;
        y += 5;
        System.out.println(y);
        int a = 3;
        int b = 4;
        //b = b * a;
        b *= a;
        System.out.println(a);
        System.out.println(b);
        int c = 10;
        int d = 2;
        //c = c / d;
        //d = d - c;
        c /= d;
        d -= c;
        System.out.println(c);
        System.out.println(d);
        //int bigNumber = 21474836471;
        //System.out.println(bigNumber);//java: integer number too large

    }
}
