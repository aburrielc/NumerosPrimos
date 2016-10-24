package numerosprimos;

import java.util.Scanner;

public class NumerosPrimos {
    
    public static int SiguientePrimo(int num){
        
        int primo = 0;
        boolean esPrimo = true;
        
        for(int i = (num+1);esPrimo == true;i++){
            if(ComprobarPrimo(i)){
                esPrimo = false;
                primo = i;
            }
        }
        
        return primo;
    }
    
    //Devuelve true si el número es primo, false en caso contrario.
    public static boolean ComprobarPrimo(int num){
        
        boolean primo = true;
        
        for(int i=2;i<num;i++){
            if(num % i == 0){
               primo = false;
               i = num + 1;
            }
        }       
        return primo;
    }

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numero = 0;
        boolean bandera = true;
        
        while(bandera){
            
            System.out.println("Introduzca un número");
            numero = leer.nextInt();
            
            if(numero != 0){
                
                if(ComprobarPrimo(numero)){
                System.out.println("El número " + numero + " es primo");
                }else{
                System.out.println("El número " + numero +" no es primo");
                }
            
                System.out.println("El siguiente número primo es: " + SiguientePrimo(numero));
                System.out.println("");
                
            }else{
                
                bandera = false;
            }
        }
    }
    
}
