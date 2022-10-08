/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas_Java_Practice_2;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Nodo {
    
    private String traste;
    private int cubierto;
    private Nodo nodoAnterior;
    
    public Nodo() {
        this.nodoAnterior = null;
    }
    
    public Nodo getNodoAnterior() {
        return nodoAnterior;
    }
    
    public String getTraste() {
        return traste;
    }
    
    public int getCubierto() {
        return cubierto;
    }
    
    public void setNodoAnterior(Nodo nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
    
    public void setTraste(String traste) {
        this.traste = traste;
    }
    
    public void setCubierto(int cubierto) {
        this.cubierto = cubierto;
    }
}
