/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_generics;

/**
 *
 * @author Sohel
 */
class Statistics<T extends Number>{
    private final T[] numbers;
    Statistics(T[] numbers){
        this.numbers = numbers;
    }
    
    double average(){
        double sum = 0;
        for(T number : numbers){
            sum += number.doubleValue();
        }
        
        return sum / numbers.length;
    }
}
public class BoundedType {
    public static void main(String[] args) {
        Integer[] nums = {2,3,54,2};              
        Statistics st = new Statistics(nums);
        double avg = st.average();
        System.out.println(avg);
    }
}
