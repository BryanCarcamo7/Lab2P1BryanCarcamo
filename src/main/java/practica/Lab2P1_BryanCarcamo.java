/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author Bryan Carcamo
 */
public class Lab2P1_BryanCarcamo {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        int opcion=0;
        
        while(opcion!=4){
        
            System.out.println("----MENU------");
            System.out.println("1.Numero Perfecto");
            System.out.println("2.Sumatoria ");
            System.out.println("3.Serie ");
            System.out.println("4.Salir");
            System.out.println("Opcion:");
            opcion=lea.nextInt();
            
            switch(opcion){
            
                case 1:
                    int suma=0;
                    
                    System.out.println("Ingrese n: ");
                    int n=lea.nextInt();
            
                    
                    
                    System.out.print("Divisores: ");
                    for(int divisor=1; divisor<=n;divisor++){
                    if(n%divisor==0){
                        suma+=divisor;
                        System.out.print(divisor+", ");
                        
                        
                    }
                                  
                    }
                   
                     if((suma-n)==n){
                         System.out.println("");
                        System.out.println("Es un numero  perfecto");
                    }else{
                         System.out.println("");
                        System.out.println("Es primo,no se pudo realizar el calculo por falat de divisores ");
                    } 
                    
                    
              break;
                case 2:
                    
                    System.out.println("Ingrese un numero: ");
                    int numero=lea.nextInt();
               
                    int i=0;
                    while(i<=numero){
                    double numerador=2*i-1;
                    double denominador=i*(i+1);
                    double total=(numerador/denominador);
                    
                      System.out.println("Suma total: "+total);      
                    i++;
                    }
                    
                 break;
                case 3:
                    
                    System.out.println("Ingrese un numero: ");
                    int N=lea.nextInt();
                    
                    System.out.println("Ingrese el limite: ");
                    int x=lea.nextInt();
                    
                    i=1;
                  
                    System.out.print("0, 1, ");
                    while(i<=x){
                        
                    int patron=N*-i;
                     
                   System.out.print(patron+",");    
                    i++;
                    }
                  
                break;    
                case 4:System.out.println("Feliz dia");
                break;
            }
        
        }
    }
}
