
package com.mycompany.Tamagochi;

public class Aburrido implements State {
    private Tamagochi tamagochiAburrido; 

    @Override
    public void jugar() {
        System.out.println("juguemos!!");
        tamagochiAburrido.setState(new Cansado());
    }

    @Override
    public void alimentar() {
        System.out.println("No quiero comer. Quiero jugar!!");
    }

    @Override
    public void dormir() {
          System.out.println("No quiero dormir. Quiero jugar!!");
    }

    @Override
    public void saludar() {
          System.out.println("Hola! ¿Jugamos?");
    }

    @Override
    public void setTamagochi(Tamagochi tamagochi) {
        this.tamagochiAburrido = tamagochi;
    }
    
}