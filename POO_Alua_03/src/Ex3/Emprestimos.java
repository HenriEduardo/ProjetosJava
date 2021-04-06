package Ex3;

import java.text.SimpleDateFormat;

public class Emprestimos {

    int id;
    String usuario;
    Livro livro;
    Usuario user;
    SimpleDateFormat dataEmprestimo;
    SimpleDateFormat dataDevolucao;

    public void novo(Usuario u) {
        if (livro.disponivel==true){
            livro.disponivel=false;
            user=u;
        }
    }

    public void devolucao(){
        if (livro.disponivel==false){
            livro.disponivel=true;
        }
    }

}
