/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class MatematikaBeraksi extends MatematikaCanggihBeraksi{
    private int x, y;
    
    public MatematikaBeraksi(){
        x = 7;
        y = 5;
    }
    public MatematikaBeraksi (int x, int y) {
        x = 7;
        y = 5;  
    }
     int add(int x, int y) {
        return x + y;
    }
   int multiply(int a, int b) {
        return a * b;
    }
   int modulus(int a, int b) {
        return a % b;
    }
}
