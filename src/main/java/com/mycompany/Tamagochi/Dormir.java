
package com.mycompany.Tamagochi;

import java.util.Timer;
import java.util.TimerTask;

public class Dormir implements State {

    private Tamagochi tamagochiDormido;
 
    public Dormir() {
    }

   @Override
    public void jugar() {
      
    }

    @Override
    public void alimentar() {
        
    }

    @Override
    public void dormir() {
    }

    @Override
    public void saludar() {
          System.out.println("shhh!! silencio por favor.");
    }

    @Override
    public void setTamagochi(Tamagochi tamagochi) {
        this.tamagochiDormido = tamagochi;
        
        Timer timer = new Timer ();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
             Dormir.this.tamagochiDormido.setState(new Alimentar());
            }
        }, 17000);
        
    }
    
}
