/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clasescanner;

import java.util.Scanner;

/**
 *
 * @author vic759
 */
public class ClaseScanner {
    
    public static void main(String args[]) {
        
        // Clase que permite obtener valores desde la consola de Java
        Scanner scanner = new Scanner(System.in); // Con System.in indicamos que vamos a leer información de la consola
        
        // Obtiene el valor capturado por el objeto de tipo Scanner
        System.out.println("Ingrese el nombre de Usuario: ");
        var usuario = scanner.nextLine();
        
        System.out.println("Usuario: " + usuario);
        
        // Obtiene el valor capturado por el objeto de tipo Scanner
        System.out.println("Ingrese el código del Usuario: ");
        var codigo = scanner.nextInt();
        
        System.out.println("Código Usuario: " + codigo);
    }
}
