public class SegundaClaseMath{
    public static void main(String[] args){
        double num = 2.4;
        
        double raiz = Math.sqrt(num);
        System.out.println("La raiz cuadrada es: " + raiz);

        int resultado = (int)Math.round(num); //Refundicion
        System.out.println("El redondeo es: " + resultado);
    }
}