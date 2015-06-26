package com.example.designpattern.abstractfactory;

import com.example.designpattern.abstractfactory.blue.BlueThemeFactory;
import com.example.designpattern.abstractfactory.red.RedThemeFactory;

public class ConcreteFactory {

    private  ConcreteFactory(){
    }

    private static class  SingletonHolder{
        private  static ConcreteFactory instance = new ConcreteFactory();
    }

    public static ConcreteFactory getInsance(){
        return SingletonHolder.instance;
    }

    public IThemeFactory get(String type){
        switch (type){
            case "red":
                return new RedThemeFactory();
            case "blue":
                return new BlueThemeFactory();
            default:
                return null;
        }
    }
}
