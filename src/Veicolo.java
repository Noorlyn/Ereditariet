public class Veicolo
{
    String marca, modello; 

    public Veicolo(String marca, String modello)
    {
        this.marca = marca;
        this.modello = modello;
    }

    @Override
    public String toString()
    {
        return "Sono un veicolo " + marca + " / " + modello;
    }
}