/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai4 {

    static Scanner sc = new Scanner(System.in);

    static void giaiPTB1() {
        double a, b;
        System.out.print("nhap a: ");
        a = sc.nextDouble();
        System.out.print("nhap b: ");
        b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("pt co vo so nghiem:");
            } else {
                System.out.println("pt vo nghiem:");
            }
        } else {
            double x = -b / a;
            System.out.println("pt co nghiem x =" + x);
        }
    }
    static void giaiPTB2() {
        double a, b, c;
        System.out.print("nhap a: ");
        a = sc.nextDouble();
        System.out.print("nhap b: ");
        b = sc.nextDouble();
        System.out.print("nhap c: ");
        c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("pt co vo so nghiem:");
                } else {
                    System.out.println("pt co vo so nghiem:");
                }
            } else {
                double x = -c / b;
                System.out.println("pt bac nhat(a=0) co nghiem x= " + x);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("pt vo nghiem:");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("pt co nghiem kep x =" + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("pt co 2 nghiem pb:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

    static void tinhTienDien() {
        int soDien;
        int tien;
        System.out.print("nhap so dien su dung trong thang:");
        soDien = sc.nextInt();

        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        System.out.println("tien dien phai tra: " + tien +" dong");
    }

    static void menu() {
        int chon;
        do {
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. giai pt bac nhat");
            System.out.println("2. giai pt bac 2");
            System.out.println("3. tinh tien dien");
            System.out.println("4. ket thuc");
            System.out.println("+---------------------------------------------------+");
            System.out.print("chon cn: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("ket thuc ct:");
                    break;
                default:
                    System.out.println("lua chon khong hop le, vui long chon lai:");
            }
            System.out.println();
        } while (chon != 4);
    }

    public static void main(String[] args) {
        menu();
    }
}

