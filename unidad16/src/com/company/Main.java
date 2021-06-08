package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String usuario;
        String senha;
        do {
            System.out.println("digite seu usuario:");
            Scanner scan = new Scanner(System.in);
            usuario = scan.nextLine();
            System.out.println("digite sua senha:");
            senha = scan.nextLine();
            if (usuario.equals(senha)) {
                System.out.println("usuario e senha invalidos!");

            }
        } while (usuario.equals(senha)) ;
            System.out.println("seu usuario e senha estao corretos!");

        }
    }
