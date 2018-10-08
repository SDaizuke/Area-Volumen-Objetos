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
public class Cuadrado {
    public static int[] calculos (int lado){
        int perimetro = 0;
        int area = 0;
        perimetro = 4*lado;
        area = lado*lado;
        int[] resultados = {perimetro, area};
        return resultados;
    }
}
