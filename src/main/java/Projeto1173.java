/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author victo
 */
import java.util.Scanner;

public class Projeto1173 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int X[] = new int[10];

        X[0] = leitor.nextInt();

        for (int i = 1; i < 10; i++) {
            X[i] = X[i - 1] * 2;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + X[i]);
        }
    }
}
