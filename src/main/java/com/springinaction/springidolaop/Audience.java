
package com.springinaction.springidolaop;

/**
 *
 * @author dv
 */
public class Audience implements Performer {
    
    public Audience() {}

    public void takeSeats() { // Перед выступлением
        System.out.println("The audience is taking their seats.");
    }
    
    public void turnOffCellPhones() { // Перед выступлением
        System.out.println("The audience is turning off their cellphones");
    }
    
    public void applaud() {  // После выступления
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }
    
    public void demandRefund() { // После неудачного выступления
        System.out.println("Boo! We want our money back!");
    }

    @Override
    public void perform() throws PerformanceException {
    }
}
