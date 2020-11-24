package com.company;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int op;
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println("PILAS Y COLAS");
            System.out.println("1. COLAS");
            System.out.println("2. PILAS");
            System.out.println("0. SALIR");
            op = scanner.nextInt();
            switch (op){
                case 1:
                {
                    LinkedList cola = new LinkedList();
                    for (int i = 1 ;i<11;i++)
                        cola.offer(i);
                    System.out.println(cola);
                    int menu;

                    do {
                        System.out.println("1. eliminar primer numero");
                        System.out.println("0, SALIR");
                        menu = scanner.nextInt();
                        switch (menu){
                            case 1:
                            {
                                cola.remove();
                                System.out.println(cola);
                            }break;
                        }

                    }while (menu !=0);
                }break;
                case 2:{
                    Stack<Integer> pila = new Stack<Integer>();
                    for (int i=1; i<11; i++){
                        pila.push(i);

                    }
                    System.out.println(pila);
                    int menu1;
                    do {
                        System.out.println("1. eliminar ultimo numero");
                        System.out.println("0, SALIR");
                        menu1 = scanner.nextInt();
                        switch (menu1){
                            case 1:{
                                pila.pop();
                                System.out.println(pila);
                            }
                        }

                    }while (menu1 != 0);



                }break;
            }

        }while (op!=0);



    }
}
