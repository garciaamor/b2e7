
package boletin2_8;

import java.util.Scanner;


public class Boletin2_8 {

   //comentario para ejercicio de pull
    public static void main(String[] args) {
       float nom, interes, anos, t, potencia, renda;
        Scanner obx= new Scanner(System.in);
        System.out.println("introduce el nominal del prestamo : ");
        nom=obx.nextFloat();
        System.out.println ("introduce el interes anual : ");
        interes=obx.nextFloat();
        System.out.println("introduce el numero de años : ");
        anos=obx.nextFloat();
        t= anos*12;
        potencia= (float) Math.pow((1+interes/100), t);
        renda=(nom*(potencia)*interes/100)/(potencia-1);
        System.out.println("La renta mensual a pagar es de : "+ renda +" euros ");
    }
    
}
