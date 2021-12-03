package app;

import questoes.Pessoa;
import questoes.Estacionamento;
import questoes.Elevador;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner l = new Scanner(System.in);
        System.out.println("--------- MENU ---------");
        System.out.println(" ");
        System.out.println("Escolha o programa:");
        System.out.println(" ");
        System.out.println("1 - Pessoa");
        System.out.println("2 - Elevador");
        System.out.println("3 - Estacionamento");
        System.out.println(" ");
        System.out.println("Opção: ");
        String prog = l.next();
        int programa = Integer.parseInt(prog);
        if(programa == 1){
            System.out.println(" ");
            System.out.print("Endereço do arquivo .txt: ");
            String endereco = l.next();
            BufferedReader leitor = new BufferedReader(new FileReader(endereco));
            String nome = leitor.readLine();
            String an = leitor.readLine();
            String al = leitor.readLine();
            int ano = Integer.parseInt(an);
            Float altura = Float.parseFloat(al);
            leitor.close();

            Pessoa pes;
            pes = new Pessoa();
            pes.SetPessoa(nome, ano, altura);  
            pes.GetNome();
            pes.GetNascimento();
            pes.GetAltura();
            pes.Imprimir();
            pes.Idade();

        }else if(programa == 2){
            System.out.println(" ");
            System.out.print("Endereço do arquivo .txt: ");
            String endereco = l.next();
            BufferedReader leitor = new BufferedReader(new FileReader(endereco));
            String cap = leitor.readLine();
            String and = leitor.readLine();
            String at = leitor.readLine();
            String pes = leitor.readLine();
            int capacidade = Integer.parseInt(cap);
            int andares = Integer.parseInt(and);
            int andaratual = Integer.parseInt(at);
            int pessoas = Integer.parseInt(pes);
            leitor.close();

            Elevador el;
            el = new Elevador();
            el.Inicializa(capacidade, andares);
            el.setElevador(andaratual, capacidade, andares, pessoas);
            el.Entra();
            el.Entra();
            el.Entra();
            el.Sai();
            el.Sai();
            el.Sobe();
            el.Sobe();
            el.Desce();
            el.Desce();
            el.Desce();
            el.GetAndarAtual();
            el.GetAndares();
            el.GetCapacidade();
            el.GetPessoas();
            el.Imprimir();

        }else if(programa == 3){
            System.out.println(" ");
            System.out.print("Endereço do arquivo .txt: ");
            String endereco = l.next();
            BufferedReader leitor = new BufferedReader(new FileReader(endereco));
            String modelo = leitor.readLine();
            String placa = leitor.readLine();
            String ent = leitor.readLine();
            String sai = leitor.readLine();
            Float entrada = Float.parseFloat(ent);
            Float saida = Float.parseFloat(sai);
            leitor.close();

            Estacionamento es;
            es = new Estacionamento();
            es.Inicializa();
            es.SetCarro(placa, modelo, entrada, saida);
            es.GetEntrada();
            es.GetSaida();
            es.GetModelo();
            es.GetPlaca();
            System.out.println("Dados do carro:");
            es.Imprimir();
            System.out.println("Valor a ser pago: ");
            es.Pagar();

        }else{
            System.out.println("Número Invalido");
        }
        l.close();
    }
}
