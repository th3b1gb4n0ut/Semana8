/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8;

/**
 *
 * @author user
 */
public abstract class Transportes {
    
public int velocidad, gas;

public  Transportes(int velocidad, int gas){
    this.velocidad  = velocidad;
    this.gas = gas;
    
    
}

public  void acelerar(){
    
    System.out.println("Transpoter acelerando" + velocidad);

    
}

public abstract void encender();
    
    private String marca;   
    private String modelo;

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void acelerar(int gas){
        
        if(gas > 10)
        {       
        System.out.println("El vehiculo ha avanzado ");
        
        }        
    }
}

