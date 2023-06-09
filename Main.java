package com.stunnedjava;

public class Main  {
    public static class CalculteArea implements Area{

        @Override
        public void circleArea() {
           double result = 3.14*12*12;
            System.out.println("Area of the circle is "+result);
        }
    }
    public static void main(String[] args) {
	    CalculteArea area = new CalculteArea();
        area.circleArea();
    }
}
