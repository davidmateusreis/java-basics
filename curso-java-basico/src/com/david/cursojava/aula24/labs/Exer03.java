package com.david.cursojava.aula24.labs;

public class Exer03 {
    
    public static void main(String[] args) {
        
        LivroLivraria livro = new LivroLivraria();

        livro.nome = "Mastering ExtJS Second Edition";
        livro.autor = "Loiane Groner";
        livro.qtdDePaginas = 402;
        livro.anoDeLancamento = 2015;
        livro.isbn = "1784390453";
        livro.preco = 63.39;

        System.out.println("O livro " + livro.nome + " da autora " + livro.autor + " foi lançado em " + livro.anoDeLancamento + ", tem " + livro.qtdDePaginas + " páginas, seu ISBN é " + livro.isbn + " e custa só $" + livro.preco +".");
    }
}
