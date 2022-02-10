package javaProgram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countRows = scanner.nextInt();
        String[][] nameAndResult = new String[countRows][2];
        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < 2; j++) {
                nameAndResult[i][j] = scanner.next();
            }
        }
        String[] winName = new String[countRows];
        int count = 0;
        for (int k = 0; k < countRows; k++) {
            if (nameAndResult[k][1].equals("win")) {
                winName[count] = nameAndResult[k][0];
                count++;
            }
        }
        for (int l = 0; l < count; l++) {
            System.out.println(winName[l]);
        }
        System.out.println(count);
    }

}