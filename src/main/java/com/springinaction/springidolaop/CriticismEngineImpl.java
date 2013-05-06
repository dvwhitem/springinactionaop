
package com.springinaction.springidolaop;

/**
 *
 * @author dv
 */
public class CriticismEngineImpl implements CriticismEngine {

    public CriticismEngineImpl() {}

    @Override
    public String getCriticism() {
        int i = (int) (Math.random() * criticismPool.length);
        
        return criticismPool[i];
    }
   
    // Внедренее
    private String[] criticismPool;

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }
}
