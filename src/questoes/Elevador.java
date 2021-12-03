package questoes;

public class Elevador {

    int andaratual;
    int capacidade, andares, pessoas;

    public void Inicializa(int capacidade, int andares) {
        this.capacidade = capacidade;
        this.andares = andares;
        this.pessoas = 0;
        this.andaratual = 0;
    }

    public void Entra() {
        if(pessoas<capacidade){
            pessoas+=1;
        }else{
            System.out.println("O elevador esta cheio");
        }
    }

    public void Sai() {
        if(pessoas!=0){
            pessoas-=1;
        }else{
            System.out.println("O elevador esta vazio");
        }
    }

    public void Sobe() {
        if(andaratual<andares){
            andaratual+=1;
        }else{
            System.out.println("O elevador esta no ultimo andar");
        }
    }

    public void Desce() {
        if(andaratual!=0){
            andaratual-=1;
        }else{
            System.out.println("O elevador esta no terreo");
        }
    }

    public void setElevador(int andaratual, int capacidade, int andares, int pessoas) {
        this.andaratual = andaratual;
        this.capacidade = capacidade;
        this.andares = andares;
        this.pessoas = pessoas;
    }

    public void Imprimir() {
        System.out.println("Dados do Elevador:");
        System.out.println("");
        System.out.println("Capacidade maxima: "+capacidade);
        System.out.println("Quantidade de andares: "+andares);
        System.out.println("Andar atual: "+andaratual);
        System.out.println("Quantidade de pessoas: "+pessoas);
    }

    public int GetAndarAtual() {
        return andaratual;
    }

    public int GetCapacidade() {
        return capacidade;
    }

    public int GetPessoas() {
        return pessoas;
    }

    public int GetAndares() {
        return andares;
    }
}
