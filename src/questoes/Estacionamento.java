package questoes;

public class Estacionamento {

    String placa, modelo;
    float entrada, saida;
    float tempo;
    float valor;
    float preco=(float) 1.50;

    public void Inicializa() {
        this.entrada = 0;
        this.saida = 0;
        this.placa = "";
        this.modelo = "";
    }

    public void SetCarro(String placa, String modelo, Float entrada, Float saida) {
        this.entrada = entrada;
        this.saida = saida;
        this.placa = placa;
        this.modelo = modelo;
    }

    public void Imprimir() {
        System.out.println(""+this.modelo);
        System.out.println(""+this.placa);
        System.out.println(""+this.entrada);
        System.out.println(""+this.saida);
    }

    public float GetEntrada() {
        return entrada;
    }

    public float GetSaida() {
        return saida;
    }

    public String GetPlaca() {
        return placa;
    }

    public String GetModelo() {
        return modelo;
    }

    public void Pagar() {
        this.tempo = saida-entrada;
        int tem = Math.round(this.tempo);;
        this.valor = tem*preco;
        String va = ""+valor;
        System.out.print(""+va);
    }

}


