/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                    System.out.println("pt vo nghiem:");
                }
            } else {
                double x = -c / b;
                System.out.println("ptbac nhat co nghiem x =" + x);
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
                System.out.println("pt co 2 nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}

