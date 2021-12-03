package questoes;

public class Pessoa {

    private String nome;
    private int nascimento;
    private float altura;

    public void SetPessoa(String nome, int ano, float altura) {
        this.nome = nome;
        this.nascimento = ano;
        this.altura = altura;
    }

    public String GetNome() {
        return nome;
    }

    public int GetNascimento() {
        return nascimento;
    }

    public float GetAltura() {
        return altura;
    }

    public void Imprimir() {
        System.out.println("Dados da Pessoa:");
        System.out.println(""+nome);
        System.out.println(""+nascimento);
        System.out.println(""+altura);
    }

    public void Idade() {
        System.out.print("Idade da Pessoa: ");
        int idade = 2021 - this.nascimento;
        System.out.println(""+idade);
    }

}

