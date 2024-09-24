public class GeradorEtiqueta {
    public static String maximoCaracter(String descricao){
        String descricaoIdeal = "";
        for(int i = 0; i < 22; i++){
            Character c = descricao.charAt(i);
            descricaoIdeal += c;
        }
        return  descricaoIdeal;
    }
    public static String gerarEtiqueca(Produto produto){
        if(produto.getDescricao().length() > 22){
            produto.setDescricao(maximoCaracter(produto.getDescricao()));
        }
        return "^XA\n" +
                "^CF0,60\n" +
                "^FO50,50^FD"+produto.getDescricao()+"^FS\n" +
                "^CFA,50\n" +
                "^FO50,200^FDLata        "+"R$ "+produto.getPrecoLata()+"^FS\n" +
                "^FO50,280^FDCaixa       "+"R$ "+produto.getPrecoCaixa()+"^FS\n" +
                "^BY5,2,270\n" +
                "^FO100,450^BC^FD"+produto.getCodigoBarras()+"^FS\n" +
                "^XZ";
    }
}