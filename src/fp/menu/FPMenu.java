/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menu;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class FPMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int opcion;
        double a;
        opcion=menu(); //declaracion e inicializacion de variables
        a=calculaArea(opcion);    //Ejecucion de metodo con variable opcion
        muestraResultado(a,opcion);
    
        /*forma 2 en caso de no querer que en el Resultado aparezca el nombre
        de la figura*/
        muestraResultado(calcularArea(menu()));
    }
    public static void muestraResultado(double area){
        System.out.println("el area es: "+area);
    }
    
    public static void muestraResultado(double area, int r){
        String figura;
        if (r==1){ figura="cuadrado";}
        else{
            if (r==2){figura="circulo";}
            else{
                figura = "triangulo";
            }
        }
        System.out.println("El area del "+ figura+" es igual a: "+area);
    }
    public static int menu(){   /*Despliega menu y se ejecuta bajo las
                                condiciones dadas*/
        int opcion;
        do{
            Scanner entrada = new Scanner(System.in);
            System.out.println("**** Cálculo de áreas ****");
            System.out.println("**** Menú: ****");
            System.out.println("Introduzca la opción deseada: ");
            System.out.println("1. Área de cuadrados");
            System.out.println("2. Área de círculos");
            System.out.println("3. Área de triángulos");
            System.out.println("0. Salir");
            opcion=entrada.nextInt();
            
        }while (opcion<0 || opcion >3);
        return opcion;
    }    
    
   public static double calcularArea(int opcion){ /*Metodo para eleccion del
        proceso a ejecutar*/
       double area;
        switch (opcion){
           case 1:
               area = areaCuadrado();
               break;
           case 2:
               area = areaCirculo();
               break;
           case 3:
               area = areaTriangulo();
               break;
           default:
               mensajeSalida();
               area=0;
       }
       return area;
   }       
  
   public static double areaCuadrado(){ /*Metodo para calcular el area del
       cuadrado con un dato que se solicita aqui mismo
       */
       double area, dato;
       Scanner teclado = new Scanner(System.in);
       System.out.println("Introduce la medida del lado");
       dato = teclado.nextDouble();
       area=(dato*dato);
       
       return area;
   }
   public static double areaCirculo(){ /*Metodo para calcular area del circulo 
       con el radio solicitado aqui mismo y utilizando funcion Math.PI
       */
       double area;
       double dato;
       Scanner teclado = new Scanner(System.in);
       System.out.println("Introduce la medida del radio");
       dato = teclado.nextDouble();
       area=Math.pow((dato*Math.PI),2);
      
       return area;
   } 
   public static double areaTriangulo(){ /*Metodo para calcular el area del
       triangulo pidiendo datos de area y altura 
       */
       double area, altura, base;
       Scanner teclado = new Scanner(System.in);
       System.out.println("Introduce la altura del triangulo");
       altura=teclado.nextDouble();
       System.out.println("Introduce la base del triangulo");
       base=teclado.nextDouble();
       area=(altura*base)/2;
       
       return area;
   }
   public static void mensajeSalida(){ //Metodo para el mensaje de salida
       System.out.println("Gracias por participar");
   }
    
    
}
