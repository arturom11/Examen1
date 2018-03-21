/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Orden {
    private List<DetalleOrden> items;
    private Date creacion;
    private Date envio;
    private int id;
    /*Constructor*/
    public Orden(int id, Date creacion){
        this.id=id;
        this.creacion=creacion;
        this.items= new ArrayList<>();
    }
    /*Metodos*/
    public int getNroItems(){
        return items.size();
    }
    public void agregarItem(DetalleOrden detalle){
        items.add(detalle);
    }

    /**
     * @param envio the envio to set
     */
    public void setEnvio(Date envio) {
        this.envio = envio;
    }
    public float calcularTotalOrden(){
        float preciototal=0;
        for (DetalleOrden i : items){
            preciototal=preciototal+i.getPreciounitario()*i.getCantidad(); 
        }
        return preciototal;
    }
}
