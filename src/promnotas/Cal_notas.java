/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promnotas;

/**
 *
 * @author ESTUDIANTE
 */
public class Cal_notas {
    
    private double Promedio, Notas[], mu1;                  //Definimos las variables que se usaran dentro de la clase para 
    private int NotSobre_Prom, NotBajo_Prom;                //que esta pueda hacer los calculos y retornar los valores nesesarios
    
    
    public Cal_notas(){
    }
    
    public Cal_notas(double Notas[]) {                      // creamos el constructor paea poder llamar y usar nuestro vector en
        this.Notas = Notas;                                 // el main
    }
    
    public void set_Calcular(){                             //usamos un set para realizar todos los calculo pertinentes y llenar
        Promedio=0;                                         //cada variable en espesifico con los valores a los que queremos
        for (int i=0;i<Notas.length;i++){                   //llegar y poderlor retornanr despues
            //Promedio=Promedio+(Notas[i]/Notas.length);
            mu1=mu1+Notas[i];                               //calculamos el promedio
        }
        Promedio=mu1/Notas.length;
        
        for (int i=0;i<Notas.length;i++){                   
            if(Notas[i]>=Promedio){                         //calculamos las notas sobre el promedio y debajo de este
                NotSobre_Prom++;
            }else{
                NotBajo_Prom++;
            }
        }
        
    }
    
    public double getPromedio(){                            //retornamos todos los valores obtenidos 
        return Promedio;                                    // el promedio
    }
    public int getNotSobre_Prom(){
        return NotSobre_Prom;                               //notas sobre el promedio
    }
    public int getNotBajo_Prom(){
        return NotBajo_Prom;                                //notas bajo el promedio
    }
    
    
    
}
