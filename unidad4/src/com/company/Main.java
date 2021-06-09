package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean nomeTeste2 = false;
        String[] nomeTeste = new String[3];
        boolean idadeTeste2 = false;
        boolean salarioTeste2 = false;
        boolean sexoTeste2 = false;
        boolean estadoCivilTeste2 = false;

        while(true) {
            System.out.println("Digite seu nome:");
            Scanner myobj = new Scanner(System.in);
            String nome = myobj.next();

            if (nome.length() > nomeTeste.length) {
                System.out.println("Dado válido");
                nomeTeste2 = true;
                break;
            }
            System.out.println("Dado inválido, tente novamente!");
        }
        while (!idadeTeste2) {
            System.out.println("Digite sua idade:");
            Scanner scan = new Scanner(System.in);
            int idadeTeste = scan.nextInt();

            for (int i=0; i<=150; i++) {
                if (idadeTeste == i) {
                    idadeTeste2 = true;
                    break;
                }
            }
            if(idadeTeste2) {
                System.out.println("Dado válido");
                break;
            }
            System.out.println("Dado inválido, tente novamente!");
        }
        while (!salarioTeste2) {
            System.out.println("Qual o seu sexo?");
            Scanner scan = new Scanner(System.in);
            char sexoTeste = scan.next().charAt(0);


            switch(sexoTeste) {
                case 'F' : { sexoTeste2 = true; }
                case 'f' : { sexoTeste2 = true; }
                case 'M' : { sexoTeste2 = true; }
                case 'm' : { sexoTeste2 = true; }
            }
            if (sexoTeste2) {
                System.out.println("Dado válido");
                break;
            }
            System.out.println("Dado inválido");
        }
        while (!estadoCivilTeste2) {
            System.out.println("Qual o seu estado civil?");
            Scanner scan = new Scanner (System.in);
            char estadoCivilTeste = scan.next().charAt(0);

            switch (estadoCivilTeste) {
                case 's' : {
                    estadoCivilTeste2 = true;
                }
                case 'c' : {
                    estadoCivilTeste2 = true;
                }
                case 'v' : {
                    estadoCivilTeste2 = true;
                }
                case 'd' : {
                    estadoCivilTeste2 = true;
                }
                case 'S' : {
                    estadoCivilTeste2 = true;
                }
                case 'C' : {
                    estadoCivilTeste2 = true;
                }
                case 'V' : {
                    estadoCivilTeste2 = true;
                }
                case 'D' : {
                    estadoCivilTeste2 = true;
                }
            }
            if (estadoCivilTeste2) {
                System.out.println("Dado válido");
                break;
            }
            System.out.println("Dado inválido!");
        }

        System.out.println("Todas as suas informações estão válidas.");
    }
}


