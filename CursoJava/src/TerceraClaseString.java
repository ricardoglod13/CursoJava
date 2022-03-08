public class TerceraClaseString{
    public static void main(String[] args){
        String cadena = "Hola esta es una prueba de string";
        String cadena2 = "Segunda cadena";
        System.out.println("Esto es una cadena de caracteres (" + cadena + ")");
        System.out.println("La 4° letra de esta cadena es la " + cadena.charAt(3));
        System.out.println("La cadena tiene " + cadena.length() + " letras");
        System.out.println("La 5° palabra de la cadena es " + cadena.substring(17,23));

        boolean compara = cadena.equals(cadena2);
        if (compara == true) {
            System.out.println("La primera cadena es igual a la segunda");
        }else{
            System.out.println("La primera cadena es diferente a la segunda");
        }
    }
}