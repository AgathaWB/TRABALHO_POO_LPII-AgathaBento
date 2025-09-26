import java.util.List;

public class Livro {
    private String nome;
    private String editora;
    private List<Autor> autor; //pode ter mais de um
    private int qtdPagina;
    private boolean disponibilidade;
    private int qtdExemplar;// na biblioteca
    private String idioma;
    private String sinopse;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public List<Autor> getAutor() {
        return autor;
    }
    public void setAutor(List<Autor> autor) {
        this.autor = autor;
    }
    public int getQtdPagina() {
        return qtdPagina;
    }
    public void setQtdPagina(int qtdPagina) {
        this.qtdPagina = qtdPagina;
    }
    public boolean isDisponibilidade() {
        return disponibilidade;
    }
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    public int getQtdExemplar() {
        return qtdExemplar;
    }
    public void setQtdExemplar(int qtdExemplar) {
        this.qtdExemplar = qtdExemplar;
    }
    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    
}
