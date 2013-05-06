
package com.springinaction.springidolaop;

/**
 *
 * @author dv
 */
public class Volunteer {
    private String thoughts;
    
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
