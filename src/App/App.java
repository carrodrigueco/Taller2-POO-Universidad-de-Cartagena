//AnguloMelgarejo_AdrianAlberto_0222310042_Taller#1 
//MolinaRomero_SamuelDavid_0222310022_Taller#1
//RodriguezCochero_CarlosArturo_0222310027_Taller#1
//Conseguido pero a que costo?
package App;

import FigurasGeometricas.Circulo;
import FigurasGeometricas.Pentagono;
import FigurasGeometricas.Cuadrado;
import FigurasGeometricas.Triangulo;
import Funciones.Validadores;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App 
{
    
    public static void main(String[] args) 
    { 
        Triangulo array_triangulo[];
        Cuadrado array_cuadrado[];
        Pentagono array_pentagono[];
        Circulo array_circulo[];      
        
        int i;
        
        int id_actual;
        Color color_actual;
        
        int lado1;
        int lado2;
        int lado3;
        int lado4;
        int lado5;
        
        int entradas_triangulo = 0;
        int entradas_cuadrado = 0;
        int entradas_pentagono = 0;
        int entradas_circulo = 0;
        
        try
        {
            File file = new File("data\\data.txt"); //TENER ACCESO AL ARCHIVO
            BufferedReader br = new BufferedReader(new FileReader(file));//MANEJO MEMORIA
            String line; //VARIABLE PARA MANIPULAR CADA LINEA DEL ARCHIVO
            //LEER EL ARCHIVO HASTA QUE NO HAYAN MÁS LINEAS

            while((line = br.readLine())!= null)
            {
                //RECORTAR LA INFORMACIÓN
                String [] str = line.split(";");
                
                //MANIPULAR DATOS
                if(str[0].equals("Triangulo"))
                {
                    entradas_triangulo++;
                }
                else if(str[0].equals("Cuadrado"))
                {
                    entradas_cuadrado++;
                }
                else if(str[0].equals("Pentagono"))
                {
                    entradas_pentagono++;
                }
                else if(str[0].equals("Circulo"))
                {
                    entradas_circulo++;
                }
            }
        }
	catch(IOException e)
        {
            System.out.println(e);
	}
        
        
        array_triangulo = new Triangulo[entradas_triangulo];
        array_cuadrado = new Cuadrado[entradas_cuadrado];
        array_pentagono = new Pentagono[entradas_pentagono];
        array_circulo = new Circulo[entradas_circulo];
        
        try
        {
            File file = new File("data\\data.txt"); //TENER ACCESO AL ARCHIVO
            BufferedReader br = new BufferedReader(new FileReader(file));//MANEJO MEMORIA
            String line; //VARIABLE PARA MANIPULAR CADA LINEA DEL ARCHIVO
            //LEER EL ARCHIVO HASTA QUE NO HAYAN MÁS LINEAS

            while((line = br.readLine())!= null)
            {
                //RECORTAR LA INFORMACIÓN
                String [] str = line.split(";");
                
                if(Integer.parseInt(str[2]) == 1)
                {
                    color_actual = Color.red;
                }
                else if(Integer.parseInt(str[2]) == 2)
                {
                    color_actual = Color.blue;
                }
                else
                {
                    color_actual = Color.yellow;
                }
                
                //MANIPULAR DATOS
                if(str[0].equals("Triangulo"))
                {
                    id_actual = Integer.parseInt(str[1]);
                
                    lado1 = Integer.parseInt(str[3]);
                    lado2 = Integer.parseInt(str[4]);
                    lado3 = Integer.parseInt(str[5]);
                    
                    if(Validadores.validar_id(id_actual) || !(Validadores.validar_triangulo(lado1, lado2, lado3)))
                    {
                       continue;
                    }
                    
                    array_triangulo[Validadores.cont_triangulos] = new Triangulo(color_actual, id_actual, lado1, lado2, lado3);
                }
                else if(str[0].equals("Cuadrado"))
                {
                    id_actual = Integer.parseInt(str[1]);
                    
                    lado1 = Integer.parseInt(str[3]);
                    lado2 = Integer.parseInt(str[4]);
                    lado3 = Integer.parseInt(str[5]);
                    lado4 = Integer.parseInt(str[6]);
                    
                    if(Validadores.validar_id(id_actual) || !(Validadores.validar_cuadrado(lado1, lado2, lado3, lado4)))
                    {
                       continue;
                    }
                    
                    array_cuadrado[Validadores.cont_cuadrados] = new Cuadrado(color_actual, id_actual, lado1, lado2, lado3, lado4);

                }
                else if(str[0].equals("Pentagono"))
                {
                    id_actual = Integer.parseInt(str[1]);
                    
                    lado1 = Integer.parseInt(str[3]);
                    
                    if(Validadores.validar_id(id_actual) || !(Validadores.validar_pentagono(lado1)))
                    {
                       continue;
                    }
                    
                    array_pentagono[Validadores.cont_pentagonos] = new Pentagono(color_actual, id_actual, lado1);
                }
                else if(str[0].equals("Circulo"))
                {
                    id_actual = Integer.parseInt(str[1]);
                    lado1 = Integer.parseInt(str[3]);
                    
                    if(Validadores.validar_id(id_actual) || lado1 == 0)
                    {
                       continue;
                    }
                    
                    array_circulo[Validadores.cont_circulos] = new Circulo(color_actual,id_actual,lado1);
                    Validadores.new_circulo();
                }
                
            }
        }
	catch(IOException e)
        {
            System.out.println(e);
	}
       
        boolean intercambio;

        do 
        {
            intercambio = false;
            for (i = 0; i < Validadores.cont_triangulos - 1; i++) {
                if (array_triangulo[i].getArea() > array_triangulo[i + 1].getArea()) 
                {
                    Triangulo temp = array_triangulo[i];
                    array_triangulo[i] = array_triangulo[i + 1];
                    array_triangulo[i + 1] = temp;
                    intercambio = true;
                }
            }
        } while (intercambio);
        
        do 
        {
            intercambio = false;
            for (i = 0; i < Validadores.cont_cuadrados - 1; i++) {
                if (array_cuadrado[i].getArea() > array_cuadrado[i + 1].getArea()) 
                {
                    Cuadrado temp = array_cuadrado[i];
                    array_cuadrado[i] = array_cuadrado[i + 1];
                    array_cuadrado[i + 1] = temp;
                    intercambio = true;
                }
            }
        } while (intercambio);
        
        do 
        {
            intercambio = false;
            for (i = 0; i < Validadores.cont_pentagonos - 1; i++) {
                if (array_pentagono[i].getArea() > array_pentagono[i + 1].getArea()) 
                {
                    Pentagono temp = array_pentagono[i];
                    array_pentagono[i] = array_pentagono[i + 1];
                    array_pentagono[i + 1] = temp;
                    intercambio = true;
                }
            }
        } while (intercambio);
        
        do 
        {
            intercambio = false;
            for (i = 0; i < Validadores.cont_circulos - 1; i++) {
                if (array_circulo[i].getArea() > array_circulo[i + 1].getArea()) 
                {
                    Circulo temp = array_circulo[i];
                    array_circulo[i] = array_circulo[i + 1];
                    array_circulo[i + 1] = temp;
                    intercambio = true;
                }
            }
        } while (intercambio);
        
        for(i = 0; i < Validadores.cont_triangulos; i++)
        {
            System.out.println("Triangulo ("+array_triangulo[i].getId()+")");
            
                if(array_triangulo[i].getColor() == Color.red)
                {
                    System.out.println("Rojo");
                }
                else if(array_triangulo[i].getColor() == Color.blue)
                {
                    System.out.println("Azul");
                }
                else
                {
                    System.out.println("Amarillo");
                }
            
            System.out.println(array_triangulo[i].getArea()+"\n");
        }
        
        for(i = 0; i < Validadores.cont_cuadrados; i++)
        {
            System.out.println("Cuadrado ("+array_cuadrado[i].getId()+")");
            
                if(array_cuadrado[i].getColor() == Color.red)
                {
                    System.out.println("Rojo");
                }
                else if(array_cuadrado[i].getColor() == Color.blue)
                {
                    System.out.println("Azul");
                }
                else
                {
                    System.out.println("Amarillo");
                }
            
            System.out.println(array_cuadrado[i].getArea()+"\n");
        }
        
        for(i = 0; i < Validadores.cont_pentagonos; i++)
        {
            System.out.println("Pentagono ("+array_pentagono[i].getId()+")");
            
                if(array_pentagono[i].getColor() == Color.red)
                {
                    System.out.println("Rojo");
                }
                else if(array_pentagono[i].getColor() == Color.blue)
                {
                    System.out.println("Azul");
                }
                else
                {
                    System.out.println("Amarillo");
                }
            
            System.out.println(array_pentagono[i].getArea()+"\n");
        }
        
        for(i = 0; i < Validadores.cont_circulos; i++)
        {
            System.out.println("Circulo ("+array_circulo[i].getId()+")");
            
                if(array_circulo[i].getColor() == Color.red)
                {
                    System.out.println("Rojo");
                }
                else if(array_circulo[i].getColor() == Color.blue)
                {
                    System.out.println("Azul");
                }
                else
                {
                    System.out.println("Amarillo");
                }
            
            System.out.println(array_circulo[i].getArea()+"\n");
        }
    }
}