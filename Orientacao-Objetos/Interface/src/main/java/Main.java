import interfaces.Enderecavel;
import pojo.Carta;

public class Main {

    public static void main(String[] args) {

        Carta carta = new Carta(1, "RJ - Niteroi", "RS - Porto Alegre", "Olá, quanto tempo?");

        gerarEtiquetaDeRastreamento(carta);
    }

    public static void gerarEtiquetaDeRastreamento(Enderecavel enderecavel) {

        System.out.println("ID: " + enderecavel.getIdentificador() +
                "\nORIGEM: " + enderecavel.getCidadeOrigem() +
                "\nDESTINO: " + enderecavel.getCidadeDestino()
        );
    }
}
