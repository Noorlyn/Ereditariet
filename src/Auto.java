public class Auto extends Veicolo {
    int cilindrata;

    public Auto (String marca, String modello, int cilindrata)
    {
        super(marca, modello);
        this.cilindrata = cilindrata;
    }
    @Override
    public String toString()
    {
        return "Sono una auto " + marca + " / " + modello + " / " + cilindrata;
    }
}
