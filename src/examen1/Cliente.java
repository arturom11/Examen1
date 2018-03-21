/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Cliente {
    private String nombre;
    private int dni;
    private List<Orden> ordenes;
    /*Constructor*/
    public Cliente(String nombre,int dni){
        this.nombre=nombre;
        this.dni=dni;
        this.ordenes=new ArrayList<>();
    }
    
    /*Metodos*/
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }
    
    public void addOrden(Orden o){
        ordenes.add(o);
    }
}
