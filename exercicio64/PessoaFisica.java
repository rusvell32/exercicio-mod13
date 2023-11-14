package exercicio64;

public class PessoaFisica extends Pessoa{

    private String cpf;
    private String genero;
    private String sonho;
    private String emprego;
    private Double salario;



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSonho() {
        return sonho;
    }

    public void setSonho(String sonho) {
        this.sonho = sonho;
    }

    public String getEmprego() {
        return emprego;
    }

    public void setEmprego(String emprego) {
        this.emprego = emprego;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
