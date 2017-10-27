public class Funciones{

    public static int suma(int a, int b){
        return a +b;
    }

    public static double sumaDecimal(double a, double b){
        return a +b;
    }

    public static void mostrarResultadosResta(int a, int b){
        int restaFuncion =  a-b;
        System.out.println(a + " - " + b + " = "+ restaFuncion);
    }

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


        System.out.println("La suma de 56 + 56 = "+suma(56,56));
        System.out.println("La suma decimal de 456.33 + 456.23 = "+sumaDecimal(456.33,456.23));
        mostrarResultadosResta(345,45);
    }

}