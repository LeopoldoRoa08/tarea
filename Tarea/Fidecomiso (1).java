/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leopo
 */
public class Fidecomiso implements EspecificacionCuentaBancaria {
    private String usuarioAutorizado;
    private int balance;
    private String loggedIn;
    
    public Fidecomiso(String usuarioAutorizado){
        this.usuarioAutorizado=usuarioAutorizado;
        this.balance=0;
        loggedIn=null;
    }

    public int getBalance() {
        return balance;
    }

  
    
    public void LogIn(String usuario){
        loggedIn=usuario;
    }
    
    @Override
    public void depositar(int monto) {
        balance += monto;
    }
    
    @Override
    public boolean retirar(int monto){
    if(usuarioAutorizado.equals(loggedIn)){
        balance -= monto;
        return true;
    }else{
        return false;
    }    
    }
}