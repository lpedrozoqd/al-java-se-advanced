package com.anncode.util.clasesAnidadas;

public class ClaseAnidadInnerTester {
    public class Inner{

    }
    public static void main(String[] args) {
        ClaseAnidadInnerTester outer = new ClaseAnidadInnerTester();
        ClaseAnidadInnerTester.Inner inner = outer.new Inner();

    }
}
