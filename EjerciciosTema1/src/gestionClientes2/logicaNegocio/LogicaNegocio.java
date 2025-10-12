/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionClientes2.logicaNegocio;

import gestionClientes2.dto.Cliente;
import java.util.List; 
import java.util.ArrayList; 

/**
 *
 * @author manu
 */


public class LogicaNegocio {
    
    protected List<Cliente> listaClientes = new ArrayList<>(); 

    public void aniadirCliente (Cliente c) {
        listaClientes.add(c); 
    }  
    
    public List getClientsList() {
        return listaClientes; 
    }
    
}
