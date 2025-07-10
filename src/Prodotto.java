import java.util.Random;

public class Prodotto {
    
    
    //Attribbuti della classe Prodotoo
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public int iva;

    //Costruttore 
    public Prodotto(String nome, String descrizione, double prezzo, int iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(10000);
    }

    //Metodi
    public double getPrezzoBase() {
        return prezzo;
    }


    public double getPrezzoConIva() {
        return prezzoConIva = prezzo + (prezzo * iva / 100);
    }


    public String getNomeEsteso() {
        return codice + "-" + nome;
    }






}
