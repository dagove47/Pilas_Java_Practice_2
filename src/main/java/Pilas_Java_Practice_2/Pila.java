/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas_Java_Practice_2;

import javax.swing.*;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Pila {
    private Nodo topNodo;
    private int totalCubiertos = 0;
    private int newCubiertos = 0;
    private int largo = 0;

    public boolean vacia() {
        return this.topNodo == null;
    }

    public void push() {
        Nodo newNodo = new Nodo();
        newNodo.setTraste(addTraste());
        /* Esta variable newCubiertos se va a utilizar en caso de que pidan
         * quitar los ultimos cubiertos que se agregaron */
        this.newCubiertos = addCubiertos();
        newNodo.setCubierto(this.totalCubiertos += this.newCubiertos);

        if(this.topNodo == null) {
            this.topNodo = newNodo;
        } else {
            this.topNodo.setCubierto(0);
            newNodo.setNodoAnterior(this.topNodo);
            this.topNodo = newNodo;
        }
        this.largo++;
    }

    public String listarPila(){
        // Crea una copia de la pila.
        String listaFinal = "";

        // Recorre la pila hasta el ultimo node.
        if(!vacia()) {
            System.out.println(this.topNodo.getTraste());
            Nodo aux = this.topNodo;
            while(aux != null){
                listaFinal += aux.getTraste() + " con " + aux.getCubierto() +
                        " cubiertos\n";
                aux = aux.getNodoAnterior();
            }
        }
        return listaFinal;
    }

    public String addTraste() {
        int loop = 0;
        String trasteSelect = "";
        while(loop == 0) {
            int numTraste = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite el numero del tipo de traste sucio que desea " +
                            "agregar:\n\n" +
                            "1- Plato\n"+
                            "2- Vaso\n\n"));
            switch(numTraste) {
                case 1:
                    trasteSelect = "Plato";
                    loop = 1;
                    break;
                case 2:
                    trasteSelect = "Vaso";
                    loop = 1;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "El numero incorrecto\n" +
                                    "El numero que digito no pertenece a ninguno de " +
                                    "los trastes sucios\n");
                    break;
            }
        }
        return trasteSelect;
    }

    public int addCubiertos() {
        int loop = 0;
        int numCubiertos = 0;
        while(loop == 0) {
            numCubiertos = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite la cantidad de cubiertos que vienen con el traste " +
                            "sucio\n\n"));
            if(numCubiertos >= 0) {
                loop = 1;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Numero invalido\n" +
                                "Digite un numero mayor o igual a cero\n\n");
            }
        }
        return numCubiertos;
    }
    
}
