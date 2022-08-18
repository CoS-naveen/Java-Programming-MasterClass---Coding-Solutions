package Section;


//play if the temperature is between 25 and 35 (inclusive). 
//Unless it is summer, then the upper limit is 45 (inclusive) instead of 35


public class PlayingCat {
    public static boolean isCatPlaying(boolean summer,int temperature){
        if(summer==false&&(temperature>=25 && temperature<=35)||
        (summer==true && (temperature>=25 && temperature<=45))){
            return true;
        }
        return false;
    }
}