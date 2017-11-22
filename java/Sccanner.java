import java.util.Scanner;
public class Sccanner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []persons = new String[5];

        for(int i=0;i<5;i++){
            System.out.print("Enter your complete name: ");
            persons[i]=sc.nextLine();
        }

        for(int i=0;i<5;i++){
            System.out.println("The name is: "+ persons[i]);
        }
    }
}