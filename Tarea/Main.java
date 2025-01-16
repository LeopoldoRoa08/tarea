/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author leopo
 */
public class Main {
    public static void main(String[] args) {
        Fidecomiso fidecomiso = new Fidecomiso("usuario1");
        System.out.println("Balance inicial: " + fidecomiso.getBalance());
        
        fidecomiso.depositar(1000);
        System.out.println("Balance después de depositar 1000: " + fidecomiso.getBalance());
        
        boolean exitoRetiro = fidecomiso.retirar(500);
        System.out.println("Retiro sin iniciar sesión: " + exitoRetiro);
        
        fidecomiso.LogIn("usuario1");
        exitoRetiro = fidecomiso.retirar(500);
        
        System.out.println("Retiro después de iniciar sesión: " + exitoRetiro);
        System.out.println("Balance después de retirar 500: " + fidecomiso.getBalance());
        
        exitoRetiro = fidecomiso.retirar(600);
        System.out.println("Retiro de más de lo disponible: " + exitoRetiro);
        
        System.out.println("Balance final: " + fidecomiso.getBalance());


    }
    
}
