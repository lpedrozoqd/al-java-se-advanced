package com.anncode.util.clasesAnidadas;

public class ClaseLocalAlMetodoTester {
    void run(){
        class Local{
            void runLocal(){
                System.out.println("Clase local al método =>Local, método interno=> runLocal, método de la clase=>run");
            }
        }
        Local local = new Local();
        local.runLocal();
    }
    public static void main(String[] args) {
        ClaseLocalAlMetodoTester claseEnMetodo = new ClaseLocalAlMetodoTester();
        claseEnMetodo.run();
    }
}
