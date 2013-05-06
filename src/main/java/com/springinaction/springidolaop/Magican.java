
package com.springinaction.springidolaop;

/**
 *
 * @author dv
 */
public class Magican implements MindReader {
    private String thoughts;
    
    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Interceping volunteer's thoughts");
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
