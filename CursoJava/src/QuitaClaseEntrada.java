import javax.swing.*;

public class QuitaClaseEntrada{
    public static void main(String[] args){

        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        String edad = JOptionPane.showInputDialog("Introduce tu edad");
        int edad_usu = Integer.parseInt(edad);
        System.out.println("Tu nombre es " + nombre + " y tendras " + (edad_usu+1) + " años el año que viene");
    }
}