
package org.example;

import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Число a ");
                int a = sc.nextInt();

                System.out.println("Число b ");
                int b = sc.nextInt();

                System.out.println("Число c ");
                int c = sc.nextInt();

                int d = b * b - 4 * a * c;

                if (d > 0) {
                    int x1 = (int) (-b + Math.sqrt(d)) / 2 * a;
                    int x2 = (int) (-b - Math.sqrt(d)) / 2 * a;
                    System.out.println("Два корня: x1 = " + x1 + ", x2 = " + x2);
                }
                if (d == 0) {
                    int x1 = (int) (-b + Math.sqrt(d)) / 2 * a;
                    int x2 = (int) (-b - Math.sqrt(d)) / 2 * a;
                    System.out.println("Один корень: x1 = " + x1);
                }
                if (d < 0) {
                    System.out.println("Нет корней");
                }
            }
        }