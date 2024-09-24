public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("CERVEJA DA BOA CERVEJA DA BOA",30.0,300.0,"DSGS4987");
        String etiquetaZPL = GeradorEtiqueta.gerarEtiqueca(produto);

        System.out.println(etiquetaZPL);
    }
}