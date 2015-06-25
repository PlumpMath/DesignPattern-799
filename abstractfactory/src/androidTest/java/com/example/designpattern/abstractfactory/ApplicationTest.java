package com.example.designpattern.abstractfactory;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application>  {

    public ApplicationTest() {
        super(Application.class);
    }


    public void testAbstractFactory(){
        ThemeFactory a1 =  ConcreteFactory.getInsance().get("1");
        System.out.println(a1.getBackgroundColor().getColor());
        System.out.println(a1.getItemBackgroundColor().getItemColor());
        ThemeFactory a2 =  ConcreteFactory.getInsance().get("2");
        System.out.println(a2.getBackgroundColor().getColor());
        System.out.println(a2.getItemBackgroundColor().getItemColor());
    }
}