package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 1000000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        String nome = "João Paulo"; //String não é um tipo primitivo, é uma classe.

        System.out.println("A minha idade é: " + idade + " anos.");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("Olá, meu nome é: " + nome);
    }
}
