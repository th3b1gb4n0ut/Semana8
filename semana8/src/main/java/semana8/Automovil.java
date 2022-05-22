/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana8;

/**
 *
 * @author user
 */
public class  Automovil extends Transportes{

public Automovil(int velocidad, int gas){
    super(velocidad, gas);
}
    
    @Override
    public void encender() {
        System.out.println("El nivel de gasolina es " + gas);
    }

    @Override
    public void acelerar() {
        System.out.println("La velocidad es: " + velocidad);
    }
    
   

   }
