import java.util.Scanner;
public class HolaMundo{

    public static void main(String args[]){

        System.out.println("Hola Mundo");
        Scanner in = new Scanner(System.in);
        String nombre;

        System.out.println("Como te llamas?");
        nombre = in.nextLine();

        System.out.println("Hola "+nombre);


        in.close();
    }
    

}