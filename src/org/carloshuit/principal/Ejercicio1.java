package org.carloshuit.principal;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String args[]){
        //saludame();
        //int a = Integer.parseInt(JOptionPane.showInputDialog
        //("ingresa un número"));
        //int b = Integer.parseInt(JOptionPane.showInputDialog
        //("ingresa otro número"));
        //suma(a,b);
        //System.out.println(suma(a,b));
        mayorQueCero();
                
    }
    public static void saludame(){
        String nombre=JOptionPane.showInputDialog("¿Cómo te llamas?","");
        System.out.println("Hola "+" "+nombre);
    }
    public static int suma(int a, int b){
        return a+b;
    }
    public static void mayorQueCero(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingresa numero"));
        if(numero>0){
            System.out.println("Es mayor a cero");
        }else{
            System.out.println("Es menor a cero");
        }
    }
}
