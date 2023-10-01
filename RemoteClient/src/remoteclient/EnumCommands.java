/*
 * Author: VETRIVEL M
 * Email: vetrivel.offl@gmail.com,vettikizhi@gmail.com
 * Please do not remove the above lines
 */


package remoteclient;

/**
 * Used to represent commands which can be sent by the server
 */
public enum EnumCommands {
    PRESS_MOUSE(-1),
    RELEASE_MOUSE(-2),
    PRESS_KEY(-3),
    RELEASE_KEY(-4),
    MOVE_MOUSE(-5);

    private int abbrev;

    EnumCommands(int abbrev){
        this.abbrev = abbrev;
    }
    
   public int getAbbrev(){
        return abbrev;
    }
}