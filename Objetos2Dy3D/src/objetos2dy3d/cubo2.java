/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos2dy3d;

/**
 *
 * @author Omar Alejandro Pérez Martínez
 */
public class cubo2 extends Cuadrado {
  public static int[] volumen (int lado){
        int[] valores = calculos(lado);
        int area = valores[1];
        int perimetro = valores[0];
        int volumen = area*lado;
        int[] resultados = {area, perimetro, volumen};
        return resultados;
    }   
}
