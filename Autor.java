public class Autor {
    private String nome;
    private String nascionalidade;
    private int qtdLivroBi; //qtd de livros dele na biblioteca
    private String identificadorAutoridade;//*Biblioteca
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNascionalidade() {
        return nascionalidade;
    }
    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }
    public int getQtdLivroBi() {
        return qtdLivroBi;
    }
    public void setQtdLivroBi(int qtdLivroBi) {
        this.qtdLivroBi = qtdLivroBi;
    }
    public String getIdentificadorAutoridade() {
        return identificadorAutoridade;
    }
    public void setIdentificadorAutoridade(String identificadorAutoridade) {
        this.identificadorAutoridade = identificadorAutoridade;
    }
    

    
}
