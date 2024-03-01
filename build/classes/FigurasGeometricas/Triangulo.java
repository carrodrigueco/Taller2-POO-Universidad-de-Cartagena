//AnguloMelgarejo_AdrianAlberto_0222310042_Taller#1 
//MolinaRomero_SamuelDavid_0222310022_Taller#1
//RodriguezCochero_CarlosArturo_0222310027_Taller#1
package FigurasGeometricas;
import java.awt.Color;

public class Triangulo {
    
    //Atributos
    private java.awt.Color Color;
    protected int id;
    
    protected double Lado1;
    protected double Lado2;
    protected double Lado3;

    protected double Area;
    protected double Perimetro;
    
    public Triangulo(Color Color, int id, double Lado1, double Lado2, double Lado3) 
    {
        this.Color = Color;
        this.id = id;
        this.Lado1 = Lado1;
        this.Lado2 = Lado2;
        this.Lado3 = Lado3;
    }
    
    public Triangulo() 
    {
        this.Color = null;
        this.id = 0;
        this.Lado1 = 0;
        this.Lado2 = 0;
        this.Lado3 = 0;
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

    public void setLado1(double Lado1) 
    {
        this.Lado1 = Lado1;
    }

    public void setLado2(double Lado2) 
    {
        this.Lado2 = Lado2;
    }

    public void setLado3(double Lado3) 
    {
        this.Lado3 = Lado3;
    }
    
    //Metodos
    public double AreaTriangulo() 
    {
        double s = (Lado1 + Lado2 + Lado3)/2;
        Area = Math.sqrt(s * (s - Lado1) * (s - Lado2) * (s - Lado3));
        return Area;
    }
    
    public double PerimetroTriangulo() 
    {
        Perimetro = Lado1 + Lado2 + Lado3;
        return Perimetro;
    }

}