/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

/**
 *
 * @author Rac28
 */
public class Validadores 
{
    public static int actual_id = 0;
    public static int cont_triangulos = 0;
    public static int cont_circulos = 0;
    public static int cont_cuadrados = 0;
    public static int cont_pentagonos = 0;
    
    public static boolean validar_id(int array_ids_registrados[], int id)
    {
        /*
            Funcion Validadora de un id en el array de ids
            Devuelve false si no se encuentra
            Devuelve true si se encuentra
        */
        int i;
        for(i = 0; i < actual_id+1; ++i)
        {
            if(id == array_ids_registrados[i])
            {
                return true;
            }
        }
        
        array_ids_registrados[actual_id] = id;
        ++actual_id;
        return false;
    }
    
    public static boolean validar_triangulo(int Lado1, int Lado2, int Lado3)
    {
        /*
            Funcion Validadora de que 3 lados formen un triangulo
            Devuelve false si no forman un triangulo
            Devuelve true si si los forman
        */
        if(Lado1 == 0 || Lado2 == 0 || Lado3 == 0)
        {
            return false;
        }
        
        if( (Lado1 < Lado2 + Lado3) || (Lado1 + Lado3 < Lado2) || (Lado1 + Lado2 < Lado3))
        {
            return false;
        }
        
        ++cont_triangulos;
        return true;
    }
    
    public static boolean validar_cuadrado(int Lado1, int Lado2, int Lado3, int Lado4)
    {
        /*
            Funcion Validadora de que 4 lados formen un cuadrado
            Devuelve false si no forman un triangulo
            Devuelve true si si los forman
        */
        
        if((Lado1 != Lado2) || (Lado1 != Lado3) || (Lado1 != Lado4))
        {
            return false;
        }
        
        ++cont_cuadrados;
        return true;
    }
    
    public static boolean validar_pentagono(int Lado1, int Lado2, int Lado3, int Lado4, int Lado5)
    {
        /*
            Funcion Validadora de que 5 lados formen un pentagono
            Devuelve false si no forman un triangulo
            Devuelve true si si los forman
        */
        System.out.println("Pentagono Validado");
        ++cont_pentagonos;
        return true;
    }
    
    
}
