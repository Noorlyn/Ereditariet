
public class Main
{
    public static void main ( String[] args)
    {
        Veicolo[] garage = new Veicolo[100];
        int count = 0;
        
        garage[count++] = new Veicolo("Aprilla", "Graziella");               //il [count++] viene fatto alla fine, incrementando count
        garage[count++] = new Veicolo("S-WORKS", "SL7"); 
        garage[count++] = new Moto( "Honda","CRF",450);
        garage[count++] = new Auto("BMV", "M3", 1800);

        for(int i = 0; i < count; i++)
        {
            System.out.println(garage[i]);
        }

    }
        
}