/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Pilas_Java_Practice_2;

import javax.swing.*;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Pilas_Java_Practice_2 {
    
    public static void main(String[] args) {
        Pila pila = new Pila();
        int loop = 0;
        while(loop == 0) {
            int addTrastes = JOptionPane.showConfirmDialog(null,
                    pila.listarPila() + "\n" +
                            "Desea agregar mas trastes sucios a la pila?",
                    "Question",JOptionPane.YES_NO_OPTION);
            switch(addTrastes) {
                case 0:
                    pila.push();
                    break;
                default:
                    loop = 1;
                    break;
            }
        }
        System.exit(0);
    }
}