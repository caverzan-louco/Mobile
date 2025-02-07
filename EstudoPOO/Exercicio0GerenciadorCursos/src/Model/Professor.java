package Model;

public class Professor extends Pessoa {
    //atributos - privado
    private double salario;

    //métodos - públicos
    //construtor
    public Professor(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }
    //getters and setters

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override //exibirInformações
    public void exibirInformações(){
        super.exibirInformações();
        System.out.println("Salario: "+getSalario());
    }




}
