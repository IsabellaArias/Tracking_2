package Exercise12;

public class Exercise_12 {
    private String team_name_1;
    private String team_name_2;
    private int scoreboard_1;
    private int scoreboard_2;
    private String date_1;
    private String date_2;
    private String date_3;
    private int team1TotalScore;
    private int team2TotalScore;

    public String getTeam_name_1() {
        return team_name_1;
    }

    public void setTeam_name_1(String team_name_1) {
        this.team_name_1 = team_name_1;
    }

    public String getTeam_name_2() {
        return team_name_2;
    }

    public void setTeam_name_2(String team_name_2) {
        this.team_name_2 = team_name_2;
    }

    public int getScoreboard_1() {
        return scoreboard_1;
    }

    public void setScoreboard_1(int scoreboard_1) {
        this.scoreboard_1 = scoreboard_1;
    }

    public int getScoreboard_2() {
        return scoreboard_2;
    }

    public void setScoreboard_2(int scoreboard_2) {
        this.scoreboard_2 = scoreboard_2;
    }

    public String getDate_1() {
        return date_1;
    }

    public void setDate_1(String date_1) {
        this.date_1 = date_1;
    }

    public String getDate_2() {
        return date_2;
    }

    public void setDate_2(String date_2) {
        this.date_2 = date_2;
    }

    public String getDate_3() {
        return date_3;
    }

    public void setDate_3(String date_3) {
        this.date_3 = date_3;
    }

    public int getTeam1TotalScore() {
        return team1TotalScore;
    }

    public void setTeam1TotalScore(int team1TotalScore) {
        this.team1TotalScore = team1TotalScore;
    }

    public int getTeam2TotalScore() {
        return team2TotalScore;
    }

    public void setTeam2TotalScore(int team2TotalScore) {
        this.team2TotalScore = team2TotalScore;
    }

    public void calculate_Ranking() {
        team1TotalScore = scoreboard_1;
        team2TotalScore = scoreboard_2;
    }

    public void dates() {
        System.out.println("The first date is: " + date_1);
        System.out.println("The second date is: " + date_2);
        System.out.println("The third date is: " + date_3);
    }

    public String show_Ranking() {
        System.out.println("Ranking of teams:");
        System.out.println(team_name_1 + ": " + team1TotalScore + " points");
        System.out.println(team_name_2 + ": " + team2TotalScore + " points");
        return null;
    }
}
