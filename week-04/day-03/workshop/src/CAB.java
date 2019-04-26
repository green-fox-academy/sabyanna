import java.util.ArrayList;

public class CAB {

  public static void main(String[] args) {

  }

  int randomWithRange(int min, int max) {
    int range = (max - min) + 1;
    return (int)(Math.random() * range) + min;
  }

  enum stateOfGame {playing, finished};

  public CAB(){
    goalInt = randomWithRange(0, 9999);
  }

  public CAB(int goalInt) {
    this.goalInt = goalInt;
  }


  stateOfGame state;
  int goalInt; //randomWithRange(0, 10);
  int counter = 1;

  public ArrayList getGoal(Integer input){
    String inputString = Integer.toString(input);
    ArrayList goal = new ArrayList();
    for (int i = 0; i < inputString.length(); i++) {
      goal.add(String.valueOf(inputString.charAt(i)));
    }
    return goal;
  }

  public String guess(String theGuess){
    ArrayList toGuess = getGoal(goalInt);
    int cows = 0;
    int bulls = 0;
    ArrayList guess = new ArrayList();
    for (int i = 0; i < theGuess.length(); i++ ) {
      guess.add(theGuess.charAt(i));
    }
    for (int i = 0; i < theGuess.length(); i++) {
      if (guess.get(i).equals(toGuess.get(i))){
        cows++;
      } else {
        for (int j = 0; j < theGuess.length(); j++) {
          if (guess.get(i).equals(toGuess.get(j))) {
            bulls++;
          }
        }
      }
    }
    return "Cows: " + cows + ", Bulls: " + bulls;
  }
}
