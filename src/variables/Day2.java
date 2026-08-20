package variables;

public class Day2 {

    public static void main(String[] args) {

        Demo d1 = new Demo();
        d1.printVariable(90);
    }
}

class Demo
{
    int  a;
    int b;

    static int c = 10;

    public void printVariable(int num)
    {
        num = 20;
        System.out.println(num);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
}
