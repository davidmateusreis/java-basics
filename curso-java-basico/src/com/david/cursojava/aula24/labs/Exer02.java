package com.david.cursojava.aula24.labs;

public class Exer02 {
    
    public static void main(String[] args) {
        
        Livro livro = new Livro();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.qtdDePaginas = 358;
        livro.anoDeLancamento = 2015;
        livro.isbn = "1782164006";

        System.out.println("O livro " + livro.nome + " da autora " + livro.autor + " foi lançado em " + livro.anoDeLancamento + ", tem " + livro.qtdDePaginas + " páginas e seu ISBN é " + livro.isbn +".");
    }
}
