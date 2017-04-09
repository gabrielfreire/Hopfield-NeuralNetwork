/**
 * Created by Gabriel Freire on 09/04/2017.
 * Transformation from 0 to -1 class
 */
public class Utils {

    public static double[] transform(double[] pattern){
        for(int i = 0; i < pattern.length; i++){
            if( pattern[i] == 0 ){
                pattern[i] = -1;
            }
        }
        return pattern;
    }

}
