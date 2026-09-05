import java.util.Random;

public class GeradorEstoico {
    public static void main(String[] args) {
        String[] citacoes = {
            "Você tem poder sobre sua mente - não sobre eventos externos. Perceba isso e você encontrará força. - Marco Aurélio",
            "Nós sofremos mais frequentemente na imaginação do que na realidade. - Sêneca",
            "O homem que sofre antes de ser necessário, sofre mais que o necessário. - Sêneca",
            "Primeiro diga a si mesmo o que você seria; e então faça o que tem que fazer. - Epicteto",
            "A melhor vingança é ser diferente daquele que causou o dano. - Marco Aurélio"
        };

        Random random = new Random();
        int index = random.nextInt(citacoes.length);

        System.out.println("==========================================");
        System.out.println("  Sua Reflexão Estoica do Dia:");
        System.out.println("==========================================");
        System.out.println(citacoes[index]);
        System.out.println("==========================================");
    }
}