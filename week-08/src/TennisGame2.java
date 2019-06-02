
public class TennisGame2 implements TennisGame {
  public int scoreFirstPlayer = 0;
  public int scoreSecondPlayer = 0;

  public String P1res = "";
  public String P2res = "";
  private String firstPlayer;
  private String secondPlayer;

  public TennisGame2(String player1Name, String player2Name) {
    this.firstPlayer = player1Name;
    this.secondPlayer = player2Name;
  }

  public String getScore() {
    String score = "";
    int scoreDifference = scoreFirstPlayer - scoreSecondPlayer;
    if (scoreFirstPlayer == scoreSecondPlayer) {
      if (scoreSecondPlayer < 4) {
        score = getOnePlayerScore(scoreFirstPlayer) + "-All";
      } else {
        score = "Deuce";
      }
    } else if (scoreFirstPlayer < 4 && scoreSecondPlayer < 4) {
      score = getOnePlayerScore(scoreFirstPlayer) + "-" + getOnePlayerScore(scoreSecondPlayer);
    } else if (scoreDifference >= 2) {
      score = "Win for player1";
    } else if (scoreDifference <= -2){
      score = "Win for player2";
    } else if (scoreFirstPlayer > scoreSecondPlayer && scoreSecondPlayer >= 3) {
      score = "Advantage player1";
    } else if (scoreSecondPlayer > scoreFirstPlayer && scoreFirstPlayer >= 3) {
      score = "Advantage player2";
    }
    return score;
  }

  public void SetP1Score(int number) {

    for (int i = 0; i < number; i++) {
      P1Score();
    }

  }

  public void SetP2Score(int number) {

    for (int i = 0; i < number; i++) {
      P2Score();
    }

  }

  public void P1Score() {
    scoreFirstPlayer++;
  }

  public void P2Score() {
    scoreSecondPlayer++;
  }

  public void wonPoint(String player) {
    if (player == "player1")
      P1Score();
    else
      P2Score();
  }

  public String getOnePlayerScore(int scoreInNum) {
    String scoreInTxt = "";
    switch (scoreInNum) {
      case 0:
        scoreInTxt = "Love";
        break;
      case 1:
        scoreInTxt = "Fifteen";
        break;
      case 2:
        scoreInTxt = "Thirty";
        break;
      case 3:
        scoreInTxt = "Forty";
        break;
    }
    return scoreInTxt;
  }
}