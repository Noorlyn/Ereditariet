public class Moto extends Veicolo{
    
    int cilindrata;

    public Moto (String marca, String modello, int cilindrata)
    {
        
        super(marca, modello);
        this.cilindrata = cilindrata;

    }
    @Override
    public String toString()
    {
        return "Sono una moto " + marca + " / " + modello + " / " + cilindrata;
    }
}
