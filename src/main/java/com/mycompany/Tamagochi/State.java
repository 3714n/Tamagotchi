
package com.mycompany.Tamagochi;


public interface State {
    void jugar();
    void alimentar();
    void dormir();
    void saludar();
    
    void setTamagochi(Tamagochi tamagochi);
    
}
