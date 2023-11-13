
package com.mycompany.Tamagochi;


public class Alimentar implements State {

    private Tamagochi tamagochiAlimentar;

    public Alimentar() {
        
    }

      @Override
    public void jugar() {
        System.out.println("Tengo hambre!!");
        
    }

    @Override
    public void alimentar() {
        System.out.println("ñam, ñam, ñam!!");
        tamagochiAlimentar.setState(new Aburrido());
    }

    @Override
    public void dormir() {
          System.out.println("No quiero dormir. Quiero Comer!!");
    }

    @Override
    public void saludar() {
          System.out.println("Hola! !Tengo hambre!");
    }

    @Override
    public void setTamagochi(Tamagochi tamagochi) {
        this.tamagochiAlimentar = tamagochi;
    }
    
}
