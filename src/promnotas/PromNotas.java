/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promnotas;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class PromNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Sc = new Scanner(System.in);                // definimos las variables que se usaran dentro del main
        int NTot_notas, i;
        
             
        
        System.out.println("cuantas notas desea ingresar??? ");
        NTot_notas= Sc.nextInt();                           // pedimos al tamaño del vector
        
        double MNotas[] = new double[NTot_notas];           // definimos el tamaño del vector
        
        for(i=0; i<(NTot_notas); i++){                      // llenamos el vector 
        System.out.println("ingresa la nota del estudiante numero "+(i+1));
        MNotas[i]=Sc.nextDouble();
        }
        
        
        Cal_notas obj1 =new Cal_notas(MNotas);              //llamamos e isntanciamos las partes de nuestra clase para 
        obj1.set_Calcular();                                //poder ejecutarlas con los valores obtenido en el main
        
        System.out.println("");                             //mostramos los resultado a los que llegamos
        System.out.println("");                             
        System.out.println("el promedio de las notas ingresada es de "+obj1.getPromedio()); 
        System.out.println(""); 
        System.out.println("hay "+obj1.getNotSobre_Prom()+" por encima del promedio"); 
        System.out.println("y"); 
        System.out.println("hay "+obj1.getNotBajo_Prom()+" por debajo del promedio");        
    }
    
}
