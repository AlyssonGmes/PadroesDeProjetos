package br.com.padroes.prototype;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception{

        Autor machado = new Autor("Machado de Assis", "Rua A, Nº 1, Bairro ABC - Rio de Janeiro", 'M', new SimpleDateFormat("dd/MM/yyyy").parse("21/06/1839"), null, null, null, null, null);
        Autor clarice = new Autor("Clarice Lispector", "Rua B, Nº 2, Bairro DEF - Rio de Janeiro", 'F', new SimpleDateFormat("dd/MM/yyyy").parse("10/12/1920"), null, null, null, null, null);
        Autor guimaraes = new Autor("Guimarães Rosa", "Rua C, Nº 3, Bairro GHI - Minas Gerais", 'M', new SimpleDateFormat("dd/MM/yyyy").parse("27/07/1908"), null, null, null, null, null);
        Autor euclides = new Autor("Euclides da Cunha", "Rua D, Nº 4, Bairro JKL - Rio de Janeiro", 'M', new SimpleDateFormat("dd/MM/yyyy").parse("20/01/1866"), null, null, null, null, null);

        Livro m1 = new Livro("Memórias Póstumas de Brás Cubas", machado, 320);
        Livro m2 = new Livro("Dom Casmurro", machado, 210);
        Livro c1 = new Livro("A Hora da Estrela", clarice, 87);
        Livro g1 = new Livro("Grande Sertão: Veredas", guimaraes, 600);
        Livro e1 = new Livro("Os Sertões", euclides, 640);

        Cliente ana = new Cliente("Ana", "Rua da Ana, nº 1, Bairro da Ana - Cidade da Ana", 'F', new SimpleDateFormat("dd/MM/yyyy").parse("10/01/1990"), "000.111.222-33", "0000000-1",  "(79) 99999-9999", null, null, null);
        Cliente bruno = new Cliente("Bruno", "Rua do Bruno, nº 2, Bairro do Bruno - Cidade do Bruno", 'M', new SimpleDateFormat("dd/MM/yyyy").parse("20/02/2000"), "444.555.666-77", "1111111-2",  "(79) 98888-8888", null, null, null);
        Cliente carlos = new Cliente("Carlos", "Rua do Carlos, nº 3, Bairro do Carlos - Cidade do Carlos", 'M', new SimpleDateFormat("dd/MM/yyyy").parse("30/03/2005"), "888.999.000-11", "2222222-3",  "(79) 97777-7777", null, null, null);
        Cliente daniel = new Cliente("Daniel", "Rua do Daniel, nº 4, Bairro do Daniel - Cidade do Daniel", 'M', new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1994"), "065.155.225-33", "1554444-1",  "(79) 99988-9999", null, null, null);

       // machado.verLivros();
        //uso do clone
        Livro m3 = m2.clone();
        Livro m4 = m2.clone();
        Livro m5 = m2.clone();

        m3.setDedicatoria("Boa leitura, Ana! - Machado de Assis");
        m4.setDedicatoria("Com carinho, Paulo! - Machado de Assis");
        m5.setDedicatoria("Um abraço, João! - Machado de Assis!");

        ana.comprarLivro(m3);
        ana.comprarLivro(m4);
        ana.comprarLivro(m5);

        ana.adicionarAoCarrinho(c1);

        ana.verCarrinho();
        ana.verComprados();

    }
}
