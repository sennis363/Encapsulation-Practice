/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Michael
 */
public class GameWorld {
    private String mapName;
    private String weather;
    private String cheats;

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        mapName = "Dark Star";
        this.mapName = mapName;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        if(mapName == "Dark Star") {
            weather = "Wormhole Travel";
           this.weather = weather;
        } else {
            throw new IllegalStateException("Sorry, you must select the "
                    + "map name first.");
        }
    }

    public String getCheats() {
        return cheats;
    }

    public void setCheats(String cheats) {
        if (weather == "Wormhole Travel") {
            cheats = "On";
        this.cheats = cheats;
    }else {
            throw new IllegalStateException("Sorry, you must set the "
                    + "weather first.");
        }
}
}