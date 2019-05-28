
public class TennisGame1 implements TennisGame {

  private int scoreFirstPlayer = 0;
  private int scoreSecondPlayer = 0;
  private String firstPlayer;
  private String secondPlayer;

  public TennisGame1(String firstPlayer, String secondPlayer) {
    this.firstPlayer = firstPlayer;
    this.secondPlayer = secondPlayer;
  }

  public void wonPoint(String playerName) {
    if (playerName == "player1")
      scoreFirstPlayer += 1;
    else
      scoreSecondPlayer += 1;
  }

  public String getScore() {
    String score = "";
    int tempScore = 0;
    if (scoreFirstPlayer == scoreSecondPlayer) {
      switch (scoreFirstPlayer) {
        case 0:
          score = "Love-All";
          break;
        case 1:
          score = "Fifteen-All";
          break;
        case 2:
          score = "Thirty-All";
          break;
        case 3:
          score = "Forty-All";
          break;
        default:
          score = "Deuce";
          break;
      }
    } else if (scoreFirstPlayer >= 4 || scoreSecondPlayer >= 4) {
      int scoreDifference = scoreFirstPlayer - scoreSecondPlayer;
      if (scoreDifference == 1) {
        score = "Advantage player1";
      } else if (scoreDifference == -1) {
        score = "Advantage player2";
      } else if (scoreDifference >= 2) {
        score = "Win for player1";
      } else {
        score = "Win for player2";
      }
    } else {
      for (int i = 1; i < 3; i++) {
        if (i == 1) {
          tempScore = scoreFirstPlayer;
        } else {
          score += "-";
          tempScore = scoreSecondPlayer;
        }
        switch (tempScore) {
          case 0:
            score += "Love";
            break;
          case 1:
            score += "Fifteen";
            break;
          case 2:
            score += "Thirty";
            break;
          case 3:
            score += "Forty";
            break;
        }
      }
    }
    return score;
  }
}