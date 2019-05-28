
public class TennisGame3 implements TennisGame {

  private int scoreSecondPlayer;
  private int scoreFirstPlayer;
  private String firstPlayer;
  private String secondPlayer;

  public TennisGame3(String p1N, String p2N) {
    this.firstPlayer = p1N;
    this.secondPlayer = p2N;
  }

  public String getScore() {
    String score;
    if (scoreFirstPlayer < 4 && scoreSecondPlayer < 4) {
      String[] scoresOfOnePlayer = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
      score = scoresOfOnePlayer[scoreFirstPlayer];
      return (scoreFirstPlayer == scoreSecondPlayer) ? score + "-All" : score + "-" + scoresOfOnePlayer[scoreSecondPlayer];
    } else {
      if (scoreFirstPlayer == scoreSecondPlayer)
        return "Deuce";
      score = scoreFirstPlayer > scoreSecondPlayer ? firstPlayer : secondPlayer;
      return ((scoreFirstPlayer - scoreSecondPlayer)*(scoreFirstPlayer - scoreSecondPlayer) == 1) ? "Advantage " + score : "Win for " + score;
    }
  }

  public void wonPoint(String playerName) {
    if (playerName == "player1")
      this.scoreFirstPlayer += 1;
    else
      this.scoreSecondPlayer += 1;

  }

}