public class IntOps {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int suma  = a + b;
        int multi = a * b;
        int division = a / b;


        System.out.println(a + " + " + b + " = " + suma);
        System.out.println(a + " * " + b + " = " + multi);
        System.out.println(a + " / " + b + " = " + division);


    }
}
