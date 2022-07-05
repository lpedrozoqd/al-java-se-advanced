package com.anncode.util.clasesAnidadas;

public class EnclosingTester {
    private static int x = 1;
    public static class StaticNested{
        private void run(){
            System.out.println("Class =>StaticNested, method=> run");
        }
    }
    public static void main(String[] args) {
        EnclosingTester.StaticNested nested = new EnclosingTester.StaticNested();
        nested.run();
    }    
}
