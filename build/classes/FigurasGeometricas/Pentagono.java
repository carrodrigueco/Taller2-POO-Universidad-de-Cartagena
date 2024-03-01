//AnguloMelgarejo_AdrianAlberto_0222310042_Taller#1 
//MolinaRomero_SamuelDavid_0222310022_Taller#1
//RodriguezCochero_CarlosArturo_0222310027_Taller#1
package FigurasGeometricas;
import java.awt.Color;


public class Pentagono 
{
    //Atributos
    private java.awt.Color Color;
    protected int id;
    
    protected double Lado1;
    protected double Lado2;
    protected double Lado3;
    protected double Lado4;
    protected double Lado5;
    
    
    protected double Area;
    protected double Perimetro;
    
    public Pentagono(Color Color, int id, double Lado1, double Lado2, double Lado3, double Lado4, double Lado5) 
    {
        this.Color = Color;
        this.id = id;
        this.Lado1 = Lado1;
        this.Lado2 = Lado2;
        this.Lado3 = Lado3;
        this.Lado4 = Lado4;
        this.Lado5 = Lado5;
    }
    
    public Pentagono()
    {
        this.Color = null;
        this.id = 0;
        this.Lado1 = 0;
        this.Lado2 = 0;
        this.Lado3 = 0;
        this.Lado4 = 0;
        this.Lado5 = 0;
    }

    public Color getColor() 
    {
        return Color;
    }
    public int getId()
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
    
    public void setColor(Color Color) 
    {
        this.Color = Color;
    }

    public void setLado(double Lado) 
    {
        this.Lado = Lado;
    }
    
    //Metodos
    public double AreaPentagono() 
    {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Lado * Lado;
    }

    public double PerimetroPentagono() 
    {
        return 5 * Lado;
    }


}