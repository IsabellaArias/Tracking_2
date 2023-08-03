package Exercise10;
import javax.swing.*;
public class Exersice_10 {
    private int votesForCandidate1;
    private int votesForCandidate2;
    private int vote;

    public int getVotesForCandidate1() {
        return votesForCandidate1;
    }

    public void setVotesForCandidate1(int votesForCandidate1) {
        this.votesForCandidate1 = votesForCandidate1;
    }

    public int getVotesForCandidate2() {
        return votesForCandidate2;
    }

    public void setVotesForCandidate2(int votesForCandidate2) {
        this.votesForCandidate2 = votesForCandidate2;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public void collect_Votes() {
        for (int i = 1; i <= 10; i++) {
            String input = JOptionPane.showInputDialog("Voter " + i + ", please choose your candidate:\n1) for Ana Maria Suarez\n2) for Diego Acero");

            // Verificar si el usuario ingresó un valor numérico válido
            try {
                int vote = Integer.parseInt(input);

                if (vote == 1) {
                    votesForCandidate1++;
                } else if (vote == 2) {
                    votesForCandidate2++;
                } else {
                    System.out.println("Invalid vote. Please vote again.");
                    i--; // Repetir el voto para esta persona si fue inválido
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                i--; // Repetir el voto para esta persona si el valor no es numérico
            }
        }
    }

    public String show_Results() {
        String result = "Total votes for Ana Maria Suarez: " + votesForCandidate1 + "\n" +
                "Total votes for Diego Acero: " + votesForCandidate2 + "\n";

        if (votesForCandidate1 > votesForCandidate2) {
            result += "The winner is Ana Maria Suarez!\n" +
                    "The loser is Diego Acero.";
        } else if (votesForCandidate1 < votesForCandidate2) {
            result += "The winner is Diego Acero!\n" +
                    "The loser is Ana Maria Suarez.";
        } else {
            result += "It's a tie!";
        }

        return result;
    }
}
