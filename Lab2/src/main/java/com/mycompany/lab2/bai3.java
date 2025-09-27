/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soDien;
        int tien;

        System.out.print("so dien su dung trong thang: ");
        soDien = sc.nextInt();

        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }

        System.out.println("tien dien phai tra: "+tien+" dong");
    }
}

