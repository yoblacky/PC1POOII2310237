import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            double cuenta = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Para cuántos días tienes cifras de ventas?");
            int days = sc.nextInt();
            if(days > 1){

                for (int c=1; c <= days; c++){
                    System.out.println("Ingrese las ventas para el día " + c + ": ");
                    double ventas = sc.nextInt();
                    cuenta = ventas + cuenta;
                }
                System.out.println("La ventas totales son S/." + cuenta);
            }
        }
        catch(Exception e){
                System.out.println("Disculpa, el número ingresado es incorrecto. Ingrese un número mayor o igual a 1.");
        }
    }
}
