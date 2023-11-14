package exercicio64;

public class ProgramaP {

    public static void main(String args[]) {
        System.out.println(" ");
        PessoaFisica pf1 = new PessoaFisica();
        System.out.println("============Pessoa Fisica===========");
        System.out.println(" ");
    pf1.setNome("Rusvell");
    pf1.setCpf("123");
    pf1.setEmprego("Vendedor");
    pf1.setSalario(1435d);
    pf1.setGenero("Masculino");
    pf1.setIdade(24);
    pf1.setSonho("Viajar o mundo");
        System.out.println("seu nome é: " + pf1.getNome());
        System.out.println("registrado com cpf: " + pf1.getCpf());
        System.out.println("Trabalha como " + pf1.getEmprego() + " ganhando " + pf1.getSalario());
        System.out.println("Genero: " + pf1.getGenero());
        System.out.println("Sua idade é " + pf1.getIdade() + " e seu sonho é " + pf1.getSonho());
        System.out.println(" ");


        System.out.println("============Pessoa Juridica===========");
        System.out.println("");
    PessoaJuridica pj = new PessoaJuridica();
    pj.setNome("Chacon");
    pj.setIdade(24);
    pj.setCnpj("123456");
    pj.setNomeFantasia("Chacon burgueeerr");
    pj.setAreaDeAtuacao("restaurante de hamburguer");
    pj.setFaturamento(1503.40d);
        System.out.println("Nome do dono é " + pj.getNome());
        System.out.println("Sua idade é " + pj.getIdade());
        System.out.println("Nome fantasia: " + pj.getNomeFantasia());
        System.out.println("Um " + pj.getAreaDeAtuacao() + " com faturamento de " + pj.getFaturamento());
    }
}
