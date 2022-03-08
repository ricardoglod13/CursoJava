import java.util.*;

public class CuartaClaseEntrada{
    public static void main(String[] args){
        
        Scanner window = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = window.nextLine();
        System.out.println("Introduce tu edad");
        int edad = window.nextInt();
        System.out.println("Tu nombre es: " + nombre + " y tienes " + edad + " años");
    }
}