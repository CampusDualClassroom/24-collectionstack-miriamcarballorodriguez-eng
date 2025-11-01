package com.campusdual.classroom;

import java.util.Stack;

public class Exercise {
    public static Stack<String> createStack() {
        Stack<String> surnames = new Stack<>();

        surnames.push("Smith");
        surnames.push("Montessori");
        surnames.push("Peralta");
        surnames.push("House");

        return surnames;


    }

    public static void printAndEmptyStack(Stack<String> stack) {
        System.out.println("Al inicio de la pila: " + stack.peek());

        while (!stack.isEmpty()) {
            String Surname = stack.pop();
            System.out.println("Procesando y eliminando: " + Surname);
        }

        System.out.println("Pila vacía: " + stack.isEmpty());



    }

    public static void main(String[] args) {
        Stack<String> surname = createStack();
        printAndEmptyStack(surname);

    }



}
