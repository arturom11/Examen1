/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author Alumno
 */
public class DetalleOrden {
    private Notebook item;
    private float preciounitario;
    private int cantidad;
    
    /*Constructores*/
    public DetalleOrden(Notebook item, float preciounitario, int cantidad){
        this.cantidad=cantidad;
        this.preciounitario=preciounitario;
        this.item=item;
    }

    /**
     * @return the item
     */
    public Notebook getItem() {
        return item;
    }

    /**
     * @return the preciounitario
     */
    public float getPreciounitario() {
        return preciounitario;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }
    
}
