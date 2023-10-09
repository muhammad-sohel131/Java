/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics;

/**
 *
 * @author Sohel
 */
class Generic<T> {
    private T obj;
    Generic(T obj){
        this.obj = obj;
    }
    T getObj(){
        return obj;
    }
    public void showType(){
        System.out.println("Type of T: " + obj.getClass().getName());
    }
}

class Tuple<X,Y>{
    private X x;
    private Y y;
    
    Tuple(X x, Y y){
        this.x = x;
        this.y = y;
    }
    
    X getX(){
        return this.x;
    }
    
    Y getY(){
        return this.y;
    }
    void showTypes(){
        System.out.println("Type of X is " + x.getClass().getName() + " and value: " + x);
        System.out.println("Type of Y is " + y.getClass().getName() + " and value: " + y);
    }
    
}
public class Intro {
    public static void main(String[] args) {
         Generic iObj = new Generic("ok");
         
         Object v = iObj.getObj();
         iObj.showType();
         System.out.println(v);
         
         //tuple class
         Tuple person = new Tuple("Sohel",iObj.getObj());
         person.showTypes();
    }
}
