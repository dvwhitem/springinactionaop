
package com.springinaction.springidolaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dv
 */
public class SpringIdolAopMain {

    public static void main(String[] args) throws PerformanceException{
        ApplicationContext ctx = 
                new ClassPathXmlApplicationContext("com/springinaction/springidolaop/spring-idol.xml");
        
        //Performer performer = (Performer) ctx.getBean("audience");
       CriticismEngine criticismEngine = (CriticismEngine) ctx.getBean("criticismEngine");
        
       criticismEngine.getCriticism();
    }
}
