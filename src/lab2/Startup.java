/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Michael
 */
public class Startup {
    public static void main(String[] args) {
        Game game = new Game();
        GameWorld world = new GameWorld();
        
        game.setNumPlayers(1);
        game.setDifficulty("easy");
        game.setTimeLimit(50);
       
        world.setMapName("Dark Star");
        world.setWeather("Wormhole Travel");
        world.setCheats("On");
        
        System.out.println("GAME SETTINGS");
        System.out.println("Players : " + game.getNumPlayers());
        System.out.println("Difficulty : " + game.getDifficulty());
        System.out.println("Time Limit : " + game.getTimeLimit());
        System.out.println("");
        System.out.println("GAME WORLD SETTINGS");
        System.out.println("Map Name : " + world.getMapName());
        System.out.println("Weather : " + world.getWeather());
        System.out.println("Cheats : " + world.getCheats());
    }
}
