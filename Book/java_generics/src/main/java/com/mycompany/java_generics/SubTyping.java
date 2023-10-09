/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_generics;
import java.util.Arrays;
import java.util.StringJoiner;

/**
 *
 * @author Sohel
 */

class DynamicArray<T>{
    private static final int DEFAULT_CAPACITY = 10;
    private T[] elements;
    private int size;
    
    DynamicArray(){
        elements = (T[]) new Object[DEFAULT_CAPACITY];
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size == 0;
    }
    void add(T item){
        if(size == elements.length){
            grow();
        }
        elements[size] = item;
        size++;
    }
    private void grow(){
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
    
    T get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        
        return elements[index];
    }
    
    @Override
    public String toString(){
        StringJoiner joiner = new StringJoiner(", ");
        
        for(int i = 0; i < size; i++){
            T element = elements[i];
            joiner.add(String.valueOf(element));
        }
        
        return joiner.toString();
    }
}
public class SubTyping {
    public static void main(String[] args) {
        DynamicArray<Integer> numbers = new DynamicArray();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        
        //create string array
        DynamicArray cities = new DynamicArray();
        cities.add(1);
        cities.add("Dhaka");
        cities.add("New York");
        
        
        Object v = cities.get(0);
        int x = Integer.parseInt(v.toString())+1;
        
        System.out.println(x);
        
        System.out.println(cities);
    }
}
//we can add number, stringt into daynamic array, but the are added as instance of Object class