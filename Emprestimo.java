import java.time.LocalDate;
import java.util.List;

public class Emprestimo {
    private Pessoa cliente;
    private String senha;
    private List<Livro> livro;
    private LocalDate emprestimo;
    private LocalDate devoluDate;
    private String hitorico;//historico de emprestimos;
    private Funcionario qmEmprestou;

    public Pessoa getCliente() {
        return cliente;
    }
    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public List<Livro> getLivro() {
        return livro;
    }
    public void setLivro(List<Livro> livro) {
        this.livro = livro;
    }
    public LocalDate getEmprestimo() {
        return emprestimo;
    }
    public void setEmprestimo(LocalDate emprestimo) {
        this.emprestimo = emprestimo;
    }
    public LocalDate getDevoluDate() {
        return devoluDate;
    }
    public void setDevoluDate(LocalDate devoluDate) {
        this.devoluDate = devoluDate;
    }
    public String getHitorico() {
        return hitorico;
    }
    public void setHitorico(String hitorico) {
        this.hitorico = hitorico;
    }
    public Funcionario getQmEmprestou() {
        return qmEmprestou;
    }
    public void setQmEmprestou(Funcionario qmEmprestou) {
        this.qmEmprestou = qmEmprestou;
    }

    
}
