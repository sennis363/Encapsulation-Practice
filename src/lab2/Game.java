/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Michael
 */
public class Game {
    private int numPlayers;
    private String difficulty;
    private int timeLimit;

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        //this "if" is here in case the user wanted to define the number of
        //players, but of course this is not implemented
        if (numPlayers >= 1 || numPlayers <= 4)
        this.numPlayers = numPlayers;
        else
            numPlayers = 1;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        if(numPlayers >= 1) {
            difficulty = "easy";
           this.difficulty = difficulty;
        } else {
            throw new IllegalStateException("Sorry, you must select the "
                    + "number of players first.");
        }
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        if(difficulty == "easy") {
            timeLimit = 50;
           this.timeLimit = timeLimit;
        } else {
            throw new IllegalStateException("Sorry, you must select the "
                    + "difficulty before setting the time.");
    }
    
}
}