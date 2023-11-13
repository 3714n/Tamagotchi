package com.mycompany.Tamagochi;


public class Cansado implements State {
private Tamagochi tamagochiCansado;
    public Cansado() {
    }

   @Override
    public void jugar() {
        System.out.println("No quiero jugar. Estoy cansado. Quiero dormir!");
        
    }

    @Override
    public void alimentar() {
        System.out.println("No tengo hambre. Estoy cansado. Quiero dormir!");
    }

    @Override
    public void dormir() {
          System.out.println("Voy a descanzar, chao!!");
          tamagochiCansado.setState(new  Dormir());
    }

    @Override
    public void saludar() {
          System.out.println("Tengo sueño.");
    }

    @Override
    public void setTamagochi(Tamagochi tamagochi) {
        this.tamagochiCansado = tamagochi;
    }
    
}
