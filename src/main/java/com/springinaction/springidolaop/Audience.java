
package com.springinaction.springidolaop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 *
 * @author dv
 */
public class Audience implements Performer {
    
    public Audience() {}
    
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones");
            long start = System.currentTimeMillis(); // Перед выступлением
            
            joinPoint.proceed();
            
            long end = System.currentTimeMillis(); // После выступления
            System.out.println("CLAP CLAP CLAP CLAP CLAP");
            System.out.println("The performance took " + (end - start) + " milliseconds.");
        } catch(Throwable t) {
            System.out.println("Boo! We want our money back!");
        }
    }

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
