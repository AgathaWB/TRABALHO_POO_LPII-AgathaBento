import java.time.LocalDate;

public class Funcionario {
     private String rg;
    private String escolaridade;
    private String ctps;
    private String nBanco;
    private String cargo;
    private String estadoCivil;
    private String tipoContrato;
    private LocalDate admissao;
    private String salario;
    public Funcionario(String nome, String cpf, String rg2, String escolaridade2, String ctps2, String banco,
            String cargo2, String estadoCivil2, String tipoContrato2, String salario2) {
        //TODO Auto-generated constructor stub
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getEscolaridade() {
        return escolaridade;
    }
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    public String getCtps() {
        return ctps;
    }
    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
    public String getnBanco() {
        return nBanco;
    }
    public void setnBanco(String nBanco) {
        this.nBanco = nBanco;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String getTipoContrato() {
        return tipoContrato;
    }
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    public LocalDate getAdmissao() {
        return admissao;
    }
    public void setAdmissao(LocalDate admissao) {
        this.admissao = admissao;
    }
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }

    
}
