
package com.mycompany.Tamagochi;

import java.util.Scanner;

public class Menu {
    Tamagochi tamagochi;
    
    public Menu (Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }
    
    public void display (){
        Scanner scanner = new Scanner(System.in);
        char opcion;
        String mensaje = "Realiza una accion; \n" +
                "a) Alimentar \n" +
                "b) Dormir \n" +
                "c) Jugar \n" +
                "d) Saludar \n" ;
        
        while (true) {
            System.out.println(mensaje);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'a' :  tamagochi.alimentar();
                break;
                case 'b' :  tamagochi.dormir();
                break;
                case 'c' :  tamagochi.jugar();
                break;
                case 'd' :  tamagochi.Saludar();
                break;
                default: System.out.println("Opcion no valida");
                   
            }
            
            
        }
    }
}
