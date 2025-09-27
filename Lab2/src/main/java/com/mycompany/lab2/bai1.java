/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, x;

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
            x = -b / a;
            System.out.println("pt co nghiem x =" + x);
        }
    }
}

