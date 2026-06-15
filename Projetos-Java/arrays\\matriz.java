import java.util.Scanner;

public class notas {
    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[50][10];
        double[] medias = new double[50];

        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        double maiorMedia = 0;
        double menorMedia = 10;

        int alunoMaior = 0;
        int alunoMenor = 0;

        double somaGeral = 0;

        for (int i = 0; i < notas.length; i++) {

            for (int j = 0; j < notas[i].length; j++) {

                System.out.println("Digite a nota do aluno " + (i + 1));
                System.out.println("Disciplina " + (j + 1) + ":");

                notas[i][j] = sc.nextDouble();

                medias[i] += notas[i][j];
                somaGeral += notas[i][j];
            }

            medias[i] /= 10; // calcula a média do aluno

            // maior média
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                alunoMaior = i;
            }

            // menor média
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                alunoMenor = i;
            }

            // situação do aluno
            if (medias[i] >= 7) {
                aprovados++;
            } else if (medias[i] >= 5) {
                recuperacao++;
            } else {
                reprovados++;
            }
        }

        double mediaGeral = somaGeral / (50 * 10);

        System.out.println("\n===== RELATÓRIO =====");

        System.out.println("Quantidade de aprovados: " + aprovados);
        System.out.println("Quantidade de recuperação: " + recuperacao);
        System.out.println("Quantidade de reprovados: " + reprovados);

        System.out.println("Aluno com maior média: " + (alunoMaior + 1) +
                           " (" + maiorMedia + ")");

        System.out.println("Aluno com menor média: " + (alunoMenor + 1) +
                           " (" + menorMedia + ")");

        System.out.println("Média geral da turma: " + mediaGeral);

        System.out.print("Alunos acima da média geral: ");

        for (int i = 0; i < medias.length; i++) {
            if (medias[i] > mediaGeral) {
                System.out.print((i + 1) + " ");
            }
        }

        sc.close();
    }
}
