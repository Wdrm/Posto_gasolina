import javax.sound.midi.Soundbank;
import java.util.Scanner;

// exer um posto esta vende combustivel
// informe quantos litros vai abastecer
// > 25 litros tem um percentual maior desconto
//< 25 litros tbm tem um percentual desconto
public class RodaAplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------"+"Rede de Postos Machado"+"----------\n"+
                "----------"+"Informe Abastecimento"+"----------\n" +
                "----------"+"1 Gasolina"+"----------\n"+
                "----------"+"2 Álcool"+"----------\n");
                int opcao = sc.nextInt();

                if (opcao < 1 || opcao >3 ) {
                    System.out.println("Opção Invalida:");
                }else{

        switch (opcao) {
            case 1:
                Promocao promocao = new Promocao();
                promocao.gasolina();
                break;
            case 2:
                Promocao prom = new Promocao();
                prom.alcool();
                break;


        }

        }







    }
}