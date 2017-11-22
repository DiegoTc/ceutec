import java.util.Scanner;
public class Random{
    public static void main(String[] args) {
        /* Generar numeros aleatorios de de 0 a n */
        Scanner sc = new Scanner(System.in);
        int n  = 100;
        for(int i=0;i<5;i++){
            System.out.println((int)(Math.random() * n));
        }

         /* Generar numeros aleatorios de de x a y */
         int min = 50;
         int max = 55;
         for(int i=0;i<5;i++){
            System.out.println((int)(min + (Math.random() * (max - min))));
        }


    }
}