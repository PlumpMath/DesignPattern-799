package com.example.designpattern.abstractfactory;

import android.app.Application;
import android.graphics.Color;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application>  {

    public ApplicationTest() {
        super(Application.class);
    }


    public void testAbstractFactory(){
        IThemeFactory a1 =  ConcreteFactory.getInsance().get("red");
        assertEquals(a1.getBackgroundColor().getColor(), Color.RED);
        assertEquals(a1.getItemBackgroundColor().getItemColor(), Color.RED);
        assertEquals(a1.getTextColor().getTextColor(), Color.BLACK);
        IThemeFactory a2 =  ConcreteFactory.getInsance().get("blue");
        assertEquals(a2.getBackgroundColor().getColor(), Color.BLUE);
        assertEquals(a2.getItemBackgroundColor().getItemColor(), Color.BLUE);
        assertEquals(a2.getTextColor().getTextColor(), Color.WHITE);
    }
}