public class Main {
    public static void main(String[] args) throws Exception {

        Prodotto prodotto1 = new Prodotto(
            "LG NanoCell Smart TV",
            "LG Smart Tv 4K 65 pollici",
            980.99,
            22
        );

        System.out.println("Il codice del prodotto è: " + prodotto1.getCodice());
        System.out.println("Il prezzo base è: €" + prodotto1.prezzoBase());
        System.out.println(String.format("Il prezzo finale con IVA è: €%.2f", prodotto1.prezzoConIva()));
        System.out.println("Nome esteso: " + prodotto1.nomeEsteso());
    }
}
