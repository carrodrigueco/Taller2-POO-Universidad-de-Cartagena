//AnguloMelgarejo_AdrianAlberto_0222310042_Taller#1 
//MolinaRomero_SamuelDavid_0222310022_Taller#1
//RodriguezCochero_CarlosArturo_0222310027_Taller#1
package FigurasGeometricas;
import java.awt.Color;


public class Cuadrado 
{
    //Atributos
    private java.awt.Color Color;
    protected int id;
    
    protected double Lado;
    
    protected double Area;
    protected double Perimetro;
    
    public Cuadrado(Color Color, int id, double Lado1, double Lado2, double Lado3, double Lado4) 
    {
        this.Color = Color;
        this.id = id;
        this.Lado = Lado;
    }
    
    public Cuadrado() 
    {
        this.Color = null;
        this.id = 0;
        this.Lado = 0;
    }
 
    public Color getColor() 
    {
        return Color;
    }
    
    public int getId()
    {
        return id;
    }

    public double getArea() {
        return Area;
    }

    public double getPerimetro() {
        return Perimetro;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
    
    public void setColor(Color Color) 
    {
        this.Color = Color;
    }

    public void setLado1(double Lado) 
    {
        this.Lado = Lado;
    }

    
    //Metodos
    public double AreaCuadrado() 
    {
        Area = Lado * Lado;
        return Area;
    }

    public double PerimetroCuadrado() 
    {
        Perimetro = Lado * 4;
        return Perimetro;
    }

}