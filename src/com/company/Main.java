package com.company;

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args)  throws  IOException{
	RectangleArea ra = new RectangleArea() ;
    ra.getDate();
    ra.computeField() ;
    ra.fieldDisplay();
    }
}
