package com.company;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        String phrase1 = sc.nextLine();
        System.out.println("Where are you live, " + phrase1);
        String phrase2 = sc.nextLine();
        System.out.println("My name is " + phrase1 + " I live in " + phrase2);
    }
}