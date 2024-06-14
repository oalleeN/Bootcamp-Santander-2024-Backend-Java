package application;

import entities.IPhone;

public class Program {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Stairway to Heaven");
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
