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
public class Notebook {
    private String marca;
    private String modelo;
    private String procesador;
    private float tamañoDisco;
   /*Constructores*/ 
    public Notebook(String marca,String modelo, String procesador, float tamañoDisco){
        this.modelo=modelo;
        this.marca=marca;
        this.procesador=procesador;
        this.tamañoDisco=tamañoDisco;
    }
    /*Metodos*/
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @return the procesador
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * @return the tamañoDisco
     */
    public float getTamañoDisco() {
        return tamañoDisco;
    }
}
