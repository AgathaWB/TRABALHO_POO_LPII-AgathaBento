import java.util.List;

public class Biblioteca {
    private String nome;
    private String cnpj;
    private String endereco;
    private List<Livro> livros;
    private List<Autor> autores;
    private List<Funcionario> funcionarios;
    private List<Pessoa> cliente; 
    private String horarioFuncionamento;
    private List<Emprestimo> emprestimo;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    public List<Autor> getAutores() {
        return autores;
    }
    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    public List<Pessoa> getCliente() {
        return cliente;
    }
    public void setCliente(List<Pessoa> cliente) {
        this.cliente = cliente;
    }
    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }
    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }
    public List<Emprestimo> getEmprestimo() {
        return emprestimo;
    }
    public void setEmprestimo(List<Emprestimo> emprestimo) {
        this.emprestimo = emprestimo;
    }

    
}
