/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class RunSemana8 {
    
    public static void  main(String[] args){
        
        ArrayList<Transportes> tra = new ArrayList<Transportes>();
        
        tra.add(new Automovil(100, 50));
        tra.add(new Avion(800, 200));
        tra.add(new Barco(300, 200));
        tra.add(new Helicoptero(500, 200));
        for(Transportes tr : tra )
        {
       System.out.println(tr.getClass().toString());
          tr.encender();
          tr.acelerar();
          
        }
    
    }
}