public class Operaciones{
    public static void main(String[] args) {
        int a,b;
        double a1,b1;
        char sexo;
        String nombre;

        a=4;
        b=5;
        a1 = 4;
        b1 = 5;
        sexo = 'F';
        nombre = "Anabel";

        System.out.println("Valor de la variable a: " + a);
        System.out.println("Valor de la variable b: " + b);
        System.out.println("Valor de la variable a1: " + a1);
        System.out.println("Valor de la variable b1: " + b1);
        System.out.println("Valor de la variable sexo: " + sexo);
        System.out.println("Valor de la variable nombre: " + nombre);

        int suma = a + b;
        int resta =  a-b;
        int division = a/b;

        double sumaDecimal = a1 + b1;
        double restaDecimal = a1- b1;
        double divisionDecimal = a1/b1;

        System.out.println("La suma de a + b = " + suma);
        System.out.println("La resta de a - b = " + resta);
        System.out.println("La division de a / b = " + division);
        System.out.println("La suma de a1 + b1 = " + sumaDecimal);
        System.out.println("La resta de a1 - b1 = " + restaDecimal);
        System.out.println("La division de a1 - b1 = " + divisionDecimal);

    }

}