/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Michael
 */
public class FakeGUI {
    private String move;
    private String attack;
    private String defend;

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        move = "2 spaces foward";
        this.move = move;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        if(move == "2 spaces foward") {
            attack = "Ninja Chop";
           this.attack = attack;
        } else {
            throw new IllegalStateException("Sorry, you must move first.");
        }
    }

    public String getDefend() {
        return defend;
    }

    public void setDefend(String defend) {
        if(attack == "Ninja Chop") {
            defend = "Turtle Shield";
           this.defend = defend;
        } else {
            throw new IllegalStateException("Sorry, you must attack before "
                    + "you can defend.");
        }
    }
    
}
