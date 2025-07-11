import java.util.Random;

public class Prodotto {
    
    
    //Attribbuti della classe Prodotoo
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public int iva;

    //Costruttore 
    public Prodotto() {
        Random rand = new Random();
        this.codice = rand.nextInt(10000);
    }

    

    //Metodi
    public double prezzoBase() {
        return prezzo;
    }


    public double prezzoConIva() {
        return prezzoBase() + (prezzoBase() * iva / 100);
    }


    public String nomeEsteso() {
        return this.codice + "-" + this.nome;
    }






}
