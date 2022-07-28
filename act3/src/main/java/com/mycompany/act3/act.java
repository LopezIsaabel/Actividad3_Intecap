/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.act3;

import java.util.Scanner;

/**
 *
 * @author izabe
 */
public class act {

    private void menu() {

        Act3 cuenta1 = new Act3();
        Act3 cuenta2 = new Act3();

        while (true) {
            Scanner sp = new Scanner(System.in);
            System.out.println("**********MENU**********");
            System.out.println("1. Mostrar saldos");
            System.out.println("2. Abonar cuentas");
            System.out.println("3. Debitar cuentas");
            System.out.println("4. Cerrar");
            System.out.println("************************");
            int resp = sp.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("Saldo de la cuenta 1 Q" + cuenta1.getCuenta());
                    System.out.println("Saldo de la cuenta 2 Q" + cuenta2.getCuenta());
                    break;
                case 2:
                    Scanner sx = new Scanner(System.in);
                    System.out.println("Desea abonar a la cuenta 1 o cuenta 2?");
                    int rcuenta = sx.nextInt();
                    if (rcuenta == 1) {
                        System.out.println("Ingrese el valor a abonar: ");
                        int abono=cuenta1.getCuenta()+sx.nextInt();
                        cuenta1.setCuenta(abono);
                    } else {
                        System.out.println("Ingrese el valor a abonar: ");
                        int abono=cuenta2.getCuenta()+sx.nextInt();
                        cuenta2.setCuenta(abono);
                    }
                    break;
                case 3:
                    Scanner sx1 = new Scanner(System.in);
                    System.out.println("Desea debitar a la cuenta 1 o cuenta 2?");
                    int rcuenta1 = sx1.nextInt();
                    if (rcuenta1 == 1) {
                        System.out.println("Ingrese el valor a debitar: ");
                        int debito=cuenta1.getCuenta()-sx1.nextInt();
                        cuenta1.setCuenta(debito);
                    } else {
                        System.out.println("Ingrese el valor a debitar: ");
                        int debito=cuenta2.getCuenta()-sx1.nextInt();
                        cuenta2.setCuenta(debito);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        act ej = new act();
        ej.menu();
    }

}
