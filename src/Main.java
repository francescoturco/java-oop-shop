public class Main {
    public static void main(String[] args) throws Exception {
        
        Prodotto prodotto1 = new Prodotto();
        prodotto1.nome = "LG NanoCell Smart TV";
        prodotto1.descrizione = "LG Smart Tv 4K 65 pollici";
        prodotto1.iva = 22;
        prodotto1.prezzo = 980.99;

        System.out.println("Il codice del prodotto è: " + prodotto1.codice);
        System.out.println("Il prezzo è:" + prodotto1.prezzoBase());
        System.out.println(String.format("Il prezzo finale con Iva è %.2f", prodotto1.prezzoConIva()));
        System.out.println(prodotto1.nomeEsteso());





    }
}
