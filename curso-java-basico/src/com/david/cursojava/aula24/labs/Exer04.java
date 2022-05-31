package com.david.cursojava.aula24.labs;

import java.util.Date;

public class Exer04 {
    
    public static void main(String[] args) {
        
        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.nome = "Ext Js 4 First Look";
        livro.autor = "Loiane Groner";
        livro.qtdDePaginas = 340;
        livro.anoDeLancamento = 2011;
        livro.isbn = "1849516669";

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "David Mateus";
        

        System.out.println("O livro " + livro.nome + " da autora " + livro.autor + " foi lançado em " + livro.anoDeLancamento + ", tem " + livro.qtdDePaginas + " páginas, seu ISBN é " + livro.isbn + ", ele está emprestado? " + livro.emprestado + ", para " + livro.emprestadoA + " e a data de entrega está marcada para " + livro.dataEntrega + ".");
    }
}
