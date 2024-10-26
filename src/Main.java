public class Main {
    public static void main(String[] args) {

        Trabalhador betti = new Trabalhador("betti", "123.456.789-00", 30, 28, 300, 35, 50);

        Trabalhador mica = new Trabalhador("mica", "987.654.321-00", 30, 28, 300, 35, 50);

        betti.printarNaTelaOTrabalhador();
        System.out.println("---------------------------------------------------------------------------------------------");
        mica.printarNaTelaOTrabalhador();
    }
}