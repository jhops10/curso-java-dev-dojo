package academy.devdojo.maratonajava.introducao;
/*

Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>.

*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "José da Silva";
        String endereco = "Rua das Bromélias";
        double salario = 3500.00;
        String data = "18/01/2024";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de R$ " + salario + " na data " + data);

    }
}
