//AnguloMelgarejo_AdrianAlberto_0222310042_Taller#1 
//MolinaRomero_SamuelDavid_0222310022_Taller#1
//RodriguezCochero_CarlosArturo_0222310027_Taller#1
package FigurasGeometricas;
import java.awt.Color;

public class Circulo 
{
    
    //Atributos
    private java.awt.Color Color;
    protected int id;
    protected double pi = 3.14;
    protected double LongitudDiametro;
    
    protected double Area;
    protected double Perimetro;
    
    //Constructor
    public Circulo(Color color, int id, double LongitudDiametro) 
    {
        this.Color = color;
        this.id = id;
        this.LongitudDiametro = LongitudDiametro;
    }
    
    public Circulo() 
    {
        this.Color = null;
        this.id = 0;
        this.LongitudDiametro = 0;
    }

    public Color getColor() 
    {
        return Color;
    }
    
    public int getId()
    {
        return id;
    }
    
    public double getPi()
    {
        return pi;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
    
    public void setColor(Color Color) 
    {
        this.Color = Color;
    }

    public void setLongitudDiametro(double LongitudDiametro) 
    {
        this.LongitudDiametro = LongitudDiametro;
    }
    
    
    //Metodos
    public double AreaCirculo() 
    {
        Area = (pi/4) * (LongitudDiametro*LongitudDiametro);
        return Area;
    }
    
    public double PerimetroCirculo() 
    {
        Perimetro = pi* LongitudDiametro;
        return Perimetro;
    }
}