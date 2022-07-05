package com.anncode.util.clasesAnidadas;

public class ClasesAnonimasTester {
    public static void main(String[] args) {
        ClasesAnonimas ca = new ClasesAnonimas() {

            @Override
            public void run() {
                System.out.println("ClasesAnonimas!!!");
                
            }
            
        };
    }
}
