package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] fline = new String[5];
        for (int i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in);
            fline[i] = in.nextLine();

        }
        int i = 1;
        do {
            if (fline[i - 1].length() > fline[i].length()) {
                String temp = fline[i];
                fline[i] = fline[i - 1];
                fline[i - 1] = temp;
                i = 1;
            } else{
                i++;
            }
        } while (i < 5);
        for (int j = 0; j < 5; j++){
            System.out.println(fline[j]);
        }

    }
}
