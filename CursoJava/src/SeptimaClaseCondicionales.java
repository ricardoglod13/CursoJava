import java.util.*;

public class SeptimaClaseCondicionales{
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);

        System.out.println("1: Triangulo \n2: Cuadrado \n3: Rectangulo \n4: Circulo");
        System.out.print("Elija una opcion de la figura que desea saber el area: ");
        int op = intro.nextInt();

        byte aux = 0;
        do{
            aux = 0;
            switch (op) {
                case 1:
                    System.out.print("Introduzca la base: ");
                    float num1 = (float)intro.nextDouble();
                    System.out.print("Introduzca la altura: ");
                    float num2 = (float)intro.nextDouble();
                    System.out.println("EL area del triangulo es: " + ((num1 * num2) / 2));
                    break;
            
                default:
                    break;
            }

        }while(aux == 1);
    }
}