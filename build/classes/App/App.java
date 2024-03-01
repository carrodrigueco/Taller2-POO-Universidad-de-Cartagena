//AnguloMelgarejo_AdrianAlberto_0222310042_Taller#1 
//MolinaRomero_SamuelDavid_0222310022_Taller#1
//RodriguezCochero_CarlosArturo_0222310027_Taller#1
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
        Triangulo ph_triangulo = new Triangulo();
        Cuadrado ph_cuadrados = new Cuadrado();
        Pentagono ph_pentagono = new Pentagono();
        Circulo ph_circulo = new Circulo();        
        
        int[] ids_registrados = new int[1000];
        
        int id_actual;
        int color_actual;
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
        
        Triangulo[] array_triangulo = new Triangulo[entradas_triangulo];
        Cuadrado[] array_cuadrado = new Cuadrado[entradas_cuadrado];
        Pentagono[] array_pentagono = new Pentagono[entradas_pentagono];
        Circulo[] array_circulo = new Circulo[entradas_circulo];
        
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
                    id_actual = Integer.getInteger(str[1]);
                    color_actual = Integer.getInteger(str[2]);
                    lado1 = Integer.getInteger(str[3]);
                    lado2 = Integer.getInteger(str[4]);
                    lado3 = Integer.getInteger(str[5]);
                    
                    if(Validadores.validar_id(ids_registrados, id_actual) || !(Validadores.validar_triangulo(lado1, lado2, lado3)))
                    {
                       continue;
                    }
                    
                    array_triangulo[Validadores.cont_triangulos].setId(id_actual);
                    
                    if(color_actual == 1)
                    {
                        array_triangulo[Validadores.cont_triangulos].setColor(Color.red);
                    }
                    else if(color_actual == 2)
                    {
                        array_triangulo[Validadores.cont_triangulos].setColor(Color.blue);
                    }
                    else
                    {
                        array_triangulo[Validadores.cont_triangulos].setColor(Color.yellow);
                    }
                    
                    array_triangulo[Validadores.cont_triangulos].setLado1(lado1);
                    array_triangulo[Validadores.cont_triangulos].setLado2(lado2);
                    array_triangulo[Validadores.cont_triangulos].setLado3(lado3);
                }
                else if(str[0].equals("Cuadrado"))
                {
                    id_actual = Integer.getInteger(str[1]);
                    color_actual = Integer.getInteger(str[2]);
                    lado1 = Integer.getInteger(str[3]);
                    lado2 = Integer.getInteger(str[4]);
                    lado3 = Integer.getInteger(str[5]);
                    lado4 = Integer.getInteger(str[6]);
                    
                    if(Validadores.validar_id(ids_registrados, id_actual) || !(Validadores.validar_cuadrado(lado1, lado2, lado3, lado4)))
                    {
                       continue;
                    }
                    
                    array_cuadrado[Validadores.cont_cuadrados].setId(id_actual);
                    
                    if(color_actual == 1)
                    {
                        array_cuadrado[Validadores.cont_cuadrados].setColor(Color.red);
                    }
                    else if(color_actual == 2)
                    {
                        array_cuadrado[Validadores.cont_cuadrados].setColor(Color.blue);
                    }
                    else
                    {
                        array_cuadrado[Validadores.cont_cuadrados].setColor(Color.yellow);
                    }
                    
                    array_cuadrado[Validadores.cont_cuadrados].setLado1(lado1);
                    array_cuadrado[Validadores.cont_cuadrados].setLado2(lado2);
                    array_cuadrado[Validadores.cont_cuadrados].setLado3(lado3);
                    array_cuadrado[Validadores.cont_cuadrados].setLado4(lado4);
                }
                else if(str[0].equals("Pentagono"))
                {
                    id_actual = Integer.getInteger(str[1]);
                    color_actual = Integer.getInteger(str[2]);
                    lado1 = Integer.getInteger(str[3]);
                    lado2 = Integer.getInteger(str[4]);
                    lado3 = Integer.getInteger(str[5]);
                    lado4 = Integer.getInteger(str[6]);
                    lado5 = Integer.getInteger(str[7]);
                    
                    if(Validadores.validar_id(ids_registrados, id_actual) || !(Validadores.validar_pentagono(lado1, lado2, lado3, lado4, lado5)))
                    {
                       continue;
                    }
                    
                    array_pentagono[Validadores.cont_pentagonos].setId(id_actual);
                    
                    if(color_actual == 1)
                    {
                        array_pentagono[Validadores.cont_pentagonos].setColor(Color.red);
                    }
                    else if(color_actual == 2)
                    {
                        array_pentagono[Validadores.cont_pentagonos].setColor(Color.blue);
                    }
                    else
                    {
                        array_pentagono[Validadores.cont_pentagonos].setColor(Color.yellow);
                    }
                    
                    array_pentagono[Validadores.cont_pentagonos].setLado1(lado1);
                    array_pentagono[Validadores.cont_pentagonos].setLado2(lado2);
                    array_pentagono[Validadores.cont_pentagonos].setLado3(lado3);
                    array_pentagono[Validadores.cont_pentagonos].setLado4(lado4);
                    array_pentagono[Validadores.cont_pentagonos].setLado5(lado5);
                }
                else if(str[0].equals("Circulo"))
                {
                    id_actual = Integer.getInteger(str[1]);
                    color_actual = Integer.getInteger(str[2]);
                    lado1 = Integer.getInteger(str[3]);
                    
                    if(Validadores.validar_id(ids_registrados, id_actual) || lado1 == 0)
                    {
                       continue;
                    }
                    
                    array_circulo[Validadores.cont_circulos].setId(id_actual);

                    
                    if(color_actual == 1)
                    {
                        array_circulo[Validadores.cont_circulos].setColor(Color.red);
                    }
                    else if(color_actual == 2)
                    {
                        array_circulo[Validadores.cont_circulos].setColor(Color.blue);
                    }
                    else
                    {
                        array_circulo[Validadores.cont_circulos].setColor(Color.yellow);
                    }
                    
                    array_circulo[Validadores.cont_circulos].setLongitudDiametro(lado1);
                    
                }
                
            }
        }
	catch(IOException e)
        {
            System.out.println(e);
	}
       
    }
}