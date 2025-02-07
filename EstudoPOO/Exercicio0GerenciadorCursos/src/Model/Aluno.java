package Model;

public class Aluno extends Pessoa implements Avaliavel{
    //encapsulameto 
    //atributos - privado
    private String matricula;
    private double nota;
    
    //métodos - público
    //construtos
    public Aluno(String nome, String cpf, String matricula, double nota) {
        super(nome, cpf);
        this.matricula = matricula;
        this.nota = nota;
    }
    //getters and setters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    @Override //exibirInformações - polimorfismo
    public void exibirInformações() {
        super.exibirInformações();
        System.out.println("Matricula: "+getMatricula());
        System.out.println("Nota: "+getNota());
    }
    //incluir o método abstrato avaliarDesenpenho
    @Override
    public void avaliarDesenprenho(){
        if (nota >=6) {
            System.out.println("Aluno APROVADO");
        } else{
            System.out.println("Aluno REPROVADO");
        }
        
    }
    
}
