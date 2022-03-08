import java.util.*;

public class SextaClaseCondicionales{
    public static void main(String[] args){

        Scanner intro = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = intro.nextInt();

        while(edad < 1 || edad > 100){

            System.out.println("La edad debe estar comprendida entre 1 y 100 años");
            System.out.print("Introduce tu edad: ");
            edad = intro.nextInt();
        }

        if(edad >= 18){

            System.out.println("Eres mayor de edad");
        }else{

            System.out.println("Eres menor de edad");
        }
    }
}