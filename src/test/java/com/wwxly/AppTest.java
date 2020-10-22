package com.wwxly;

import static org.junit.Assert.assertTrue;

import com.wwxly.domain.Lover;
import com.wwxly.service.LoverService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void test01(){
        String config="Application.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        LoverService ls= (LoverService) ctx.getBean("LoverService");
        Lover lover=ls.selectLover(2);
        System.out.println(lover);
    }
}
