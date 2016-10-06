/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menu;
import java.util.*;
/**
 *
 * @author alumno
 */
public class FPMenu {
    int m;
    float a;
    a=CalculaAreas(m);
    muestraResultado(a);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void muestraResultado(float area){
        System.out.println("el área es"+ area);
    }
    public static void muestraResultado (float area, int r){
        String figura;
        if(r==1){ figura= "cuadrado";}
        else{
            if(r==2){figura="círculo";}
        
        }
    System.out.println("");
    }
    public static int menu (){
    Scanner entrada= new Scanner(System.in);
    int option;
    do{ 
        System.out.println("Calculo de áreas");
        System.out.println("Menu");
        System.out.println("Introduce la opción deseada");
        System.out.println("1.Área de cuadrados");
        System.out.println("2.Área de círculos");
        System.out.println("3.Área de triangulos");
        System.out.println("0.Salir");
        
      }
   }
}
