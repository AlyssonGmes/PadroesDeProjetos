package br.com.padroes.proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("┌————————————————————————┐");
        System.out.println("│ Contador de caracteres │");
        System.out.println("└————————————————————————┘");
        ILeitor n = new LeitorCheck();
        n.lerTexto("Especular, Jato, Metralhadora, Plano, Seca, Política, Ele pegou frio, Surfe, Submergir, Fantasia");
        n.listarPalavras();
    }
}
