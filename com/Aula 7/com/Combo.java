package com;

public class Combo {
    private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;
    private Produto produto;
    private int gramas, Ml;
    private String tamanho;

    public Combo(){
        burguer = new Burguer();
        sobremesa = new Sobremesa();
        bebida = new Bebida();
        produto = new Produto();
    }

    public void criarCombo(int escolha){
        switch (escolha) {
            case 1:
                gramas = 90;
                Ml = 350;
                tamanho = "Sorvete";
                burguer.criarBurguer(gramas);
                bebida.criarBebida(Ml);
                sobremesa.criarSobremesa(tamanho);
                break;
            case 2:
                gramas = 180;
                Ml = 2000;
                tamanho = "Bolo";
                burguer.criarBurguer(gramas);
                bebida.criarBebida(Ml);
                sobremesa.criarSobremesa(tamanho);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        precoCombo(escolha);
    }

    public void precoCombo(int escolha){

        switch (escolha) {
            case 1:
                produto.descricao(33, escolha);
                break;
            case 2:
                produto.descricao(50, escolha);
                break;
            default:
                break;
        }
    }
}
